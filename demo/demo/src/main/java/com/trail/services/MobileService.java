package com.trail.services;

import com.trail.contoller.RequestDTO;
import com.trail.contoller.ResponseDTO;
import com.trail.model.Mobile;
import com.trail.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileService {

    @Autowired
    private MobileRepository repository;

    public Mobile addMobile(Mobile mobile){
        return repository.save(mobile);
    }

    public List<Mobile> viewAllMobile(){
        return repository.findAll();
    }

    public List<Mobile> viewByBrand(String brandName){
        return repository.findByBrand(brandName);
    }

    public ResponseDTO testAPI(RequestDTO requestDTO){
        String bName = requestDTO.getBrandName();

        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setListOfMobiles(repository.findByBrand(bName));

        return responseDTO;
    }
}
