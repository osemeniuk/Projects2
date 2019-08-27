package Lesson16.HomeTask;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BankAccount cl1 = new BankAccount(1, "test1", 10000.00);
        BankAccount cl2 = new BankAccount(2, "test2", 50000.00);
        BankAccount cl3 = new BankAccount(3, "test3", 10000.00);
        BankAccount[] baArr = {cl1, cl2, cl3};
//        System.out.println(cl1);
//        System.out.println(cl2);

        FundTransfer tr1 = new FundTransfer(1,4, 100);
        FundTransfer tr2 = new FundTransfer(1, 3, 200);
        FundTransfer tr3 = new FundTransfer(1, 2, 100);
        FundTransfer [] fnTr = {tr1, tr2, tr3};
//        System.out.println(tr1);
//        System.out.println(tr2);

        Bank b1 = new Bank(baArr);
        System.out.println(b1);
        b1.transfer(fnTr);
        System.out.println(b1);
    }

}
