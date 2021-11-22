package com.salmon.spicysalmon;

public class BankAccount {
    private final int accountNumber;
    private final String customerFirstName;
    private final String customerLastName;
    private double balance;

    public BankAccount(int accountNumber, String customerFirstName, String customerLastName) {
        this.accountNumber = accountNumber;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.balance = 0.00;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
