package gq.bithub.wayne.springDemo;

/**
 * @author wayne
 *
 */
public class Triangle {
	private point pointA;
	private point pointB;
	public point getPointA() {
		return pointA;
	}


	public void setPointA(point pointA) {
		this.pointA = pointA;
	}


	public point getPointB() {
		return pointB;
	}


	public void setPointB(point pointB) {
		this.pointB = pointB;
	}


	public point getPointC() {
		return pointC;
	}


	public void setPointC(point pointC) {
		this.pointC = pointC;
	}


	private point pointC;
	
	
	public void draw() {
		System.out.println("pointA = ( "+ getPointA().getX() + "," + getPointA().getY()+")");
		System.out.println("pointB = ( "+ getPointB().getX() + "," + getPointB().getY()+")");
		System.out.println("pointC = ( "+ getPointC().getX() + "," + getPointC().getY()+")");
	}
}
