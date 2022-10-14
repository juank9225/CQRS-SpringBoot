package com.banking.account.cmd.api.command;

public interface CommandHandler {
    void handle(OpenAccountCommand command);
    void handle(DepositFundsCommand command);
    void handle(WithdrawFundsCommad commad);
    void handle(CloseAccountCommand command);
}
