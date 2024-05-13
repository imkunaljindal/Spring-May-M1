import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Concept {

    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        int arr[] = {1,2,3,4};
//
//        try {
//            System.out.println("A");
//            int c = a / b;
//            System.out.println("B");
//        }
//        catch (Exception e) {
//            System.out.println("D");
//        }

//        int age = 20;
//        try{
//            if (age < 18) {
//                throw new UnderAgeException("Sorry! You are small");
//            }
//        }
//        catch(Exception e) {
//            System.out.println(e.getMessage());
//        }

        int a = 10;
        int b = 0;
        try{
            System.out.println("A");
            int c = a/b;
            try{
                int x = 10;
                int y = 5;
                int z = x/y;
            }
            catch (Exception e) {
                System.out.println("B");
            }
        }
        catch (Exception e) {
            System.out.println("D");
        }

    }
}
