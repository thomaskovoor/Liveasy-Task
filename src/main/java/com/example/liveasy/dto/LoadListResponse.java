package com.example.liveasy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoadListResponse {
     private String  message;
     private  List<LoadDetailsDto> loadDetailsDtoList;
}
