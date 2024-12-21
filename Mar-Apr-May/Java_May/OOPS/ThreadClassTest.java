package OOPS;

class A1 extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("count " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadClassTest {
    public static void main(String[] args) {
        A1 ob1 = new A1();

        ob1.start();

        for(int i=1; i<=10; i++){
            System.out.println("main " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        
        System.out.println(Thread.currentThread().getName());
    }
}
