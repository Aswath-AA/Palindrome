public class Palindrome {
    public static void main(String[] args) {
        // Define the string to check
        String input = "madam";

        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();

        // Check if the original string is equal to the reversed string
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
