public class InsertSpecialCharsInSpace {
    public static void main(String[] args) {
        // Original string
        String originalString = "Hello world! How are you?";

        // Define the special characters to use
        char[] specialChars = {'@', '#', '$', '%', '^', '&', '*', '(', ')', '+'}; // Extend as needed
        
        // Initialize the result StringBuilder
        StringBuilder result = new StringBuilder();

        // Counter for tracking which special character to use
        int spaceCount = 0;

        // Iterate through each character in the original string
        for (char ch : originalString.toCharArray()) {
            if (ch == ' ') {
                // Replace space with the current special character
                result.append(specialChars[spaceCount % specialChars.length]);
                spaceCount++;
            } else {
                // Append the original character if it's not a space
                result.append(ch);
            }
        }

        // Print the result
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + result.toString());
    }
}

