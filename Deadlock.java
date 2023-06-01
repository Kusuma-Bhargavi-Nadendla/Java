class X{
   synchronized void foo(Y y){
         String name=Thread.currentThread().getName();
         System.out.println(name+" entered x foo");
         try{
           Thread.sleep(1000);
         }catch(InterruptedException ie){
                  System.out.println(ie);
         }
         y.last();
      }
       synchronized void last(){
               System.out.println("Inside x last()");
      }
}
class Y{
   synchronized void bar(X x){
         String name=Thread.currentThread().getName();
         System.out.println(name+" entered Y bar");
         try{
           Thread.sleep(1000);
         }catch(InterruptedException ie){
                  System.out.println(ie);
         }
         x.last();
      }
       synchronized void last(){
               System.out.println("Inside y last()");
      }
}
class Deadlock implements Runnable{
      X x=new X();
      Y y=new Y();
      Deadlock(){
           Thread.currentThread().setName("Main");
            Thread t=new Thread(this,"Racing Thread");
           t.start();
          x.foo(y);
    }
   public void run(){
           y.bar(x);
   }
  public static void main(String[] args){
         System.out.println("This program will never terminate");
          new Deadlock();
}
}
         
