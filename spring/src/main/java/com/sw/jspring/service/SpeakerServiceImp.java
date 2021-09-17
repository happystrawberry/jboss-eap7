package com.sw.jspring.service;

import com.sw.jspring.model.Speaker;
import com.sw.jspring.repository.SpeakerRepository;
import com.sw.jspring.repository.HibernateSpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImp implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker>FindAll(){
        return repository.FindAll();
    }
}
