import com.pyb.dao.UserDAOMysqlImpl;
import com.pyb.service.UserService;
import com.pyb.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring-study
 * @description:
 * @author: peng yu bin
 * @create: 2020-04-17 16:31
 */
public class MyTest {
    public static void main(String[] args) {
        //拿到spring的容器
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");

        userService.getUser();
    }
}
