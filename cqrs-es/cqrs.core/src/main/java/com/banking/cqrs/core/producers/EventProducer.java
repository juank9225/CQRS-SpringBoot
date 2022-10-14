package com.banking.cqrs.core.producers;

import com.banking.cqrs.core.events.BaseEvents;

public interface EventProducer {
    void produce(String topic, BaseEvents events);
}
