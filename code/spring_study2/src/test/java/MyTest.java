import com.chenxk.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/7 15:01
 */
public class MyTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        //根据bean标签的id来获取对象
        Person person = context.getBean("person",Person.class);
        System.out.println(person);

        //根据bean的类型来获取对象
        //注意：当通过类型进行获取的时候，如果存在两个相同类型的对象，将无法完成获取工作
//        Person bean = context.getBean(Person.class);
//        System.out.println(bean);
        /*
        * 当需要从容器中获取对象的时候，最好要保留无参构造方法，因为底层的实现是反射
        *
        * Class clazz = Person.class;
        * Object obj = clazz.newInstance(): 默认调用无参构造方法，此方法已经被弃用
        * Object obj = clazz.getDeclaredConstructor().newInstance();
        * */

        Person person1 = context.getBean("person5",Person.class);
        System.out.println(person1);

    }
}
