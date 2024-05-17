import java.io.IOException;
import java.sql.SQLException;

public class ThrowsConcept {

    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 0;
        int c = divide(a,b);
    }

    static int divide(int a , int b) throws Exception {
        return a/b;
    }
}
