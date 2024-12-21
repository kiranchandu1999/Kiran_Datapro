class MyThreadClass implements Runnable{
    public void run(){
        count();
    }

    void count(){
        for(int i=1; i<=100; i++){
            System.out.println("myclass " + i);

            if(i == 50){
                try {
                    Thread.sleep(2000);
                }
                catch(InterruptedException ie) {

                }
            }
        }

        System.out.println(Thread.currentThread().getName());
    }
}

public class ImplementingRunnableInterface {
    public static void main(String[] args) {
        // first thread
        MyThreadClass mc1 = new MyThreadClass();
        
        Thread th1 = new Thread(mc1);
        th1.start();

        for(int i=1; i<=100; i++){
            System.out.println("main " + i);
        }

        System.out.println(Thread.currentThread().getName());
    }
}
