package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday" :
			JOptionPane.showMessageDialog(null, "today");
			break;
		case "Monday" :
			String[] arr = {"Yes", "Yes"};
			JOptionPane.showOptionDialog(null, "Is Monday the worst day of the week?", "Question", 0, -1, null, arr, 0);
			break;
		case "Tuesday" :
			JOptionPane.showMessageDialog(null, "fsdafsdfsdfsdafdsaf");
			break;
		case "Wednesday" :
			JOptionPane.showMessageDialog(null, "Nothing here");
			break;
		case "Thursday" :
			JOptionPane.showMessageDialog(null, "Almost Friday I guess");
			break;
		case "Friday" :
			JOptionPane.showMessageDialog(null, "Can't think of anything to write");
			break;
		case "Saturday" :
			JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
					options, 0);
			break;
		default :
			System.out.println("error");
			break;
		}
	}
}
