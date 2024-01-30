package com.example.liveasy.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;
import java.util.UUID;

@Getter
@Builder
public class LoadDetailsDto {

    private Long loadId;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private String noOfTrucks;
    private String weight;
    private String comment;
    private UUID shipperId;
    private Date date;

}
