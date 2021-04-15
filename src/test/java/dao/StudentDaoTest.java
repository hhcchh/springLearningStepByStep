package dao;

import com.yc.biz.StudentBizImpl;
import com.yc.dao.StudentDao;
import com.yc.dao.StudentDaoMybatisImpl;
import junit.framework.TestCase;

public class StudentDaoTest extends TestCase {
    private StudentDao studentDao;
    private StudentBizImpl studentBizImp;

    @Override
    public void setUp() throws Exception {
        //1.能否自动完成  实例化对象  -》IOC 控制 反转  -》由容器实例化对象，由容器来完成
        studentDao =new StudentDaoMybatisImpl();

        studentBizImp =new StudentBizImpl();
        //2.能否自动完成  装配过程   -》DI 依赖注入 -》 用容器装配对象
        studentBizImp.setStudentDao(studentDao);

    }

    public void testAdd() {
        studentDao.add("张3");
    }

    public void testUpdate() {
        studentDao.update("张3");
    }
    public void testBizAdd(){
        studentBizImp.add("张三");
    }
}
