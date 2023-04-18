import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CalculatorAWT extends Frame implements ActionListener, WindowListener{
   Label l1,l2,l3;
   TextField t1,t2,t3;
   Button b1,b2,b3,b4,b5,b6;
    public CalculatorAWT(){
       super("Simple Calculator");
       setBounds(100,100,400,300);
       
       setLayout(new GridLayout(6,2,10,10));
       l1=new Label("Enter First Number:");
       add(l1);
       t1=new TextField();
       add(t1);
       l2=new Label("Enter Second Number:");
       add(l2);
       t2=new TextField();
       add(t2);
       l3=new Label("Result:");
       add(l3);
       t3=new TextField();
       add(t3);
       
        b1=new Button("ADD");
       b1.addActionListener(this);
       add(b1);
        b2=new Button("SUBTRACT");
       b2.addActionListener(this);
       add(b2);
        b3=new Button("MULTIPLY");
       b3.addActionListener(this);
       add(b3);
        b4=new Button("DIVIDE");
       b4.addActionListener(this);
       add(b4);
        b5=new Button("CLEAR");
       b5.addActionListener(this);
       add(b5);
        b6=new Button("EXIT");
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
            t1.setText(new String(""));
             t2.setText(new String(""));
            t3.setText(new String(""));}
   
  }
public void windowClosing(WindowEvent we){
          System.out.println("Closing the Application ");
          System.exit(0);
  }
public void windowClosed(WindowEvent we){}
public void windowOpened(WindowEvent we){}
public void windowActivated(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public static void main(String args[]){
   new CalculatorAWT();
}
}
       
