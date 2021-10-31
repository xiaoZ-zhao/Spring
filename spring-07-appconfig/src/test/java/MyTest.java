import com.zhao.config.ZhaoConfig;
import com.zhao.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        //如果完全使用配置类的方法做，我们就只能通过ApplicationContext上下文获取容器，通过配置类class加载
        ApplicationContext context=new AnnotationConfigApplicationContext(ZhaoConfig.class);
        User user=(User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
