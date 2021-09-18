package com.sw.jspring.service;

import com.sw.jspring.model.Speaker;
import com.sw.jspring.repository.SpeakerRepository;
import com.sw.jspring.repository.HibernateSpeakerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository("speakerService")
public class SpeakerServiceImp implements SpeakerService {

    @Autowired
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

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker>FindAll(){
        return repository.FindAll();
    }
}
