import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
class JTreeTest extends JFrame {
      JTree jt;
      public JTreeTest(){
             super("JTree in SWING");
             setBounds(100,100,400,300);
      DefaultMutableTreeNode root=new DefaultMutableTreeNode("RVRJC");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      DefaultMutableTreeNode circuit=new DefaultMutableTreeNode("Circuit Branches");
      root.add(circuit);
      DefaultMutableTreeNode comp=new DefaultMutableTreeNode("Computer Science");
      circuit.add(comp);
      DefaultMutableTreeNode noncomp=new DefaultMutableTreeNode("Non-Computers");
      circuit.add(noncomp);

      DefaultMutableTreeNode branch1=new DefaultMutableTreeNode("CSE");
      comp.add(branch1);
      DefaultMutableTreeNode branch2=new DefaultMutableTreeNode("CSE(AI&ML)");
      comp.add(branch2);
      DefaultMutableTreeNode branch3=new DefaultMutableTreeNode("CSE(DS)");
      comp.add(branch3);
      DefaultMutableTreeNode branch4=new DefaultMutableTreeNode("CSE(IOT)");
      comp.add(branch4);
      DefaultMutableTreeNode branch5=new DefaultMutableTreeNode("CSBS");
      comp.add(branch5);
      DefaultMutableTreeNode branch6=new DefaultMutableTreeNode("IT");
      comp.add(branch6);

      DefaultMutableTreeNode branch7=new DefaultMutableTreeNode("ECE");
      noncomp.add(branch7);
      DefaultMutableTreeNode branch8=new DefaultMutableTreeNode("EEE");
      noncomp.add(branch8);

      DefaultMutableTreeNode noncircuit=new DefaultMutableTreeNode("Non Circuit Branches");
      root.add(noncircuit);
      DefaultMutableTreeNode branch9=new DefaultMutableTreeNode("ME");
      noncircuit.add(branch9);
      DefaultMutableTreeNode branch10=new DefaultMutableTreeNode("CE");
      noncircuit.add(branch10);
      DefaultMutableTreeNode branch11=new DefaultMutableTreeNode("ChE");
      noncircuit.add(branch11);
      

     jt=new JTree(root);
     JScrollPane jsp=new JScrollPane(jt);
     add(jsp);
     setVisible(true);
}
public static void main(String[] args){
     new JTreeTest();
}
}
      
      
