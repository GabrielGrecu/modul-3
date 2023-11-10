import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        School firstSchool = context.getBean("school", School.class);
        School secondSchool = context.getBean("school", School.class);

        System.out.println(firstSchool.getAddress().getStreetName());

        System.out.println(firstSchool == secondSchool);
        context.close();
    }




}
