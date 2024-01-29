package com.example.liveasy.dto;

import java.util.Date;
import java.util.UUID;

public class LoadDetailsReq {

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

    public LoadDetailsReq(String loadingPoint, String unloadingPoint, String productType, String truckType, String noOfTrucks, String weight, String comment, UUID shipperId, Date date) {
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.shipperId = shipperId;
        this.date = date;
    }
}
