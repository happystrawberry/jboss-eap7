package com.sw.jspring.service;

import com.sw.jspring.model.Speaker;
import com.sw.jspring.repository.SpeakerRepository;
import com.sw.jspring.repository.HibernateSpeakerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

public class SpeakerServiceImp implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();


    @Override
    public List<Speaker>FindAll(){
        return repository.FindAll();
    }


}
