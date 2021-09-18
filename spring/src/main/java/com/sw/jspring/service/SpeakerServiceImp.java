package com.sw.jspring.service;

import com.sw.jspring.model.Speaker;
import com.sw.jspring.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImp implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImp(){

    }

    public SpeakerServiceImp(SpeakerRepository repository) {
        this.repository = repository;
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker>FindAll(){
        return repository.FindAll();
    }

    @Override
    public boolean getStockinfo(SpeakerRepository repository){
        //System.out.println("");
        return false;
    }
}

