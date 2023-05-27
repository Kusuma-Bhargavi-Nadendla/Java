import java.util.Scanner;
class Complex{
    private int real,imag;
    public Complex(){
       this.real=this.imag=0;
    }
    public Complex(int x){
      this.real=this.imag=x;
    }
    public Complex(int real,int imag){
       this.real=real;
       this.imag=imag;
    }
    public void setReal(int real){
      this.real=real;
    }
    public int getReal(){
       return this.real;
    }
     public void setImag(int imag){
      this.imag=imag;
    }
    public int getImag(){
       return this.imag;
    }
    public Complex add(Complex other){
        Complex c3=new Complex();
        c3.real=this.real+other.real;
        c3.imag=this.imag+other.imag;
        return c3;
   }
   public Complex subtract(Complex other){
        Complex c3=new Complex();
        c3.real=this.real-other.real;
        c3.imag=this.imag-other.imag;
        return c3;
   }
   public Complex multiply(Complex other){
        Complex c3=new Complex();
        c3.real=this.real*other.real-this.imag*other.imag;
        c3.imag=other.real*this.imag+this.real*other.imag;
        return c3;
   }
   public void divide(Complex other){
        float x=this.real*other.real+this.imag*other.imag;
        float y=other.real*this.imag-this.real*other.imag;
        float r=x/(other.real*other.real+other.imag*other.imag);
        float i=y/(other.real*other.real+other.imag*other.imag);
        System.out.println("Real-"+r+"\tImaginary-"+i);
   }
   public void print(){
         System.out.println("Real-"+this.real+"\tImaginary-"+this.imag);
   }
}
class ComplexTest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter real and imaginary of complex 1:");
        String[] c1=sc.nextLine().split(" ");
         Complex cn1=new Complex(Integer.parseInt(c1[0]),Integer.parseInt(c1[1]));
         System.out.print("Enter real add imaginary of Complex 2:");
         String[] c2=sc.nextLine().split(" ");
         Complex cn2=new Complex(Integer.parseInt(c2[0]),Integer.parseInt(c2[1]));
         Complex c3=new Complex();
         while(true){
         System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\nEnter your option:");
         int opt=sc.nextInt();
         switch(opt){
        
              case 1:c3=cn1.add(cn2);
                     System.out.println("Addition performed");
                     break;
            case 2: c3=cn1.subtract(cn2);
                     System.out.println("Subtraction performed");
                     break;
            case 3:c3=cn1.multiply(cn2);
                     System.out.println("Multiplication performed");
                     break;
            case 4:cn1.divide(cn2);
                     System.out.println("Division performed");
                     continue;
            case 5:System.exit(0);
         }
         c3.print();
         }
         
    }
}
         


