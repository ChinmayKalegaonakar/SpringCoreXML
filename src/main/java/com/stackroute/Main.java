package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
    //XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("Configuration.xml"));
    ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");

    Movie beanA = (Movie) context.getBean("movie1");
    // should print actor1 male 28
    beanA.printActor();
    Movie beanB = (Movie) context.getBean("movie1");
    // false when scope is prototype
    System.out.println(beanA==beanB);
    Movie beanC = (Movie) context.getBean("movie2");
    // should print actor1 male 28
    beanC.printActor();
	}

}
