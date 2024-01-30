package com.example.liveasy.service.impl;

import com.example.liveasy.dto.LoadDetailsDto;
import com.example.liveasy.dto.LoadListResponse;
import com.example.liveasy.entity.LoadEntity;
import com.example.liveasy.repository.LoadRepository;
import com.example.liveasy.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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

    @Override
    public LoadListResponse getAllLoadsByShipperId(UUID shipperId) {
        List<LoadEntity> lst = loadRepository.findAllByShipperId(shipperId);

        if(lst.isEmpty()){
            return LoadListResponse.builder()
                    .message("No loads found for the given shipperId")
                    .loadDetailsDtoList(null)
                    .build();
        }

        List<LoadDetailsDto> loadDetailsDtoList = lst.stream()
                .map(entity -> LoadDetailsDto.builder()
                        .loadId(entity.getLoadId())
                        .loadingPoint(entity.getLoadingPoint())
                        .unloadingPoint(entity.getUnloadingPoint())
                        .productType(entity.getProductType())
                        .truckType(entity.getTruckType())
                        .noOfTrucks(entity.getNoOfTrucks())
                        .weight(entity.getWeight())
                        .comment(entity.getComment())
                        .shipperId(entity.getShipperId())
                        .date(entity.getDate())
                        .build())
                .collect(Collectors.toList());

        return LoadListResponse.builder()
                .message("All loads fetched successfully")
                .loadDetailsDtoList(loadDetailsDtoList)
                .build();

    }

    @Override
    public LoadListResponse getLoadsByLoadId(Long loadId) {
        LoadEntity load = loadRepository.findById(loadId).orElse(null);
        if (load == null) {
            return LoadListResponse.builder()
                    .message("No load found for the given loadId")
                    .loadDetailsDtoList(null)
                    .build();
        }

        return LoadListResponse.builder()
                .message("Load fetched successfully")
                .loadDetailsDtoList(List.of(LoadDetailsDto.builder()
                        .loadId(load.getLoadId())
                        .loadingPoint(load.getLoadingPoint())
                        .unloadingPoint(load.getUnloadingPoint())
                        .productType(load.getProductType())
                        .truckType(load.getTruckType())
                        .noOfTrucks(load.getNoOfTrucks())
                        .weight(load.getWeight())
                        .comment(load.getComment())
                        .shipperId(load.getShipperId())
                        .date(load.getDate())
                        .build()))
                .build();
    }

    @Override
    public String deleteLoadByLoadId(Long loadId) {
        if (loadRepository.findById(loadId).orElse(null) == null) {
            return "No load found for the given loadId";
        }
        else {
            loadRepository.deleteById(loadId);
            return "Load deleted successfully";
        }
    }

}
