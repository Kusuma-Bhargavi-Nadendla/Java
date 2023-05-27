import java.util.Scanner;
class Stack{
    private int array[],top,size;
    public Stack(){
        this.size=10;
         this.top=-1;
         this.array=new int[30];
     }
     public void push(int x){
         array[++top]=x;
     }
     public int pop(){
         return array[top--];
     }
     public int peek(){
         return array[top];
     }
     public void print(){
         System.out.println("Elements in stack are\n");
         for(int i=top;i>=0;i--){
               System.out.println(array[i]);
          }
     }
}
class StackTest{
      public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           Stack s=new Stack();
           outerloop:while(1>0){
                System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n5.Exit\nChoice:");
                int opt=sc.nextInt();
                switch(opt){
                   case 1:System.out.print("Enter element to push:");
                          int x=sc.nextInt();
                          s.push(x);
                          break;
                   case 2:System.out.print("Element popped-"+s.pop());
                          break;
                   case 3:System.out.print("Element at peek-"+s.peek());
                          break;
                   case 4:s.print();
                          break;
                   case 5:break outerloop;
             }
    }
}
}




