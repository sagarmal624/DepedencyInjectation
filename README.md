# DepedencyInjectation
https://www.sagarandcompany.com/


# Dependency Lookup

-Dependency Lookup is looking up bean to use by using API provided in container.
Dependency Lookup example
```java
  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ColorManager colorManager = (ColorManager) context.getBean("colorManager");
        colorManager.printColor();
```

# Dependency Injection (DI)

JavaTpoint Defination-The Dependency Injection is a design pattern that removes the dependency of the programs.
Dependency Injection means that container automatically injects the dependency of each class based on bean definition.


![alt text](http://dev.anyframejava.org/docs.en/anyframe/plugin/essential/core/1.0.1/reference/image/core/spring/ioc-dependencyinjection.jpg)

# Spring framework provides two ways to inject dependency

# By Constructor
# By Setter method

# Xml based Injectation
# Annotation Based Injectation




