import java.awt.*;
import java.awt.event.*;

class ColorFrame extends Frame implements WindowListener,ItemListener{
        
        Checkbox rb1,rb2,rb3,rb4;
      
       Panel frame;

      public ColorFrame(){

         super("Color the Frame");
        frame=new Panel();
       setLayout(new BorderLayout());
       setBounds(100,100,400,300);
       this.addWindowListener(this);

        
        CheckboxGroup cg=new CheckboxGroup();

      
         rb1=new Checkbox("Red",false,cg);
        frame.add(rb1);

            rb2=new Checkbox("Green",false,cg);
        frame.add(rb2);

     
            rb3=new Checkbox("Blue",false,cg);
        frame.add(rb3);

       
            rb4=new Checkbox("Black",false,cg);
        frame.add(rb4);

          rb1.addItemListener(this);
         rb2.addItemListener(this);
         rb3.addItemListener(this);
         rb4.addItemListener(this);
        this.add(frame);
          setVisible(true);
     }

     public void itemStateChanged(ItemEvent ie){
      if(ie.getSource()==rb1)
            frame.setBackground(Color.red);
      else if(ie.getSource()==rb2)
            frame.setBackground(Color.green);
      else if(ie.getSource()==rb3)
            frame.setBackground(Color.blue);
      else 
             frame.setBackground(Color.black);
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
    public static void main(String[] args){
           new ColorFrame();
    }
}

    
