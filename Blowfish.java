import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Blowfish {
    public static void main(String[] args) throws Exception {
        byte[] keyBytes = "mysecretkey12345".getBytes(StandardCharsets.UTF_8);
        SecretKeySpec key = new SecretKeySpec(keyBytes, "Blowfish");

        Cipher cipher = Cipher.getInstance("Blowfish");

        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(
                "Hello world".getBytes(StandardCharsets.UTF_8));

        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decrypted = cipher.doFinal(encrypted);

        System.out.println("Encrypted (Base64): "
                + Base64.getEncoder().encodeToString(encrypted));
        System.out.println("Decrypted: "
                + new String(decrypted, StandardCharsets.UTF_8));
    }
}
