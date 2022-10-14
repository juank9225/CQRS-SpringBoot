package com.banking.account.common.events;

import com.banking.account.common.dto.AccountType;
import com.banking.cqrs.core.events.BaseEvents;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class AccountOpenedEvent extends BaseEvents {
    private String accountHolder;
    private AccountType accountType;
    private Date createdDate;
    private double openingBalane;
}
