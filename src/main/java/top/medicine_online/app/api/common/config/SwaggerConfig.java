package top.medicine_online.app.api.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("资源分享应用 API")
                        .contact(new Contact().name("zhr").email("2569876934@qq.com"))
                        .version("1.0")
                        .description("资源分享应用 API 接口文档")
                        .license(new License().name("Apache 2.0").url("http://doc.xiaominfo.com"))
                );
    }
}
