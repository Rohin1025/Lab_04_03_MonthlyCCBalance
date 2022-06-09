public class Main {
    public static void main(String[] args)
    {
        double initialBalance = 5000.00;
        double INTEREST_RATE = 1.17;
        double oneMonthBalance = 0;
        double twoMonthBalance = 0;
        oneMonthBalance = initialBalance * INTEREST_RATE;
        twoMonthBalance = oneMonthBalance * INTEREST_RATE;
        System.out.println("Your initial balance is " + initialBalance);
        System.out.println("Your balance after one month is " + oneMonthBalance);
        System.out.println("Your balance after two months is " + twoMonthBalance);
    }
}