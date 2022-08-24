import java.security.MessageDigest;
/**
 * A program that prints <code>ec5287c45f0e70ec22d52e8bcbeeb640</code>
 *
 * @author Valentyn Mozul
 * @version 1.0
 */
public class Quiz {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}
