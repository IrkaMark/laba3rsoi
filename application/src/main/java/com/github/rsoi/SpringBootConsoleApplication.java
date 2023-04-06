package com.github.rsoi;

import com.github.rsoi.domain.Result;
import com.github.rsoi.service.CountCashback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {
   // static String content = "1 Ivan 1000 2023-01-01 2 Ivan -950 2023-01-01 3 Petya 920 2023-01-02 4 Petya 890 2023-01-03 5 Ivan 870 2023-01-03 6 Petya 865 2023-01-04 7 Misha 2000 2023-02-01 8 Misha -950 2023-02-02 9 Petya -1020 2023-02-02 10 Sasha 590 2023-02-03 11 Misha -870 2023-02-04 12 Ivan 50 2023-02-04 13 Ivan -300 2023-02-05 14 Petya -950 2023-02-05 15 Petya 120 2023-02-07 16 Misha 390 2023-02-05 17 Ivan -70 2023-02-06 18 Sasha -65 2023-02-06";

    @Autowired
    CountCashback cashback;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsoleApplication.class, args);
	}

    @Override
    public void run(String... args) throws ClassNotFoundException {

//        System.out.println("Введите Имя клиента");
//        Scanner scanner=new Scanner(System.in);
//        String name=scanner.next();
        List<Result> result=cashback.countcashback();
        for(int i=0;result.size()>i; i++)
        System.out.println(result.get(i).toString());

    }
}
