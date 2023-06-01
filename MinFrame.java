import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MinFrame extends JFrame implements ActionListener{
  JTextField jt1,jt2,jt3;
 public MinFrame(){
  super("Frame");
  setBounds(100,100,400,300);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JPanel jp=new JPanel(new GridLayout(3,2,10,10));
  jp.add(new JLabel("First Number"));
  jt1=new JTextField();
 jp.add(jt1);
   jp.add(new JLabel("Second Number"));
  jt2=new JTextField();
 jp.add(jt2);
   jp.add(new JLabel("Result"));
  jt3=new JTextField();
 jp.add(jt3);
  jt1.addActionListener(this);
  jt2.addActionListener(this);
 JScrollPane jsp=new JScrollPane(jp);
 add(jsp);
  setVisible(true);
}
public void actionPerformed(ActionEvent ae){
  int x=Integer.parseInt(jt1.getText());
  int y=Integer.parseInt(jt2.getText());
  int m=(x<y)?x:y;
  jt3.setText(String.valueOf(m));
}
public static void main(String[] args){
new Minframe();
}
}
 
