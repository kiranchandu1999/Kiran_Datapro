package OOPS;

class Data {
    synchronized public void print(){
        for(int i=1; i<=10; i++){
            System.out.println("count " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C1 extends Thread{
    Data d;
    public C1(Data d){
        this.d = d;
    }

    public void run(){
        d.print();
    }
}

public class Synchronizationtest {
    public static void main(String[] args) {
        Data d = new Data();
        C1 ob1 = new C1(d);
        C1 ob2 = new C1(d);

        ob1.start();
        ob2.start();
    }
}
