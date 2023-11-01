package example.models;

public class CreditCard {
    private final String number;
    private final String cvv;
    private final String expirationDate;
    private double balance;
    private final String owner;

    public CreditCard(String number, String cvv, String expirationDate, double balance, String owner) {
        this.number = number;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.balance = balance;
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public String getCvv() {
        return this.cvv;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return this.owner;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", balance=" + balance +
                ", owner='" + owner + '\'' +
                '}';
    }
}
