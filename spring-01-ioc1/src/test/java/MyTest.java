import com.zhao.dao.UserDaoMysqlImpl;
import com.zhao.service.UserService;
import com.zhao.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        //用户实际调用的是业务层，dao层不需要接触
//        UserService userService=new UserServiceImpl();
//
//        ((UserServiceImpl)userService).setUserDao(new UserDaoMysqlImpl());

        //获取ApplicationContext,拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext( "beans.xml");
        //需要什么，就get什么。
        UserServiceImpl userService=(UserServiceImpl) context.getBean("UserServiceImpl");
        userService.getUser();
    }
}
