package oops;



import oops.BankAccount;
import oops.SalaryAccount;
import oops.SavingsAccount;

class BankAccount {
 int accountNo;
 double balance;

 BankAccount(int accountNo, double balance) {
     this.accountNo = accountNo;
     this.balance = balance;
 }

 void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: " + amount + " | New Balance: " + balance);
 }

 void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
     } else {
         System.out.println("Insufficient balance!");
     }
 }
}

class SavingsAccount extends BankAccount {
 double interestRate;

 SavingsAccount(int accountNo, double balance, double interestRate) {
     super(accountNo, balance);
     this.interestRate = interestRate;
 }

 void addInterest() {
     double interest = balance * interestRate / 100;
     balance += interest;
     System.out.println("Interest Added: " + interest + " | New Balance: " + balance);
 }
}

class SalaryAccount extends BankAccount {
 double monthlySalary;

 SalaryAccount(int accountNo, double balance, double monthlySalary) {
     super(accountNo, balance);
     this.monthlySalary = monthlySalary;
 }

 void creditSalary() {
     balance += monthlySalary;
     System.out.println("Salary Credited: " + monthlySalary + " | New Balance: " + balance);
 }
}

//Main Class
 class BankDemo {
 public static void main(String[] args) {

     System.out.println("----- Savings Account Operations -----");
     SavingsAccount sa = new SavingsAccount(101, 5000, 5.0);
     sa.deposit(2000);
     sa.addInterest();
     sa.withdraw(1500);

     System.out.println("\n----- Salary Account Operations -----");
     SalaryAccount sal = new SalaryAccount(102, 1000, 25000);
     sal.creditSalary();
     sal.withdraw(5000);
 }
}
