package com.github.rsoi.service;


import com.github.rsoi.domain.CountAllTransactions;
import com.github.rsoi.domain.Result;
import com.github.rsoi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountCashback {

    @Autowired
    TransactionRepository transactionRepository;



    public List<Result> countcashback() {
        List<CountAllTransactions> countAllTransactions = transactionRepository.all();
        List<Result> end = null;
        int tr;
        for (int i = 0; countAllTransactions.size() > i; i++) {
            if(countAllTransactions.get(i).getAlltransactions()<=75){
                tr=countAllTransactions.get(i).getAlltransactions()/5;

            }else tr=15;
            Result result=new Result(countAllTransactions.get(i).getName(),countAllTransactions.get(i).getMoneyall(),tr);
            end.add(result);

        }
        return end;

//        int cashback = 0;
//
//        double allMoneyOfClient = transactionRepository.getTotalMoneyByName(name);
//        int counterOfTransactionsOfOneClient = transactionRepository.countByName(name);
//
//        List<Result> resultall =transactionRepository.all();
//        if (counterOfTransactionsOfOneClient <= 75) {
//            cashback = counterOfTransactionsOfOneClient / 5;
//        } else {
//            cashback = 15;
//        }
//        return resultall;
        //  return new Result(name, allMoneyOfClient, cashback);

    }
}

//        //String str = "";
//        ArrayList<transactions> list= (ArrayList<transactions>) transactionRepository.findAll();
//      //  String[] words = content.split(" ");
//
////        int g=0;
////        for (int i = 0; i < (words.length - 3); i++) {
////
////            list.add(new Transaction(Integer.parseInt(words[i]), words[i + 1], Float.valueOf(words[i + 2]), LocalDate.parse(words[i + 3])));
////            System.out.println(list.get(g).toString());
////            i = i + 3;
////            g++;
////        }
//
//
//
//
//        transactionRepository.
//
//
//
//
//
//
//
//        ArrayList<Result> res = new ArrayList<>();
//        while (list.size() > 0) {
//
//            double count = list.get(0).getMoney();
//            int j;
//            int cashback = 0;
//            int tr = 1;
//            for (j = 1; j < list.size(); ) {
//                if (list.get(0).getName().equals(list.get(j).getName())) {
//                    count = count + list.get(j).getMoney();
//                    tr++;
//                    list.remove(j);
//                } else j++;
//            }
//            if (tr <= 75) {
//                cashback = tr / 5;
//            } else {
//                cashback = 15;
//            }
//
//            res.add(new Result(list.get(0).getName(), count, cashback));
//            list.remove(0);
//        }
//        return res;
//    }
//}
