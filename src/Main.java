public class
Main
{
    public static void main(String[] args)
    {
        int number = 3; // random number used here to depict odd/even
        int DIVIDEND = 2;
        int remainder = number % DIVIDEND;
        if (remainder > 0)
        {
            System.out.println(number + " is odd");
        }
        else
        {
            System.out.println(number + " is even");
        }
    }
}