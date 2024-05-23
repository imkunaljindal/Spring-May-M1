public class FinallyConcept {

    public static void main(String[] args) {
        try {
            int x = 5/0;
        }
        catch (Exception e) {
            System.out.println("B");
        }
        finally {
            System.out.println("A");
        }

        int d = 5/0;

        try {
            int y = 10/2;
        }
        catch (Exception e) {
            System.out.println("C");
        }
        finally {
            System.out.println("D");
        }
    }
}
