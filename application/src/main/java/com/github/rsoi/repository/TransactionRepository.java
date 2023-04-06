package com.github.rsoi.repository;

import com.github.rsoi.domain.CountAllTransactions;
import com.github.rsoi.domain.transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<transactions, Integer> {

    int countByName(String name);

    @Query("SELECT SUM(tr.money) FROM transactions tr WHERE tr.name = :name")
    double getTotalMoneyByName(@Param("name") String name);

    @Query(value = "select tr.name as name, sum(tr.money) as moneyall, count(tr.name) as alltransactions from transactions tr  group by tr.name ", nativeQuery = true)
    List<CountAllTransactions> all();
}


