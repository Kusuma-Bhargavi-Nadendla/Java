class SimpleGenerics<T>{
      T ob;
      public SimpleGenerics(T ob){
               this.ob=ob;
      }
      public T getOb(){
             return this.ob;
      }
      public void showOb(){
             System.out.println(ob.getClass().getName());
       }
}
class SimpleGenericsTest{
 public static void main(String[] args){
     SimpleGenerics<Double> ob1=new SimpleGenerics<Double>(15.67);
     System.out.println(ob1.getOb());
     ob1.showOb();

       SimpleGenerics<Integer> ob2=new SimpleGenerics<Integer>(3);
     System.out.println(ob2.getOb());
     ob2.showOb();
}
}

     
