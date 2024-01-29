package com.example.liveasy.dto;

import java.util.Date;
import java.util.UUID;

public class LoadDetailsDto {

    private Long loadId;

    public Long getLoadId() {
        return loadId;
    }

    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private String noOfTrucks;
    private String weight;
    private String comment;
    private UUID shipperId;
    private Date date;

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public String getNoOfTrucks() {
        return noOfTrucks;
    }

    public String getWeight() {
        return weight;
    }

    public String getComment() {
        return comment;
    }

    public UUID getShipperId() {
        return shipperId;
    }

    public Date getDate() {
        return date;
    }

}
