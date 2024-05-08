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
//    카페 생성
    @PostMapping
    public void createCafe(@RequestBody CafeRequest request){
        cafeService.createCafe(request);
    }
//    Cafe Id로 카페 검색
    @GetMapping("/{cafeId}")
    public CafeResponse getCafeByCafeId(@PathVariable("cafeId") Long cafeId){
        return cafeService.getCafeByCafeId(cafeId);
    }
//    Manager Id로 카페 검색
    @GetMapping
    public List<CafeResponse> getCafesByUserId(@RequestParam(value = "uid", required = true) Long uid){
        return cafeService.getAllCafeByManagerId(uid);
    }
//    카페 이름으로 카페 검색 -> 최신순으로 반환
    @GetMapping("/search")
    public List<CafeResponse> searchCafesByName(@RequestParam(value = "query", required = true) String query){
        return cafeService.getAllCafeByCafeName(query);
    }

}
