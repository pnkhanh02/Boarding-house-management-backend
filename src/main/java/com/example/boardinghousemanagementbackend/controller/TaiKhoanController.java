package com.example.boardinghousemanagementbackend.controller;

import com.example.boardinghousemanagementbackend.modal.dto.HopDongCreateRequest;
import com.example.boardinghousemanagementbackend.modal.dto.HopDongUpdateRequest;
import com.example.boardinghousemanagementbackend.modal.dto.TaiKhoanCreateRequest;
import com.example.boardinghousemanagementbackend.modal.dto.TaiKhoanUpdateRequest;
import com.example.boardinghousemanagementbackend.modal.entity.HopDong;
import com.example.boardinghousemanagementbackend.modal.entity.TaiKhoan;
import com.example.boardinghousemanagementbackend.service.IHopDongService;
import com.example.boardinghousemanagementbackend.service.ITaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/taikhoan")
public class TaiKhoanController {
    @Autowired
    private ITaiKhoanService taiKhoanService;

    @GetMapping("/getAll")
    public List<TaiKhoan> getAll(){
        return taiKhoanService.getAll();
    }

    @GetMapping("/{id}")
    public TaiKhoan getById(@PathVariable long id){
        return taiKhoanService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        taiKhoanService.delete(id);
    }

    @PostMapping("/create")
    public TaiKhoan create(@RequestBody TaiKhoanCreateRequest request){
        return taiKhoanService.create(request);
    }

    @PutMapping("/update")
    public TaiKhoan update(@RequestBody TaiKhoanUpdateRequest request){
        return taiKhoanService.update(request);
    }
}