import java.util.Scanner;
class Circle
{
  private double radius;
  public Circle ()
  {
    this.radius = 0;
  }
  public Circle (double radius)
  {
    this.radius = radius;
  }
  public void setR (double r)
  {
    this.radius = r;
  }
  public double getR ()
  {
    return this.radius;
  }
  public double area ()
  {
    return Math.PI * this.radius * this.radius;
  }
  public double circumference ()
  {
    return 2 * Math.PI * this.radius;
  }
}

class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter radius:");
    double r = sc.nextDouble ();
    Circle ob1 = new Circle (r);
      System.out.println ("Area of Circle=" + ob1.area ());
      System.out.println ("Circumference of circle=" + ob1.circumference ());
      System.out.println ("Do you wish to change radius??\nyes-y\nno-n");
    char ch = sc.next ().charAt (0);
    while (ch == 'y')
      {
	System.out.println ("Enter radius:");
	r = sc.nextDouble ();
	ob1.setR (r);
	System.out.println ("Area of Circle=" + ob1.area ());
	System.out.println ("Circumference of circle=" +
			    ob1.circumference ());
	System.out.println ("Do you wish to change radius??\nyes-y\nno-n");
	ch = sc.next ().charAt (0);
      }

  }
}
