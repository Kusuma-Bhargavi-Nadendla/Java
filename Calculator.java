import java.awt.*;
import java.awt.event.*;

public class CalculatorExample extends Frame implements ActionListener{
    TextField txt1, txt2, txt3;
    Button btnAdd, btnSub, btnMul, btnDiv, btnClear, btnExit; 

    public CalculatorExample(){
        super("Simple calculator Application");
        setBounds(100, 100, 300, 300);
        setLayout(new GridLayout(6, 2, 5, 5));

        add(new Label("First Number "));
        txt1 = new TextField();
        add(txt1);

        add(new Label("Second Number "));
        txt2 = new TextField();
        add(txt2);

        add(new Label("Result "));
        txt3 = new TextField();
        add(txt3);

        btnAdd = new Button("Adition");
        btnAdd.addActionListener(this);
        add(btnAdd);

        btnSub = new Button("Subtraction");
        btnSub.addActionListener(this);
        add(btnSub);

        btnMul = new Button("Multiply");
        btnMul.addActionListener(this);
        add(btnMul);

        btnDiv = new Button("Division");
        btnDiv.addActionListener(this);
        add(btnDiv);

        btnClear = new Button("Clear");
        btnClear.addActionListener(this);
        add(btnClear);

        btnExit = new Button("Exit");
        btnExit.addActionListener(this);
        add(btnExit);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        setVisible(true);
    }

    public Insets getInsets(){
        return new Insets(40, 10, 10, 10);
    }

    public void actionPerformed(ActionEvent ae){
        float x=0, y=0, z=0;
        try{
            x = Float.parseFloat(txt1.getText());
            y = Float.parseFloat(txt2.getText());
        }catch(Exception e){
            System.out.println(e);
        }
        if(ae.getSource()==btnAdd){
            z = x + y;
            txt3.setText(String.valueOf(z));
        } 
        else if(ae.getSource()==btnSub){
            z = x - y;
            txt3.setText(String.valueOf(z));
        }
        else if(ae.getSource()==btnMul){
            z = x * y;
            txt3.setText(String.valueOf(z));
        }
        else if(ae.getSource()==btnDiv){
            z = x / y;
            txt3.setText(String.valueOf(z));
        }
        else if(ae.getSource()==btnClear){
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
        } 
        else
        System.exit(0);;

    }
    public static void main(String[] args) {
        new CalculatorExample();
    }
}
