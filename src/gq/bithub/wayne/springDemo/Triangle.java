package gq.bithub.wayne.springDemo;

import java.util.List;

/**
 * @author wayne
 *
 */
public class Triangle {

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		for (Point point : points) {
			System.out.println("point A = (" + point.getX() + " ," + point.getY() + ")");

		}

	}
}
