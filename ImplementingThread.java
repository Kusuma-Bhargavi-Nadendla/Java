class MyThread implements Runnable{
    private String name;
    public MyThread(String name){
        this.name=name;
    }
    
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.print(i);
            try{
                (new Thread()).sleep(500);
            }
            catch(InterruptedException ie){
                System.out.print(ie);
            }
        }
    }
}
class ImplementingThread{
    public static void main(String[] args){
        System.out.println("This is main start");
        Thread t1=new Thread(new MyThread("t1"));
        t1.start();
        Thread t2=new Thread(new MyThread("t2"));
        t2.start();
        Thread t3=new Thread(new MyThread("t3"));
        t3.start();
        System.out.println("This is main end");
    }
}

