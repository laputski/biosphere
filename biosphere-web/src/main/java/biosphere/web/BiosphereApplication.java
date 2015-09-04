package biosphere.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@PropertySources({
        @PropertySource(value = "classpath:config/application-${spring.profiles.active}.properties")
})
public class BiosphereApplication {

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/views/");
        resolver.setSuffix(".html");
        return resolver;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BiosphereApplication.class, args);
    }

}
