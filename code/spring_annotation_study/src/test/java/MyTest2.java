import com.chenxk.service.StudentService;
import com.chenxk.service.TeacherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/8 16:30
 */
public class MyTest2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.save();
        TeacherService teacherService = context.getBean("teacherService", TeacherService.class);
        teacherService.save();
    }
}
