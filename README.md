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

* By Constructor
* By Setter method

# Xml based Injectation
# Annotation Based Injectation
# Java Configuration



#By Setter Method:

1. In Setter Injection, partial injection of dependencies can possible, means if we have 3 dependencies like int, string, long, then its not necessary to inject all values if we use setter injection. If you are not inject it will takes default values for those primitives

2. Setter Injection will overrides the constructor injection value, provided if we write setter and constructor injection for the same property [i already told regarding this, hope you remember ]

3. If we have more dependencies for example 15 to 20 are there in our bean class then, in this case setter injection is not recommended as we need to write almost 20 setters right, bean length will increase.

4. Setter injection makes bean class object as mutable [We can change ]


# Constructor Method

1. In constructor injection, partial injection of dependencies cannot possible, because for calling constructor we must pass all the arguments right, if not so we may get error
  
2. But, constructor injection cannot overrides the setter injected values
	
  3. In this case, Constructor injection is highly recommended, as we can inject all the dependencies with in 3 to 4 lines [i mean, by calling one constructor]
  
  
  4. Constructor injection makes bean class object as immutable [We cannot change ]

2. But, constructor injection cannot overrides the setter injected values
    

