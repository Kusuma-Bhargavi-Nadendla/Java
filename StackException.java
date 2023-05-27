import java.util.Scanner;
class Stack{
    private int array[],top,size;
    public Stack(){
        this.size=10;
         this.top=-1;
         this.array=new int[30];
     }
     public void push(int x) throws StackException{
         if(this.top==this.size-1){
             throw new StackException("Stack Full");
         }
         array[++top]=x;
     }
     public int pop() throws StackException{
         if(this.top<0){
             throw new StackException("Stack Empty");
         }
         return array[top--];
     }
     public int peek() throws StackException{
         if(this.top<0){
             throw new StackException("Stack Empty");
         }
         return array[top];
     }
     public void print(){
         System.out.println("Elements in stack are\n");
         for(int i=top;i>=0;i--){
               System.out.println(array[i]);
          }
     }
}
class StackException extends Exception{
    private String msg;
    public StackException(){
        this.msg=null;
    }
    public StackException(String msg){
        this.msg=msg;
    }
    public String getMsg(){
        return this.msg;
    }
    public void setMsg(String msg){
        this.msg=msg;
    }
    public String toString(){
        return new String("Stack Exception Raised");
    }
    
}
class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack();
        outerloop:while(1>0){
                System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n5.Exit\nChoice:");
                int opt=sc.nextInt();
                try{
                switch(opt){
                   case 1:System.out.print("Enter element to push:");
                          int x=sc.nextInt();
                          st.push(x);
                          break;
                          
                   case 2:System.out.print("Element popped-"+st.pop());
                          break;
                   case 3:System.out.print("Element at peek-"+st.peek());
                          break;
                   case 4:st.print();
                          break;
                   case 5:break outerloop;
             }
                }
                catch(StackException se){
                    System.out.println(se);
                    System.out.print(se.getMsg());
                }
        
    }
}
}




