import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class MD5 {
    public static void main(String[] args) throws Exception {
        String text = "Hello world";
        MessageDigest digest = MessageDigest.getInstance("MD5");
        byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));

        StringBuilder result = new StringBuilder();
        for (byte b : hash) {
            result.append(String.format("%02x", b & 0xff));
        }

        System.out.println("MD5: " + result);
    }
}
