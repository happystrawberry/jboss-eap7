package com.sw.jspring.service;

import com.sw.jspring.model.Speaker;
import com.sw.jspring.repository.SpeakerRepository;
import com.sw.jspring.repository.HibernateSpeakerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.List;



@Service("speakerService")
//@Profile("dev")
public class SpeakerServiceImp implements SpeakerService {


    private SpeakerRepository repository;

    public SpeakerServiceImp(){
        //
    }

    public void initialize(){
        System.out.println("It is a call for post constructor");
    }

    public SpeakerServiceImp(SpeakerRepository spRepository) {
        this.repository = spRepository;
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker>FindAll(){
        return repository.FindAll();
    }
}
