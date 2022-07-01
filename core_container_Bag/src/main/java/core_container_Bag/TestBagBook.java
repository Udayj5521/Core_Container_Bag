package core_container_Bag;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBagBook {
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("BagBook.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Bag bag = (Bag) beanFactory.getBean("myBag");

		System.out.println("Bag Name is: " + bag.getName());
		System.out.println("Bag Feature is: " + bag.getFeature());
		System.out.println("----------------------------");
		System.out.println("Book Name is: " + bag.getBook().getBookname());
		System.out.println("Book Brand is: " + bag.getBook().getBrand());
	}

}
