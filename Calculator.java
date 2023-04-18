import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener{
   JLabel l1,l2,l3;
   JTextField t1,t2,t3;
   JButton b1,b2,b3,b4,b5,b6;
    public Calculator(){
       super("Simple Calculator");
       setBounds(100,100,400,300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new GridLayout(6,2,10,10));
       l1=new JLabel("Enter First Number:");
       add(l1);
       t1=new JTextField();
       add(t1);
       l2=new JLabel("Enter Second Number:");
       add(l2);
       t2=new JTextField();
       add(t2);
       l3=new JLabel("Result:");
       add(l3);
       t3=new JTextField();
       add(t3);
       
        b1=new JButton("ADD");
       b1.addActionListener(this);
       add(b1);
        b2=new JButton("SUBTRACT");
       b2.addActionListener(this);
       add(b2);
        b3=new JButton("MULTIPLY");
       b3.addActionListener(this);
       add(b3);
        b4=new JButton("DIVIDE");
       b4.addActionListener(this);
       add(b4);
        b5=new JButton("CLEAR");
       b5.addActionListener(this);
       add(b5);
        b6=new JButton("EXIT");
       b6.addActionListener(this);
       add(b6);
       setVisible(true);
}
public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b6)
            System.exit(0);
       
       int x=Integer.parseInt(t1.getText());
       int y=Integer.parseInt(t2.getText());
       if(ae.getSource()==b1)
            t3.setText(String.valueOf(x+y));
       else if(ae.getSource()==b2)
            t3.setText(String.valueOf(x-y));
       else if(ae.getSource()==b3)
            t3.setText(String.valueOf(x*y));
       else if(ae.getSource()==b4)
            t3.setText(String.valueOf(x/y));
       else if(ae.getSource()==b5){
            t1.setText(new String());
            t2.setText(new String());
            t3.setText(new String());
       }
      
  }

public static void main(String[] args){
   new Calculator();
}
}

       
