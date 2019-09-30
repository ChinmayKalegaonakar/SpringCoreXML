package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
  @Override
  public void destroy() throws Exception {
    System.out.println("object destroyed");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("Properties set");
  }
  public void customInit(){
    System.out.println("Custom init called");
  }
  public void customDestroy(){
    System.out.println("Custom destroy called");
  }
}
