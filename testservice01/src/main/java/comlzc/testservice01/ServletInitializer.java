package comlzc.testservice01;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//注意，如果您正在构建WAR文件并部署它，则需要WebApplicationInitializer。
////        如果你喜欢运行一个嵌入式Web服务器，那么你根本不需要这个。
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Testservice01Application.class);
    }

}
