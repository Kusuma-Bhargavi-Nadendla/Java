import javax.swing.*;
import java.awt.*;

public class TabbedPaneDemo extends JFrame{
  JTabbedPane jtb;
  JFrame jf;
    

    public TabbedPaneDemo(){
  
    super("JTabbed Pane");
    setBounds(100,100,400,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     jtb=new JTabbedPane();



    JPanel jp1=new JPanel(new GridLayout(4,1));
   JCheckBox cb1=new JCheckBox("Mathematics-1");
   JCheckBox cb2=new JCheckBox("Chemistry");
  JCheckBox cb3=new JCheckBox("English for Communication skills");
  JCheckBox cb4=new JCheckBox("Fundamentals of Computer science");
  jp1.add(cb1);
  jp1.add(cb2);
  jp1.add(cb3);
  jp1.add(cb4);
 jtb.addTab("SEM 1 COURSES",jp1);


  JPanel jp2=new JPanel(new GridLayout(4,1));
   
   JRadioButton rb1=new JRadioButton("Mathematics-2");
   JRadioButton rb2=new JRadioButton("Physics");
   JRadioButton rb3=new JRadioButton("DataStructures");
   JRadioButton rb4=new JRadioButton("Python Promming");
   jp2.add(rb1);
   jp2.add(rb2);
   jp2.add(rb3);
   jp2.add(rb4);
   jtb.addTab("SEM 2 COURSES",jp2);

  JPanel jp3=new JPanel();
  String[] cou={"Statistics","Discrete Mathematics","Database management systems","Object Oriented Programming"};
  JList<String> jl=new JList<String>(cou);
  jp3.add(jl);
  jtb.addTab("SEM 3 COURSES",jp3);

  
  add(jtb);
  JScrollPane jsp=new JScrollPane(jtb);
  add(jsp);
  
  setVisible(true);
 
}

public static void main(String[] args){
   new TabbedPaneDemo();
}
}
  


 
