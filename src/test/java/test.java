import com.ithei.dao.IUserDao;
import com.ithei.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class test {
    public static void main(String[] args) throws Exception{
        InputStream in= Resources.getResourceAsStream("mybatis-config");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        SqlSession session=factory.openSession();
        IUserDao userDao=session.getMapper(IUserDao.class);
        List<User>users=userDao.findAll();
        for (User user:users) {
            System.out.println(user.toString());
        }
    }
}
