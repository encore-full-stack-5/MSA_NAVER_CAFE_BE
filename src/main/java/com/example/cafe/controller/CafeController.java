package com.example.cafe.controller;

import com.example.cafe.dto.request.CafeRequest;
import com.example.cafe.dto.response.CafeResponse;
import com.example.cafe.service.CafeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cafes")
@RequiredArgsConstructor
public class CafeController {
    private final CafeService cafeService;
    @PostMapping
    public void createCafe(@RequestBody CafeRequest request){
        cafeService.createCafe(request);
    }

    @GetMapping("/{cafeId}")
    public CafeResponse getCafeByCafeId(@PathVariable("cafeId") Long cafeId){
        return cafeService.getCafeByCafeId(cafeId);
    }

    @GetMapping("/managers/{uid}")
    public List<CafeResponse> getCafeByUserId(@PathVariable("uid") Long uid){
        return cafeService.getAllCafeByManagerId(uid);
    }

}
