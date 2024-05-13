import java.io.IOException;
import java.sql.SQLException;

public class ThrowsConcept {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = divide(a,b);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    static int divide(int a , int b) throws Exception {
        return a/b;
    }
}
