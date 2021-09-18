import com.sw.jspring.repository.HibernateSpeakerRepositoryImpl;
import com.sw.jspring.repository.SpeakerRepository;
import com.sw.jspring.service.SpeakerService;
import com.sw.jspring.service.SpeakerServiceImp;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.sw.jspring"})
public class AppConfig {
/*
    @Bean(name = "speakerService")
    //@Scope(value = BeanDefinition.SCOPE_SINGLETON)
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService(){
        SpeakerServiceImp services = new SpeakerServiceImp();
        //service.setRepository(getSpeakerRepository());
        return services;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

 */
}
