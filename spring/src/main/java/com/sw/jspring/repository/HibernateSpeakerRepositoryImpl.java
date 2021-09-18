package com.sw.jspring.repository;
import com.sw.jspring.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker>FindAll(){
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstname("Bose");
        speaker.setLastname("Smith");
        speakers.add(speaker);
        return speakers;
    }

}
