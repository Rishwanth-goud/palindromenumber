
public class palindromenumber {
    public static void main(String[] args) {
        // Hardcoded number for input
        int number = 121;  // You can change this to any number

        // Store the original number to compare later
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Add digit to reversed number
            number /= 10; // Remove the last digit from the number
        }

        // Check if the number is a palindrome
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
