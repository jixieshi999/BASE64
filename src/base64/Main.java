package base64;

import net.gnim.crypto.BASE64;

/**
 *
 * @author ming
 */
public class Main {

    public static void main(String[] args) {
        String str = "Hello World!";
        String base64str = BASE64.encode(str.getBytes());
        echo(base64str);
        byte[] data = BASE64.decode(base64str);
        echo(new String(data));
    }

    public static String echo(String str) {
        System.out.println(str);
        return str;
    }
}
