package com.banking.account.common.events;

import com.banking.cqrs.core.events.BaseEvents;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class FundsWithdrawnEvent extends BaseEvents {
    private double amount;
}
