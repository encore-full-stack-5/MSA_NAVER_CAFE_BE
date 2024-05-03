package com.example.cafe.controller;

import com.example.cafe.dto.request.CreateCafeRequest;
import com.example.cafe.service.CafeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cafe")
@RequiredArgsConstructor
public class CafeController {
    private final CafeService cafeService;
    @PostMapping
    public void createCafe(@RequestBody CreateCafeRequest request){
        cafeService.createCafe(request);
    }

}
