public class Hill {
    public static void main(String[] args) {
        // The 2x2 key matrix is [3 3; 2 5]. Input must be two uppercase letters.
        String text = "HI";

        int a = text.charAt(0) - 'A';
        int b = text.charAt(1) - 'A';

        int x = (3 * a + 3 * b) % 26;
        int y = (2 * a + 5 * b) % 26;

        String encrypted = "" + (char) (x + 'A') + (char) (y + 'A');

        // Inverse matrix modulo 26: [15 17; 20 9]
        int p = encrypted.charAt(0) - 'A';
        int q = encrypted.charAt(1) - 'A';

        int m = (15 * p + 17 * q) % 26;
        int n = (20 * p + 9 * q) % 26;

        String decrypted = "" + (char) (m + 'A') + (char) (n + 'A');

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
