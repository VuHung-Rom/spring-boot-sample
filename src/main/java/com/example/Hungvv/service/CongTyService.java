package com.example.Hungvv.service;

import com.example.Hungvv.entity.Congty;
import com.example.Hungvv.respository.CongTyRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CongTyService {
    @Autowired
    private CongTyRespository congtyRepository;

    public List<Congty> getAllCongty() {
        return (List<Congty>) congtyRepository.findAll();
    }

    public Congty findCongtyByMact(String mact) {
        return congtyRepository.findCongtyByMact(mact).stream().findFirst().orElse(null);
    }

    public void createCongty(Congty congty) {
        congtyRepository.save(congty);
    }

    public void updateCongty(Congty congty) {
        congtyRepository.save(congty);
    }

    public boolean isTenCongtyUnique(String tenct) {
        return congtyRepository.existsByTenct(tenct);
    }
}

