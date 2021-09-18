package com.sw.jspring.repository;
import com.sw.jspring.model.Speaker;
import com.sw.jspring.util.CalendarFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;



@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seednumber;


    @Autowired
    private Calendar mycal;

    @Override
    public List<Speaker>FindAll(){
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstname("Bose");
        speaker.setLastname("Smith");
        speaker.setSeednumber(seednumber);
        speakers.add(speaker);
        System.out.println(mycal.getTime());
        return speakers;
    }
}
