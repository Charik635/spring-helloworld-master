import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beans = (HelloWorld) applicationContext.getBean("helloworld");
        Cat be = (Cat) applicationContext.getBean("cat");
        Cat bee = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.getMessage());
        System.out.println(be.getMessage());
        System.out.println(bean == beans);
        System.out.println(bee == be);
        

    }
}