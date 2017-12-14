/*public class Threading extends Thread {
    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        new Threading().start();
        System.out.println("main finish");
    }
}
*/

/*
public class Threading extends Thread {
    public void run() {
        while(true) {
            try {
                System.out.println("running");
            } catch (Exception e) {
                e.printStackTrace();
            }
        finally {
                try{
                    Thread.sleep(1 * 1000);
                } catch (Exception e){

                }
            }
        }
    }
    public static void main(String[] args) {
        new Threading().start();
        System.out.println("main finish");
    }
}
*/

/*
public class Threading extends Thread {
    static String str = "1";
    public void run() {
        while(true){
            System.out.println(str);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
    public static void main(String[] args) {
        new Threading().start();
        str = "9";
    }
}
*/

//系統會自己排誰先執行
class MyThread extends Thread {
    private String x;

    public MyThread(int x){
        // turn to string
        this.x = String.valueOf(x);
    }

    public void run(){
        System.out.println("Hello I'm " + x);
    }
}

public class Threading {
    public static void main(String[] args){
        Thread t1 = new MyThread(1);
        Thread t2 = new MyThread(2);
        Thread t3 = new MyThread(3);
        Thread t4 = new MyThread(4);
        Thread t5 = new MyThread(5);

        // 新增 5 個 thread

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}