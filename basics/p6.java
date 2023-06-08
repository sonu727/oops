class BankAccount {
    private int accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(int accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void add(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void subtract(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------------");
    }
}

class AccountManager {
    private BankAccount[] accounts;
    private int numAccounts;

    public AccountManager() {
        accounts = new BankAccount[5];
        numAccounts = 0;
    }

    public void create(int accountNumber, double balance, String ownerName) {
        if (numAccounts < 5) {
            BankAccount account = new BankAccount(accountNumber, balance, ownerName);
            accounts[numAccounts] = account;
            numAccounts++;
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Maximum number of accounts reached.");
        }
    }

    public void delete(int accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                for (int j = i; j < numAccounts - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[numAccounts - 1] = null;
                numAccounts--;
                System.out.println("Account deleted successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void deposit(int accountNumber, double amount) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                accounts[i].add(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void withdraw(int accountNumber, double amount) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                accounts[i].subtract(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void printAccountDetails() {
        for (int i = 0; i < numAccounts; i++) {
            accounts[i].printDetails();
        }
    }
}

 class p6 {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();

        accountManager.create(101, 5000.0, "John");
        accountManager.create(102, 10000.0, "Jane");
        accountManager.create(103, 2000.0, "David");
        accountManager.create(104, 8000.0, "Emily");
        accountManager.create(105, 3000.0, "Michael");

        accountManager.printAccountDetails();
    }
}
