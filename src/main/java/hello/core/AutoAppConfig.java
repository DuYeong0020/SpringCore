package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //
        // basePackages =  "hello.core.member", // member만 찾는다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
// AppConfig.class에서 @Configuration을 보면 @Conponent가 있기 때문에 자동 등록한다. 그렇기에 제외시킨다.
public class AutoAppConfig {
}
