package ml.hadiya.services;

import ml.hadiya.models.Speaker;
import ml.hadiya.repositories.HibernateSpeakerRepositoryImpl;
import ml.hadiya.repositories.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository;
    @Override
    public List<Speaker> listSpeakers() {
        return speakerRepository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.speakerRepository = repository;
    }
}
