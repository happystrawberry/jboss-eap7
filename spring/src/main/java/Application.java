import com.sw.jspring.repository.HibernateSpeakerRepositoryImpl;
import com.sw.jspring.repository.SpeakerRepository;
import com.sw.jspring.service.SpeakerService;
import com.sw.jspring.service.SpeakerServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] Args){
        ApplicationContext appContext = new ClassPathXmlApplicationContext("simpleContext.xml");

        //SpeakerService speakerservice = new SpeakerServiceImp();

        SpeakerService speakerservice = appContext.getBean("speakerService", SpeakerService.class );
        SpeakerRepository speakerRepo = appContext.getBean("speakerRepository", HibernateSpeakerRepositoryImpl.class);
        System.out.println(speakerservice.FindAll().get(0).getFirstname());
        System.out.println(speakerservice.FindAll().get(0).getLastname());
        SpeakerService speakerservice2 = appContext.getBean("getSpeakers", SpeakerService.class);
        System.out.println(speakerservice);
        System.out.println(speakerservice2.getStockinfo(speakerRepo));
    }
}
