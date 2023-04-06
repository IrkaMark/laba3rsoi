package com.github.rsoi.domain;

import java.time.LocalDate;
public class Transaction {
    public int ID;
    public  String IDname;
    public double money;
    LocalDate data;


    public Transaction(Integer ID, String IDname, double money, LocalDate data) {
        this.ID = ID;
        this.IDname = IDname;
        this.money = money;
        this.data = data;
    }

    public Transaction() {}

    @Override
    public String toString() {
        return "Transaction{" +
                "ID=" + ID +
                ", IDname='" + IDname  +
                ", money=" + money +
                ", data=" + data +
                '}';
    }
}
