package ljx.ashin.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by AshinLiang on 2017/7/15.
 */
public class AppMain {
    public static void main(String[] args) {
        //第一种代理模式
        StudentService studentService = new StudentServiceImplProxy();
        studentService.getStudentInfo();
        System.out.println("=================================");

        //第二种代理模式
        StudentService studentService1 = (StudentService) Proxy.newProxyInstance(StudentService.class.getClassLoader(),
                new Class[]{StudentService.class}, new InvocationHandler() {

                    StudentService targetObj = new StudentServiceImpl();
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("动态代理添加日志");
                        Object result = method.invoke(targetObj,args);
                        System.out.println("动态代理日志");
                        return result;
                    }
                });
        studentService1.getStudentInfo();
    }
}
