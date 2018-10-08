package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void horoscope(Zodiac z) {
		switch (z) {
		case ARIES :
			JOptionPane.showMessageDialog(null, "Aries - You will fail your next test.");
			break;
		case TAURUS :
			JOptionPane.showMessageDialog(null, "Taurus - You will get scammed tomorrow.");
			break;
		case GEMINI :
			JOptionPane.showMessageDialog(null, "Gemini - You will win the lottery.");
			break;
		case CANCER :
			JOptionPane.showMessageDialog(null, "Cancer - You will experience failure soon.");
			break;
		case LEO :
			JOptionPane.showMessageDialog(null, "Leo - You will become addicted to video games.");
			break;
		case VIRGO :
			JOptionPane.showMessageDialog(null, "Virgo - You will have a great life.");
			break;
		case LIBRA :
			JOptionPane.showMessageDialog(null, "Libra - You will make a meme in the next week.");
			break;
		case SCORPIO :
			JOptionPane.showMessageDialog(null, "Scorpio - You will do something tomorrow.");
			break;
		case SAGITTARIUS :
			JOptionPane.showMessageDialog(null, "Sagittarius - You will not believe your horoscope anymore.");
			break;
		case CAPRICORN :
			JOptionPane.showMessageDialog(null, "Capricorn - You will get sick after reading this.");
			break;
		case AQUARIUS :
			JOptionPane.showMessageDialog(null, "Aquarius - You will win your next Fortnite game.");
			break;
		case PISCES :
			JOptionPane.showMessageDialog(null, "Pisces - You will become president some day.");
			break;
		default :
			System.out.println("error");
			break;
		}
	}
	// 3. Make a main method to test your method
	public static void main (String[] args) {
		Zodiac zodiac = Zodiac.VIRGO;
		horoscope(zodiac);
	}
}
