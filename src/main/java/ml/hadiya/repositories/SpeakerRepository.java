package ml.hadiya.repositories;

import ml.hadiya.models.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
