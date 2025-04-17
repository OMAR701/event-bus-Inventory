package org.example.inventorymanagementsystem.domain.service.Implementation;

import org.example.inventorymanagementsystem.domain.service.EventBusService;
import org.example.inventorymanagementsystem.infrastructure.event.listener.InventoryEventListener;
import org.example.inventorymanagementsystem.infrastructure.event.model.InventoryEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.EventListener;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

@Service
public class SpringEventBus implements EventBusService {

    private final ApplicationEventPublisher eventPublisher;
    private final Map<String, Set<EventListener>> subscribers = new ConcurrentHashMap<>();

    public SpringEventBus(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Override
    public void publishEvent(InventoryEvent event) {
        if (event == null) {
            throw new IllegalArgumentException("Event cannot be null");
        }
        eventPublisher.publishEvent(event);
        subscribers.getOrDefault(event.getClass().getSimpleName(), Set.of())
                .forEach(listener -> {
                    if (listener instanceof InventoryEventListener) {
                        ((InventoryEventListener) listener).handleInventoryEvent(event);
                    }
                });
    }

    @Override
    public void subscribe(String topic, EventListener listener) {
        if (topic == null || topic.isBlank()) {
            throw new IllegalArgumentException("Topic cannot be null or blank");
        }
        if (listener == null) {
            throw new IllegalArgumentException("Listener cannot be null");
        }
        subscribers.computeIfAbsent(topic, k -> new CopyOnWriteArraySet<>()).add(listener);
    }
}
