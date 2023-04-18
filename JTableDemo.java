import javax.swing.*;
class JTableDemo extends JFrame{
   
   public JTableDemo(){
      super("JTable");
       setBounds(100,100,400,300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      String[][] data={
         {"1.","E001","Mohan","10000"},
         {"2.","E002","Sravya","20000"},
         {"3.","E003","Kiran","30000"},
         {"4.","E004","Ramya","15000"},
         {"5.","E005","Gopal","20000"}
     };
     String[] header={"Sl. No.","Employee ID","Name","Salary"};
     JTable jt=new JTable(data,header);
     JScrollPane jsp=new JScrollPane(jt);
     add(jsp);
     setVisible(true);
 }
  public static void main(String[] args){
     new JTableDemo();
  }
}
