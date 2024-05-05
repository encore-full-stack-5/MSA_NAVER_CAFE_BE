package com.example.cafe.service;

import com.example.cafe.dto.request.CafeRequest;
import com.example.cafe.dto.response.CafeResponse;

import java.util.List;

public interface CafeService {
    void createCafe(CafeRequest request);

    List<CafeResponse> getAllCafeByManagerId(Long uid);
    List<CafeResponse> getAllCafeByCafeName(String query);
    CafeResponse getCafeByCafeId(Long cafeId);
}
