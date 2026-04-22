public class SleepMainExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);

            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}