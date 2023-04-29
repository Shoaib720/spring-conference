import ml.hadiya.services.SpeakerService;
import ml.hadiya.services.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        /*
        * This below line will create an application context using out AppConfig and create a register with
        * 2 beans in it.
        * */
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        SpeakerService speakerService = new SpeakerServiceImpl();
        SpeakerService speakerService = context.getBean("speakerService", SpeakerService.class);

        System.out.println(speakerService.listSpeakers().get(0).getFirstName());
    }
}
