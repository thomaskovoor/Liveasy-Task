package com.example.liveasy.service.impl;

import com.example.liveasy.dto.LoadDetailsDto;
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
    public String addLoad(LoadDetailsDto loadDetailsDto) {

        LoadEntity loadEntity = new LoadEntity(null, loadDetailsDto.getLoadingPoint(), loadDetailsDto.getUnloadingPoint(),
                loadDetailsDto.getProductType(), loadDetailsDto.getTruckType(), loadDetailsDto.getNoOfTrucks(),
                loadDetailsDto.getWeight(), loadDetailsDto.getComment(), loadDetailsDto.getShipperId(), loadDetailsDto.getDate());
        loadRepository.save(loadEntity);
        return "Load details added successfully";
    }

}
