import com.zhao.dao.UserMapper;
import com.zhao.pojo.User;
import com.zhao.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test(){
      ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
      UserMapper userMapper=context.getBean("userMapper",UserMapper.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }
}
