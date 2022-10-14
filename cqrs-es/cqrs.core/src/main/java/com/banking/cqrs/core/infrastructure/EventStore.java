package com.banking.cqrs.core.infrastructure;

import com.banking.cqrs.core.events.BaseEvents;

import java.util.List;

public interface EventStore {
    void saveEvents(String aggregateId, Iterable<BaseEvents> events,int expectedVersion);
    List<BaseEvents> getEvent(String aggregateId);
}
