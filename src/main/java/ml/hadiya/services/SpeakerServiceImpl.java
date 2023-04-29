package ml.hadiya.services;

import ml.hadiya.models.Speaker;
import ml.hadiya.repositories.HibernateSpeakerRepositoryImpl;
import ml.hadiya.repositories.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository;

    // Using constructor injection
    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.speakerRepository = repository;
    }
    @Override
    public List<Speaker> listSpeakers() {
        return speakerRepository.findAll();
    }

    // Using setter injection
    public void setSpeakerRepository(SpeakerRepository repository) {
        this.speakerRepository = repository;
    }
}
