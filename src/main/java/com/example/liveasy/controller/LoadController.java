package com.example.liveasy.controller;

import com.example.liveasy.dto.LoadDetailsDto;
import com.example.liveasy.dto.LoadListResponse;
import com.example.liveasy.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class LoadController {

    @Autowired
    LoadService loadService;

    @PostMapping("/load")
    public String addLoadDetails(@RequestBody LoadDetailsDto loadDetailsDto) {
        return  loadService.addLoad(loadDetailsDto);
    }

    @GetMapping("/load")
    public LoadListResponse getAllLoadsByShipperId(@RequestParam("shipperId") UUID shipperId) {
        return loadService.getAllLoadsByShipperId(shipperId);
    }

    @GetMapping("/load/{loadId}")
    public LoadListResponse getLoadsByLoadId(@PathVariable("loadId") Long loadId) {
        return loadService.getLoadsByLoadId(loadId);
    }

    @DeleteMapping("/load/{loadId}")
    public String deleteLoadByLoadId(@PathVariable("loadId") Long loadId) {
        return loadService.deleteLoadByLoadId(loadId);
    }

    @PutMapping("/load/{loadId}")
    public String updateLoadByLoadId(@PathVariable("loadId") Long loadId,
                                     @RequestBody LoadDetailsDto loadDetailsDto) {
        return loadService.updateLoadByLoadId(loadId, loadDetailsDto);

    }




}
