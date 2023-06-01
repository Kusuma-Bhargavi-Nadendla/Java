import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CardLayoutDemo extends JFrame implements ActionListener{

       CardLayout c1;
      JPanel card1,card2,card3,card4,npanel,spanel,panel;
      JButton next,previous,first,last,panel1,panel2,panel3,panel4;

      public CardLayoutDemo(){
          super("Card Layout Demo");
         setBounds(100,100,400,300);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       c1=new CardLayout();
        panel=new JPanel(c1);
        add(panel,BorderLayout.CENTER);

  
card1 = new JPanel();
card1.add(new JLabel("Card - 1"));
panel.add(card1, "card1");
card2 = new JPanel();
card2.add(new JLabel("Card - 2"));
panel.add(card2, "card2");
card3 = new JPanel();
card3.add(new JLabel("Card - 3"));
panel.add(card3, "card3");
card4 = new JPanel();
card4.add(new JLabel("Card - 4"));
panel.add(card4, "card4");

      npanel=new JPanel(new GridLayout(1,4));
      next=new JButton("Next");
      npanel.add(next);

     previous=new JButton("Previous");
      npanel.add(previous);

     first=new JButton("First");
      npanel.add(first);

      last=new JButton("Last");
      npanel.add(last);

        spanel=new JPanel(new GridLayout(1,4));
     panel1=new JButton("Panel1");
      spanel.add(panel1);

     panel2=new JButton("Panel2");
      spanel.add(panel2);

    panel3=new JButton("Panel3");
      spanel.add(panel3);

     panel4=new JButton("Panel4");
      spanel.add(panel4);

     add(npanel,BorderLayout.NORTH);
     add(spanel,BorderLayout.SOUTH);

       next.addActionListener(this);
       previous.addActionListener(this);
       first.addActionListener(this);
       last.addActionListener(this);
       panel1.addActionListener(this);
       panel2.addActionListener(this);
       panel3.addActionListener(this);
       panel4.addActionListener(this);
      
     setVisible(true);
}
public void actionPerformed(ActionEvent ae){
   if(ae.getSource()==next)
           c1.next(panel);
   else if(ae.getSource()==previous)
           c1.previous(panel);
   else if(ae.getSource()==first)
c1.first(panel);
else if(ae.getSource()==last)
c1.last(panel);
else if(ae.getSource()==panel1)
c1.show(panel, "card1");
else if(ae.getSource()==panel2)
c1.show(panel, "card2");
else if(ae.getSource()==panel3)
c1.show(panel, "card3");
else if(ae.getSource()==panel4)
c1.show(panel, "card4");
}
public static void main(String[] args){
 new CardLayoutDemo();
}
}
     
      
