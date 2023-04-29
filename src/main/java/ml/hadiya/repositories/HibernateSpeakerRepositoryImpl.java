package ml.hadiya.repositories;

import ml.hadiya.models.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Shoaib");
        speaker.setLastName("Shaikh");
        speakers.add(speaker);
        return speakers;
    }
}
