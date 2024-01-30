package com.example.liveasy.repository;

import com.example.liveasy.entity.LoadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface LoadRepository extends JpaRepository<LoadEntity, Long>{
    List<LoadEntity> findAllByShipperId(UUID shipperId);

}
