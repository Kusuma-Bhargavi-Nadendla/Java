 import java.util.Scanner;
 class Box{
  private double len,bre,hei;
  public Box(double len,double bre,double hei){
     this.len=len;
     this.bre=bre;
     this.hei=hei;
  }
  public Box(double len){
     this.bre=this.hei=this.len=len;
  }
  public Box(){
      this.bre=this.hei=this.len=0;
  }
   public void setL(double len){
      this.len=len;
   }
  public void setB(double len){
      this.bre=len;
   }
   public void setH(double len){
      this.hei=len;
  }
   public double getL(){
       return this.len;
   }
   public double getB(){
       return this.bre;
   }
   public double getH(){
       return this.hei;
   }
   public double volume(){
       return this.len*this.bre*this.hei;
   }
   public double surfacearea(){
       double x,y,z;
       x=2*this.len*this.bre;
       y=2*this.bre*this.hei;
       z=2*this.hei*this.len;
       return x+y+z;
   }
}
class WeightedBox extends Box{
   public double wt;
   public WeightedBox(double len,double bre,double hei,double wt){
     super(len,bre,hei);
     this.wt=wt;
  }
  public WeightedBox(){
     this.wt=0;
   }
   public WeightedBox(double len,double wt){
     super(len);
     this.wt=wt;
   }
 public void setW(double wt){
      this.wt=wt;
   }
   public double getW(){
       return this.wt;
   }
   public double volume(){
       return this.wt*super.volume();
   }
}
class ShipBox extends WeightedBox{
   public double cost;
   public ShipBox(double len,double bre,double hei,double wt,double cost){
     super(len,bre,hei,wt);
     this.cost=cost;
  }
  public ShipBox(){
     this.cost=0;
   }
   public ShipBox(double len,double wt,double cost){
     super(len,wt);
     this.cost=cost;
   }
    public void setC(double cost){
      this.cost=cost;
   }
   public double getC(){
       return this.cost;
   }
   public double volume(){
       return cost/super.volume();
   }
}
class BoxTest{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter length of the Box:");
       int l=sc.nextInt();
       System.out.print("Enter breadth of the Box:");
       int b=sc.nextInt();
       System.out.print("Enter height of the Box:");
       int h=sc.nextInt();
        Box b1=new Box(l,b,h);
        
        System.out.println("New Box created with dimensions:"+l+"x"+b+"x"+h+"\nVolume of Box is "+b1.volume()+"\nSurface area of Box is "+b1.surfacearea());
        
        System.out.print("Enter weight per gram:");
        int w=sc.nextInt();
        b1=new WeightedBox(l,b,h,w);
	    double d = b1.volume();
        System.out.println("Total Weight of Box is "+ b1.volume());
        
        System.out.print("Enter Total Cost of the Box:");
        int cost=sc.nextInt();
        b1=new ShipBox(l,b,h,w,cost);
        System.out.printf("Cost of Box per volume is %.4f",(b1.volume()));
        
   }
}
