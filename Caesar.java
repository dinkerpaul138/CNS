public class Caesar {
    public static void main(String[] args) {
        String text = "HELLO";
        int key = 3;
        String encrypted = "";
        String decrypted = "";

        for (char ch : text.toCharArray()) {
            encrypted += (char) ('A' + (ch - 'A' + key) % 26);
        }

        for (char ch : encrypted.toCharArray()) {
            decrypted += (char) ('A' + (ch - 'A' - key + 26) % 26);
        }

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
