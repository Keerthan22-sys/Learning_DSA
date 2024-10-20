public class Solution {
    public int colorful(int A) {
        String number = String.valueOf(A);
        int[] products = new int[1000]; // Array to store products (arbitrary size)
        int index = 0; // To keep track of the number of unique products

        // Iterate through all possible consecutive sequences
        for (int i = 0; i < number.length(); i++) {
            int product = 1; // Initialize product for each starting digit
            for (int j = i; j < number.length(); j++) {
                product *= (number.charAt(j) - '0'); // Convert char to int

                // Check if the product is already in the products array
                if (contains(products, index, product)) {
                    return 0; // Not a COLORFUL number
                }

                // Store the product in the array
                products[index++] = product;
            }
        }
        return 1; // It is a COLORFUL number
    }

    // Helper function to check if the product exists in the array
    private boolean contains(int[] products, int length, int product) {
        for (int i = 0; i < length; i++) {
            if (products[i] == product) {
                return true;
            }
        }
        return false;
    }
}