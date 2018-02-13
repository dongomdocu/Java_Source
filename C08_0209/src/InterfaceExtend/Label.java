package InterfaceExtend;

class Label implements Changeable {
	
	String text;
	int width, height;
	String foreground, background;
	String font;
	
	Label(String text, int width, int height, String forground, String background, String font) {
		this.text = text;
		this.width = width;
		this.height = height;
		this.foreground = forground;
		this.background = background;
		this.font = font;
	}
	
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void setForeground(String color) {
		this.foreground = foreground;
	}
	
	public void setBackground(String color) {
		this.background = background;
	}
	
	public void setFont(String font) {
		this.font = font;
	}
}
