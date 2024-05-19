package by.aston.java.base.home_work._5_home_work;

import java.util.Comparator;

public class TransactionByValueComparator implements Comparator<Transaction> {
    @Override
    public int compare(Transaction o1, Transaction o2) {
        return o1.getValue()-o2.getValue();
    }
}
