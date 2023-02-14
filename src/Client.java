public class Client {
    String name;
    double accountBalance;
    long personalCode;

    public Client(String name, double accountBalance, long personalCode) {
        this.name = name;
        this.accountBalance = accountBalance;
        this.personalCode = personalCode;
    }


    public String greeting() {
        return "Tere";
    }

    public double balanceDifference(double firstBalance, double secondBalance) {
        return firstBalance - secondBalance;

    }
}
