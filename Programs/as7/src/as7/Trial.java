package as7;
import javax.swing.JOptionPane;

public class Trial {
	public static void main (String[] args){
		String out = "Rectangle\n"
				+ "length=3, width=2\n"
				+ "Rectangle\n"
				+ "length=6, width=4\n"
				+ "Rectangle\n"
				+ "length=30, width=20\n"
				+ "Sibling\n"
				+ "name=Jack, age=21, weight=130\n"
				+ "Sibling\n"
				+ "name=Judy, age=24, weight=118\n"		
				+ "Student\n"
				+ "id=1, name=John Adam, scores=93, 91, 100";
		JOptionPane.showMessageDialog (null, out);
	}
}
