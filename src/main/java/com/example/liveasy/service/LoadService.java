package com.example.liveasy.service;

import com.example.liveasy.dto.LoadDetailsDto;
import com.example.liveasy.dto.LoadListResponse;
import java.util.UUID;

public interface LoadService {

    String addLoad(LoadDetailsDto loadDetailsDto);
    LoadListResponse getAllLoadsByShipperId(UUID shipperId);



}
