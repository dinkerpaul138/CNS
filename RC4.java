import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class RC4 {
    // Educational implementation of RC4's Key Scheduling Algorithm (KSA)
    // and Pseudo-Random Generation Algorithm (PRGA). RC4 is obsolete.
    private static byte[] crypt(byte[] input, byte[] key) {
        if (key.length == 0) {
            throw new IllegalArgumentException("Key must not be empty");
        }

        int[] s = new int[256];
        for (int i = 0; i < 256; i++) {
            s[i] = i;
        }

        int j = 0;
        for (int i = 0; i < 256; i++) {
            j = (j + s[i] + (key[i % key.length] & 0xff)) % 256;
            int temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }

        byte[] output = new byte[input.length];
        int i = 0;
        j = 0;

        for (int n = 0; n < input.length; n++) {
            i = (i + 1) % 256;
            j = (j + s[i]) % 256;

            int temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            int k = s[(s[i] + s[j]) % 256];
            output[n] = (byte) (input[n] ^ k);
        }

        return output;
    }

    public static void main(String[] args) {
        byte[] key = "Secret".getBytes(StandardCharsets.UTF_8);
        byte[] plain = "Hello world".getBytes(StandardCharsets.UTF_8);

        byte[] encrypted = crypt(plain, key);
        byte[] decrypted = crypt(encrypted, key);

        System.out.println("Encrypted (hex): " + toHex(encrypted));
        System.out.println("Decrypted: "
                + new String(decrypted, StandardCharsets.UTF_8));
    }

    private static String toHex(byte[] data) {
        StringBuilder result = new StringBuilder();
        for (byte b : data) {
            result.append(String.format("%02x", b & 0xff));
        }
        return result.toString();
    }
}
