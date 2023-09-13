import java.awt.*;

public class guiApplication{
    public static void main(String[] args) {
        Frame f = new Frame("GUI application");
        Label l1 = new Label("First Name: ");
        l1.setBounds(60,50,65,20);
        f.add(l1);
        Label l2 = new Label("Last Name: ");
        l2.setBounds(60,100,65,20);
        f.add(l2);
        Label l3 = new Label("Age: ");
        l3.setBounds(100,150,30,20);
        f.add(l3);
        TextField t1 = new TextField();
        t1.setBounds(135,50,80,20);
        f.add(t1);
        TextField t2 = new TextField();
        t2.setBounds(135,100,80,20);
        f.add(t2);
        TextField t3 = new TextField();
        t3.setBounds(135,150,80,20);
        f.add(t3);
        Button b1 = new Button("Submit");
        b1.setBounds(50,200,80,30);
        f.add(b1);
        Button b2 = new Button("Reset");
        b2.setBounds(140,200,80,30);
        f.add(b2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
}