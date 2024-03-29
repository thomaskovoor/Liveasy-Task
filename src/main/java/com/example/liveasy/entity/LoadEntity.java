package com.example.liveasy.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Table(name = "load")
@Entity
public class LoadEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "load_id")
    private Long loadId;
    @Column(name = "loading_point")
    private String loadingPoint;
    @Column(name = "unloading_point")
    private String unloadingPoint;
    @Column(name = "product_type")
    private String productType;
    @Column(name = "truck_type")
    private String truckType;
    @Column(name = "no_of_trucks")
    private String noOfTrucks;
    @Column(name = "weight")
    private String weight;
    @Column(name = "comment")
    private String comment;
    @Column(name = "shipper_id")
    private UUID shipperId;

    public LoadEntity(Long loadId, String loadingPoint, String unloadingPoint,
                      String productType, String truckType, String noOfTrucks,
                      String weight, String comment, UUID shipperId, Date date) {
        this.loadId = loadId;
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

    @Column(name = "date")
    private Date date;

    public LoadEntity() {
    }

}
