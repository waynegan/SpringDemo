package gq.bithub.wayne.springDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author wayne
 *
 */
public class Triangle implements ApplicationContextAware, BeanNameAware {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	private ApplicationContext context = null;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("pointA = ( " + getPointA().getX() + "," + getPointA().getY() + ")");
		System.out.println("pointB = ( " + getPointB().getX() + "," + getPointB().getY() + ")");
		System.out.println("pointC = ( " + getPointC().getX() + "," + getPointC().getY() + ")");
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;

	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is :" + beanName);

	}
}
