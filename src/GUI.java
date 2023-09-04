import javax.swing.JOptionPane;

public class GUI {

    public static void main(String []args) {

     String name = JOptionPane.showInputDialog("enter your name");
     JOptionPane.showMessageDialog (null, "Hello " + name);

     int age = Integer.parseInt( (JOptionPane.showInputDialog("how old are you ?") ) ) ;
     JOptionPane.showMessageDialog(null, "you are " +age+ " years old");

     double height = Double.parseDouble (JOptionPane.showInputDialog("Height ?"));
     JOptionPane.showMessageDialog(null, "you are " +height+ " cm");

    }
}
