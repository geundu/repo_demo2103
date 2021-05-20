package design.duck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DuckTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("design/duck/duckBean.xml");

		System.out.println(context);

		Duck woodDuck = null;
		woodDuck = (Duck) context.getBean("woodDuck");
		woodDuck.display();
		woodDuck.performFly();
		woodDuck.performQuack();

		Duck rubberDuck = null;
		rubberDuck = (Duck) context.getBean("rubberDuck");
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();

		Duck mallardDuck = null;
		mallardDuck = (Duck) context.getBean("mallardDuck");
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
	}
}
