package com.example.liveasy.service.impl;

import com.example.liveasy.dto.LoadDetailsReq;
import com.example.liveasy.entity.LoadEntity;
import com.example.liveasy.repository.LoadRepository;
import com.example.liveasy.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadServiceImpl implements LoadService {

    @Autowired
    private LoadRepository loadRepository;
    @Override
    public String addLoad(LoadDetailsReq loadDetailsReq) {

        LoadEntity loadEntity = new LoadEntity(null,loadDetailsReq.getLoadingPoint(),loadDetailsReq.getUnloadingPoint(),
                loadDetailsReq.getProductType(),loadDetailsReq.getTruckType(),loadDetailsReq.getNoOfTrucks(),
                loadDetailsReq.getWeight(),loadDetailsReq.getComment(),loadDetailsReq.getShipperId(),loadDetailsReq.getDate());
        loadRepository.save(loadEntity);
        return "Load details added successfully";
    }

}
