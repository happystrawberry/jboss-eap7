import com.sw.jspring.service.SpeakerService;
import com.sw.jspring.service.SpeakerServiceImp;

public class Application {
    public static void main(String[] Args){
        SpeakerService speakerservice = new SpeakerServiceImp();
        System.out.println(speakerservice.FindAll().get(0).getFirstname());
        System.out.println(speakerservice.FindAll().get(0).getLastname());
    }
}
