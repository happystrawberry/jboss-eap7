package com.sw.jspring.service;

import com.sw.jspring.model.Speaker;
import com.sw.jspring.repository.SpeakerRepository;

import java.util.List;

public interface SpeakerService {
    List<Speaker> FindAll();
    boolean getStockinfo(SpeakerRepository repository);
}
