import ml.hadiya.repositories.HibernateSpeakerRepositoryImpl;
import ml.hadiya.repositories.SpeakerRepository;
import ml.hadiya.services.SpeakerService;
import ml.hadiya.services.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    /*
    * Why don't we just create a new object of HibernateSpeakerRepositoryImpl while doing service.setSpeakerRepository?
    * eg. service.setSpeakerRepository(new HibernateSpeakerRepositoryImpl());
    *
    * Because this will create instance of HibernateSpeakerRepositoryImpl class again and again.
    *
    * We will leave all instance creations on Bean as it is a Singleton and will manage to create 1 instance only
    * throughout application.
    * */

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        return new SpeakerServiceImpl(getSpeakerRepository());
    }

    @Bean("speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
