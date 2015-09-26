package gq.bithub.wayne.springDemo;

/**
 * @author wayne
 *
 */
public class Triangle {
	private String type;
	private int height;
	public int getHeight() {
		return height;
	}

	public Triangle(String type) {
		this.type = type;
	}

	public Triangle(int height) {
		this.height = height;
	}


	
	public String getType() {
		return type;
	}

	/*
	 * public void setType(String type) { this.type = type; }
	 */
	public void draw() {
		System.out.println(getType() + " Triangle drawn." + getHeight());

	}
}
