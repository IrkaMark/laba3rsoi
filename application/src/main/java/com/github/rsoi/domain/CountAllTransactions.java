package com.github.rsoi.domain;

public class CountAllTransactions {
    String name;
    double moneyall;
    int alltransactions;

    public CountAllTransactions(String name, double moneyall, int alltransactions) {
        this.name = name;
        this.moneyall = moneyall;
        this.alltransactions = alltransactions;
    }

    public String getName() {
        return name;
    }

    public double getMoneyall() {
        return moneyall;
    }

    public int getAlltransactions() {
        return alltransactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoneyall(double moneyall) {
        this.moneyall = moneyall;
    }

    public void setAlltransactions(int alltransactions) {
        this.alltransactions = alltransactions;
    }
}
