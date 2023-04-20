import java.util.Scanner;
class Rectangle{
    private int length,breadth;
    public Rectangle(){
        this.length=this.breadth=0;
    }
    public Rectangle(int length){
        this.length=this.breadth=length;
    }
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void setL(int length){
        this.length=length;
    }
    public void setB(int breadth){
        this.breadth=breadth;
    }
    public int getL(){
        return this.length;
    }
    public int getB(){
        return this.breadth;
    }
    public int area(){
        return this.length*this.breadth;
    }
    public int perimeter(){
        return 2*(this.length+this.breadth);
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length and breadth of Rectangle:");
        int l=sc.nextInt();
        int b=sc.nextInt();
        Rectangle ob1=new Rectangle(l,b);
        System.out.println("Area of Rectangle is-"+ob1.area()+"\nPerimeter of Rectangle is-"+ob1.perimeter());
        System.out.println("Do you wish to continue??\nyes-y\nno-n");
        char ch=sc.next().charAt(0);
        while(ch=='y'){
            System.out.print("Enter length and breadth of Rectangle:");
        l=sc.nextInt();
        b=sc.nextInt();
        ob1.setL(l);
        ob1.setB(b);
        System.out.println("Area of Rectangle is-"+ob1.area()+"\nPerimeter of Rectangle is-"+ob1.perimeter());
        System.out.println("Do you wish to continue??\nyes-y\nno-n");
        ch=sc.next().charAt(0);
        }
    }
}
