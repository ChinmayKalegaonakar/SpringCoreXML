package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main {

	public static void main(String[] args) {

    XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("Configuration.xml"));
    DefaultListableBeanFactory listBeanFactory = new DefaultListableBeanFactory();
    BeanDefinitionReader reader = new XmlBeanDefinitionReader(listBeanFactory);
    reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/Configuration.xml"));
    ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
    Movie beanFMovie =(Movie) beanFactory.getBean("movie1");
    Movie beanDMovie = (Movie) beanFactory.getBean("movie1");
    Movie movie = (Movie) context.getBean("movie1");

    // should print actor1 male 30
    beanFMovie.printActor();
    beanDMovie.printActor();
    movie.printActor();


	}

}
