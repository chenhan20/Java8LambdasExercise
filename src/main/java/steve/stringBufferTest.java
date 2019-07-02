package steve;

import java.util.stream.IntStream;

/**
 *
 * @author steve
 */
public class stringBufferTest {

    public static void main(String[] args) throws Exception {
        System.out.println("StringAdd======" + stringAdd());
        System.out.println("StringBuffer====" + stringStringBuffer());
        System.out.println("StringBuilder====" + stringStringBuilder());
    }

    //String串接 用+
    private static long stringAdd() {
        long currentTime1 = System.currentTimeMillis();

        String a = "1";
        for (int i = 1; i < 100000; i++) {
            a = a + 1;
        }
        long currentTime2 = System.currentTimeMillis();
        return currentTime2 - currentTime1;
    }

    //String串接 用StringBuffer
    private static long stringStringBuffer() {
        long currentTime1 = System.currentTimeMillis();

        StringBuffer a = new StringBuffer("1");
        for (int i = 1; i < 100000; i++) {
            a.append(1);
        }
        long currentTime2 = System.currentTimeMillis();
        return currentTime2 - currentTime1;
    }

    //String串接 StringBuilder
    private static long stringStringBuilder() {
        long currentTime1 = System.currentTimeMillis();

        StringBuilder a = new StringBuilder("1");
        for (int i = 1; i < 100000; i++) {
            a.append(1);
        }
        long currentTime2 = System.currentTimeMillis();
        return currentTime2 - currentTime1;
    }
}