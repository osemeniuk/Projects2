package Lesson16.HomeTask;

public class Bank {
    BankAccount[] accounts;

    Bank(BankAccount[] accs) {
        this.accounts = accs;
    }

    public void transfer(FundTransfer[] transfers) {
        for (int i = 0; i < transfers.length; i++) {
            int fromAccId = transfers[i].getFromId();
            int toAccId = transfers[i].getToId();
            BankAccount fromAccount = null;
            BankAccount toAccount = null;
            for (int j = 0; j < accounts.length; j++) {
                if (accounts[j].getId() == fromAccId) {
                    fromAccount = accounts[j];
                } else if (accounts[j].getId() == toAccId) {
                    toAccount = accounts[j];
                }
            }
            if (fromAccount == null || toAccount == null) {
                System.out.println("Bank Account does not exist");
            } else if (fromAccount.getBalance() < transfers[i].getAmount()) {
                System.out.println("Not enough fund in source Bank Account");

            } else {
                fromAccount.withdraw(transfers[i].getAmount());
                toAccount.topUp(transfers[i].getAmount());
            }

        }

    }

    public String toString(){
        String bank = "";
        for (int j = 0; j < accounts.length; j++) {
            bank+= accounts[j].toString();
        }
        return  bank;
    }
}