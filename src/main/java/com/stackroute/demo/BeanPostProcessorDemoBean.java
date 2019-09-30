package com.stackroute.demo;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {

  public void toS() {
    System.out.println("Bean post process called");
  }
}
