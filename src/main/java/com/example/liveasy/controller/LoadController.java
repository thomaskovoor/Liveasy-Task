package com.example.liveasy.controller;

import com.example.liveasy.dto.LoadDetailsReq;
import com.example.liveasy.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoadController {

    @Autowired
    LoadService loadService;

    @PostMapping("/load")
    public String addLoadDetails(@RequestBody LoadDetailsReq loadDetailsReq) {
        return  loadService.addLoad(loadDetailsReq);
    }


}
