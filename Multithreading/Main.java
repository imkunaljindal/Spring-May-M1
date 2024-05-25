public class Main {

//    static class Messi extends Thread{
//        public void run() {  // entry point of thread
//            for(int i=0;i<5;i++) {
//                System.out.println("Messi");
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }

    static class Messi implements Runnable {

        @Override
        public void run() {
            for(int i=0;i<5;i++) {
                System.out.println("Messi");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Messi messi = new Messi();
        Thread t = new Thread(messi);  // only when you implement runnable
        t.start();

        System.out.println(t.isAlive());

        for(int i=0;i<5;i++) {
            System.out.println("Ronaldo");
            Thread.sleep(2000);
        }

        t.join();  //merges messi thread into main
        System.out.println(t.isAlive());

    }
}
