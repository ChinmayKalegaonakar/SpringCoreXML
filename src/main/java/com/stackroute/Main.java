package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
    //XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("Configuration.xml"));
    ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");

    Movie beanA = (Movie) context.getBean("movie1",Movie.class);
    // should print actor1 male 28
    beanA.printActor();
	}

}
