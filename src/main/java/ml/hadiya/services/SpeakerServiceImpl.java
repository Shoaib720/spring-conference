package ml.hadiya.services;

import ml.hadiya.models.Speaker;
import ml.hadiya.repositories.HibernateSpeakerRepositoryImpl;
import ml.hadiya.repositories.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private final SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();
    @Override
    public List<Speaker> listSpeakers() {
        return speakerRepository.findAll();
    }
}
