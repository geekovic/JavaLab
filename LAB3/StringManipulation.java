public class StringManipulation {
    public static void main(String[] args) {
        // Declare strings
        String str1 = "Hello";
        String str2 = "World";

        // Length of the string
        System.out.println("Length of str1: " + str1.length());

        // Concatenation
        String combined = str1 + " " + str2;
        System.out.println("Concatenated string: " + combined);

        // Convert to uppercase and lowercase
        System.out.println("Uppercase: " + combined.toUpperCase());
        System.out.println("Lowercase: " + combined.toLowerCase());

        // Substring
        System.out.println("Substring (0 to 5): " + combined.substring(0, 5));

        // Character at a specific index
        System.out.println("Character at index 1: " + combined.charAt(1));

        // Replace characters
        System.out.println("Replace 'l' with '*': " + combined.replace('l', '*'));

        // String comparison
        String str3 = "Hello";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 compared to str2: " + str1.compareTo(str2));
    }
}
