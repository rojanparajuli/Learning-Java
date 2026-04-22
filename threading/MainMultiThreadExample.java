

   class TaskOne extends Thread{
     public void run(){
        for(int i =0 ; i<=5; i++){
            System.out.println("Task one runned"+i);
        }
    }
   }

   class TaskTwo extends Thread{
    public void run(){
        for(int i = 0; i<=5000; i++){
            System.out.println("Task two runned"+i);
        }
    }
   }

   public class MainMultiThreadExample{
    public static void main(String[] args) {
        TaskOne t1 = new TaskOne();
        TaskTwo t2 = new TaskTwo();

        t1.start();
        t2.start();
    }
   }
    
