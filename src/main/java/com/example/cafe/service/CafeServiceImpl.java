package com.example.cafe.service;

import com.example.cafe.dto.request.CreateCafeRequest;
import com.example.cafe.global.domain.entity.Cafe;
import com.example.cafe.global.domain.entity.Rank;
import com.example.cafe.global.domain.repository.CafeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CafeServiceImpl implements CafeService {
    private final CafeRepository cafeRepository;
    @Override
    public void createCafe(CreateCafeRequest request) {
        Cafe cafeEntity = request.toEntity();
        cafeRepository.save(cafeEntity);
    }
}
