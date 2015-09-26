package gq.bithub.wayne.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author wayne
 *
 */
public class DrawingApp {
	private static ApplicationContext context;

	public static void main(String[] args) {
		// Triangle triangle = new Triangle();
		context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle obj = (Triangle) context.getBean("Triangle");
		obj.draw();

	}
}
