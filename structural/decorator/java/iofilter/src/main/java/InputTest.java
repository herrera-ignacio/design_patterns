import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Objects;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;

        try {
//            InputStream inputStream = new LowerCaseInputStream(
//                    new BufferedInputStream(
//                            new FileInputStream(Objects.requireNonNull(
//                                    InputTest.class.getResource("test.txt")
//                            ).getPath())
//                    )
//            );
            InputStream inputStream = new LowerCaseInputStream(
                    InputTest.class.getResourceAsStream("test.txt")
            );

            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
