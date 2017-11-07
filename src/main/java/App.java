import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main( String[] args )
    {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("/Application.xml");
        Person p1 = appContext.getBean(Person.class);
        System.out.println("1 " + System.identityHashCode(p1));

        Person p2 = appContext.getBean(Person.class);
        System.out.println("2 " + System.identityHashCode(p2));

    }
}