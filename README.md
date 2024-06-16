# SpringBean
In this project I have implemented the topics like Inversion of Control, Scopes, Dependency Injection, Loggers, Themleaf.
In this application I have implemented the following topics with example:
- Bean is known as a Java object in Spring
- Mostly there is 2 types of scopes like Singleton and Prototype:
	Singleton: It is default one and only one object is created in the ApplicationContext.
	Prototype: We have to use @Scope annotation to use this scope in this for each bean we have
			different objects in the ApplicationContext.
- IOC Container is therotical concept which means all the Spring Beans(Java objects) stay inside this but 
	in real life ApplicationContext will implement it.
- Use MVC Design pattern like Model view Controller So here Controller get the request and Model will give 
	the Data by processing it with the help of service and view can be any appliction like developed
	in Angular or React or simply I used Thymeleaf here.
- Used Thymeleaf to print basic details.
- Give a detailed explanation of Dependency Injection so in Main I have created a Vehicle
Class and make two classes Bike and Car. Based on the @Component annotation I can use that particular
bean. But in Some cases we have to use one as a Primary so to use it I used @Primary annotation.
- We can use @Qualifier annotation to define in @Value annotation to use which type of bean we want to use.
- I done some changes on the Application.properties file to do configration like setting server port.
or Database configration.
- Use @Requestparam to get values from URL.
- Use SLF4J logger to print different loggers, different types of loggers are there like
error, Warning, Debug, Information, Trace.
- Each logger have there importance depend on the environment this loggers are set.
Like while working in the Local we have to use Debug and Trace logger.
For Test Environment we can use Information logger.
And for Pre-Production or Production we can use Warning or Error because there we have to give less
information so less resource is used in production Environment.
 

