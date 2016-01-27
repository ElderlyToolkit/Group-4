package DarylUI;

import javax.swing.ImageIcon;

public class Tac extends Toes{
	public static final ImageIcon x = new ImageIcon("Images/x.png");
	
	public Tac(){}
	
	public Tac(char Symbol) {
		super(Symbol);
	}
	
	public ImageIcon getIcon() {
		return x;
	}
	
}
