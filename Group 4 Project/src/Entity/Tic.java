package Entity;

import javax.swing.ImageIcon;

public class Tic extends Toes{
	public static final ImageIcon x = new ImageIcon("Images/circle.png");
	
	public Tic(){}
	
	public Tic(String Symbol) {
		super(Symbol);
	}
	
	public ImageIcon getIcon() {
		return x;
	}
	
}
