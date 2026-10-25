public class Substitution {
    public static void main(String[] args) {
        String text = "HELLO";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String substitute = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String encrypted = "";
        String decrypted = "";

        for (char ch : text.toCharArray()) {
            encrypted += substitute.charAt(alphabet.indexOf(ch));
        }

        for (char ch : encrypted.toCharArray()) {
            decrypted += alphabet.charAt(substitute.indexOf(ch));
        }

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
