import com.sw.jspring.service.SpeakerService;
import com.sw.jspring.service.SpeakerServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] Args){
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService speakerservice = appContext.getBean("speakerService", SpeakerService.class );
        System.out.println(speakerservice.FindAll().get(0).getFirstname());
        System.out.println(speakerservice.FindAll().get(0).getLastname());
        SpeakerService speakerservice2 = appContext.getBean("speakerService", SpeakerService.class );
        System.out.println(speakerservice);
        System.out.println(speakerservice2);
    }
}
