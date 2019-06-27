package comlzc.testservice01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Testservice01ApplicationTests {

    @Test
    public void path(HttpServletRequest request){
        String realPath = request.getServletContext().getRealPath("/static");
        System.out.println(realPath);
    }
}
