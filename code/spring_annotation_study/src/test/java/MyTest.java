import com.chenxk.controller.PersonController;
import com.chenxk.service.PersonService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/8 15:04
 */
/*
* 注意：给测试类起名字的时候千万不要定义成Test
*      测试的方法不可以有参数，不可以有返回值
* */
public class MyTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonController personController = context.getBean("personController02",PersonController.class);
//        System.out.println(personController);
//        PersonService personService = context.getBean("personService",PersonService.class);
//        System.out.println(personService);
        personController.save();
    }
}
