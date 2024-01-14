
public class Main {

    
    public static void main(String[] args) {

        AThread aThread = new AThread();
        BThread bThread = new BThread();

        Thread t1 = new Thread(aThread);
        Thread t2 = new Thread(bThread);

        t1.start();
        t2.start();

    }
}
