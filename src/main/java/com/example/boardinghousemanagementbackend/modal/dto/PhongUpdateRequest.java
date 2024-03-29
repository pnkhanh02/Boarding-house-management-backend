package com.example.boardinghousemanagementbackend.modal.dto;

import com.example.boardinghousemanagementbackend.modal.entity.RoomStatus;
import lombok.Data;

@Data
public class PhongUpdateRequest {
    private Long id;
    private String title;
    private String address;
    private Double area;
    private Double price;
    private RoomStatus status;
    private String imageUrl;
}
