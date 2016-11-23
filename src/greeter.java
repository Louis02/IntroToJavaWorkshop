import javax.swing.JOptionPane;

public class greeter {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Hello how old are you");
		String sport = JOptionPane.showInputDialog("What is your favorite sport");
		String book = JOptionPane.showInputDialog("  What is your favorite book");
		String rest = JOptionPane.showInputDialog("What is  your favorite restaurant");
		System.out.println("I know you are " + answer + ".  I would love to go " + sport + 
				" with you.  Could you please lend me " + book + ".  Maybe we could talk more at " + rest);
	}

}