import java.util.Scanner;

interface shape2D{
      double getSurfaceArea();
      double getPerimeter();
}
class Circle implements shape2D{
     private double r;
     public Circle(){
          this.r=0;
     }
    public Circle(double r){
         this.r=r;
   }
   public void setR(double r){
        this.r=r;
   }
   public double getR(){
        return this.r;
    }
   public double getSurfaceArea(){
        return Math.PI*this.r*this.r;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.r;
    }
    public String toString(){
        return "Circle with radius as "+this.r;
    }
}
interface shape3D extends shape2D{
       double getVolume();
}
class Cylinder extends Circle implements shape3D{
    private double h;
    public Cylinder(){
        this.h=0;
    }
    public Cylinder(double h){
        this.h=h;
    }
    public Cylinder(double r,double h){
        super(r);
        this.h=h;
    }
     public void setH(double h){
        this.h=h;
   }
   public double getH(){
        return this.h;
    }
    public double getSurfaceArea(){
        return 2*Math.PI*super.getR()*this.h+2*Math.PI*super.getR()*super.getR();
    } 
    public double getVolume(){
            return super.getSurfaceArea()*this.h;
    }
    public String toString(){
        return "Cylinder with radius as "+super.getR()+" and height as "+this.h;
    }
    
}
class InheritenceInterface{
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter radius to create a circle:");
       int rad=sc.nextInt();
       Circle ob1=new Circle(rad);
       System.out.print("\nFor "+ob1);
       System.out.printf("\nPerimeter is %.4f\nArea is %.4f",ob1.getPerimeter(),ob1.getSurfaceArea());
       
       System.out.print("\nEnter height to make it as Cylinder:");
       int hei=sc.nextInt();
       Cylinder ob2=new Cylinder(rad,hei);
       System.out.print("For "+ob2);
       System.out.printf("\nSurface area is %.4f\nVolume is %.4f",ob2.getSurfaceArea(),ob2.getVolume());
       
    }
}


