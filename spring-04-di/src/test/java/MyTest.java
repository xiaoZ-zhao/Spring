import com.zhao.pojo.Student;
import com.zhao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student=(Student) context.getBean("student");
        System.out.println(student.toString());
    }

    /*
    Student{
        name='张三',
        address=Address{address='西安'},
        books=[红楼梦, 水浒传, 西游记, 三国演义],
        hobbys=[听歌, 看电影, 读书, 学习],
        card={身份证=12312354662521522, 银行卡=7854125645232856222},
        games=[CoC, lol, bob],
        wife='null',
         info={password=123456, sex=男, driver=20190525, username=小明}
         }
     */

    @Test
    public void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("userBean.xml");
//        User user=(User) context.getBean("user2");
        User user=context.getBean("user2",User.class);
        User user2=context.getBean("user2",User.class);

        System.out.println(user==user2);
    }
}
