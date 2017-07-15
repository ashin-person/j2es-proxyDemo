package ljx.ashin.proxy;

/**
 * 代理模式中的代理类
 * Created by AshinLiang on 2017/7/15.
 */
public class StudentServiceImplProxy implements StudentService {
    //目标类
    private StudentService studentServiceImpl = new StudentServiceImpl();

    @Override
    public String getStudentInfo() {
        System.out.println("代理类添加日志");
        studentServiceImpl.getStudentInfo();
        System.out.println("代理类日志");
        return null;
    }
}
