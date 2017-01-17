package ua.goit.offline;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.goit.offline.api.LoginService;
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        LoginService userCache = (LoginService) applicationContext.getBean("loginService");
        System.out.println(userCache.login("UserName", "test"));
    }
}
