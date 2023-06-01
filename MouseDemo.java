import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MouseDemo extends JFrame implements MouseListener,MouseMotionListener{
      JLabel lb1;
      public MouseDemo(){
          super("Mouse Demo");
          setBounds(100,100,400,300);
           lb1=new JLabel("Hi");
        add(lb1);
        lb1.addMouseListener(this);
        addMouseMotionListener(this);
       setVisible(true);
      }

     public void mouseEntered(MouseEvent me){
           lb1.setText("Mouse Entered");
           lb1.setBackground(Color.red);
    }
     
     public void mouseExited(MouseEvent me){
           lb1.setText("Mouse Exited");
           lb1.setBackground(Color.blue);
    }
     
     public void mouseClicked(MouseEvent me){
           lb1.setText("Mouse Clicked");
           lb1.setBackground(Color.green);
    }
     
     public void mousePressed(MouseEvent me){
           lb1.setText("Mouse Pressed");
           lb1.setBackground(Color.yellow);
    }
     
     public void mouseReleased(MouseEvent me){
           lb1.setText("Mouse Released");
           lb1.setBackground(Color.black);
    }
     public void mouseMoved(MouseEvent me){
           lb1.setText("Mouse Moved");
           lb1.setBackground(Color.pink);
    }
     
     public void mouseDragged(MouseEvent me){
           lb1.setText("Mouse Dragged");
           lb1.setBackground(Color.orange);
    }public static void main(String[] args){
               new MouseDemo();
      }
     }
     
