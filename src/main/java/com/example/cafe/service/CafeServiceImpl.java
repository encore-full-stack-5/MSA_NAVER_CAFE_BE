package com.example.cafe.service;

import com.example.cafe.dto.request.CafeRequest;
import com.example.cafe.dto.response.CafeResponse;
import com.example.cafe.global.domain.entity.Cafe;
import com.example.cafe.global.domain.repository.CafeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CafeServiceImpl implements CafeService {
    private final CafeRepository cafeRepository;
    @Override
    public void createCafe(CafeRequest request) {
        Cafe cafeEntity = request.toEntity();
        cafeRepository.save(cafeEntity);
    }

    @Override
    public List<CafeResponse> getAllCafeByUserId(Long managerId) {
        return cafeRepository.findByManagerId(managerId)
                .stream()
                .map(CafeResponse::from)
                .toList();
    }
}
