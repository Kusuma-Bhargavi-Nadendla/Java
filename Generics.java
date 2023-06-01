

class Statistics<T extends Comparable<T> > {
       T arr[];
    
     public double mean(T arr[]){
           double m=0.0;
          for(int i=0;i<arr.length;i++)
            m+=Double.parseDouble(arr[i].toString());
          return m/arr.length;
    }
     public static<T> void display(T arr[]){
          for(int i=0;i<arr.length;i++)
                    System.out.println(arr[i]);
       }
    public T maximum(T[] array) {
      
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
    }     
     public T minimum(T[] array) {
      
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }

        return min;
    } 
}
class Generics{
    public static void main(String[] args){
             
               Integer arr[]={10,20,30,40,50};
             
                    Statistics<Integer> ob1=new Statistics<Integer>();
               ob1.display(arr);
                System.out.println("Average of values is "+ob1.mean(arr));
                System.out.println("Minimum value of array is "+ob1.minimum(arr));
                System.out.println("Maximum value of array is "+ob1.maximum(arr));

             }
}
