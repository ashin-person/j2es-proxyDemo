package ljx.ashin.proxy;

/**
 * 代理模式中的目标类
 * Created by AshinLiang on 2017/7/15.
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public String getStudentInfo() {
        System.out.println("目标类StudentServiceImpl实现业务逻辑");
        return null;
    }
}
