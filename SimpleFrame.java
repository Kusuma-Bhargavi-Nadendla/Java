import java.awt.*;
import java.awt.event.*;

class SimpleFrame extends Frame implements WindowListener{

      public SimpleFrame(){
          super("My Frame");
          setBounds(100,100,400,300);
          this.addWindowListener(this);
          setVisible(true);
     }

     public void windowClosing(WindowEvent we){
              System.out.println("Window closing");
             System.exit(0);
    }

   public void windowClosed(WindowEvent we){
              System.out.println("Window closed");
             
    }

   public void windowOpened(WindowEvent we){
              System.out.println("Window opened");
           
    }
   public void windowIconified(WindowEvent we){
              System.out.println("Window Iconified");
            
    }
   public void windowDeiconified(WindowEvent we){
              System.out.println("Window DeIconified");
           
    }
  
    public void windowActivated(WindowEvent we){
              System.out.println("Window Activated");
             
    }
   public void windowDeactivated(WindowEvent we){
              System.out.println("Window DeActivated");
            
    }
    public static void main(String[] args){
           new SimpleFrame();
    }
}

    
