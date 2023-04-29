import ml.hadiya.services.SpeakerService;
import ml.hadiya.services.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args) {
        SpeakerService speakerService = new SpeakerServiceImpl();
        System.out.println(speakerService.listSpeakers().get(0).getFirstName());
    }
}
