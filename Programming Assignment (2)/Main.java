import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get credit card number
        System.out.print("Enter a credit card number: ");
        long number = input.nextLong();

        //check if card is valid
        if (isValid(number)) {
            System.out.println(number + " is valid.");
        } else {
            System.out.println(number + " is invalid.");
        }

        input.close();
    }

    //return valid 
    public static boolean isValid(long number) {
        return (getSize(number) >= 13 && getSize(number) <= 16) &&
               (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                prefixMatched(number, 37) || prefixMatched(number, 6)) &&
               ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }

    //double all numbers on even spots from right to left and trun to string
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);
        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            sum += getDigit(Character.getNumericValue(numStr.charAt(i)) * 2);
        }
        return sum;
    }

    //add string of number if two digits
    public static int getDigit(int number) {
        return number < 10 ? number : (number / 10) + (number % 10);
    }

    //add all digits in odd spots right to left
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);
        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        return sum;
    }

    //return true if prefix is valid
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    //return number of digits in d
    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    //return the first k number of digits from number, if number of digits are less than k, return number
    public static long getPrefix(long number, int k) {
        String numStr = Long.toString(number);
        return numStr.length() < k ? number : Long.parseLong(numStr.substring(0, k));
    }
}

