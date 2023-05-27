import java.util.Scanner;
class CatchingExceptions{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int a[]={12,0,14,24,0,43,58};
        int y=0;
        do{
            
        System.out.println("Array is ");
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        System.out.print("\nEnter index of numeraor from array-");
        int n=sc.nextInt();
        System.out.print("Enter index of denominator from array-");
        int d=sc.nextInt();
        try{
            System.out.println("Numeraor at index "+n+" is "+a[n]);
            System.out.println("Denominator at index "+d+"is "+a[d]);
            long result=a[n]/a[d];
            System.out.println("Result for Division performed is "+result);
            y=0;
        }catch(ArrayIndexOutOfBoundsException aioe){
            System.out.println("ArrayIndexOutOfBoundsException raised");
            System.out.println("Choose Suitable index for array!!!");
            y=1;
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException raised");
            System.out.println("Division not possible. Try again!!!");
            y=1;
        } 
        }
        while(y==1);
    }
}

