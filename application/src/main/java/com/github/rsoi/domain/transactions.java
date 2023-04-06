package com.github.rsoi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class transactions {
    @Id
    public int ID;
    String name;
    double money;
    LocalDate data;
}
