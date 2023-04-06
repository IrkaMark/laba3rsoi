package com.github.rsoi.domain;


public class Result {

    String nameres;
    double countres;
    int cashbackres;


    public Result(String nameres, double countres, int cashbackres) {
        this.nameres = nameres;
        this.countres = countres;
        this.cashbackres = cashbackres;
    }

    public Result(){};

    public String toString() {
        return "Сумма на счету " + nameres + " равна " + countres + " кэшбэк составляет " + cashbackres + "%";

    }
}
