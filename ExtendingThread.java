class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.print(i);
            try{
                sleep(500);
            }
            catch(InterruptedException ie){
                System.out.print(ie);
            }
        }
    }
}
class ExtendingThread{
    public static void main(String[] args){
        System.out.println("This is main start");
        MyThread t1=new MyThread("t1");
        t1.start();
        MyThread t2=new MyThread("t2");
        t2.start();
        MyThread t3=new MyThread("t3");
        t3.start();
        System.out.println("This is main end");
    }
}
