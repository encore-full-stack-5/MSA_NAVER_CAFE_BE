package com.example.cafe.service;

import com.example.cafe.dto.request.CafeRequest;
import com.example.cafe.dto.response.CafeResponse;
import com.example.cafe.excrption.CafeErrorCode;
import com.example.cafe.excrption.CafeException;
import com.example.cafe.global.domain.entity.Cafe;
import com.example.cafe.global.domain.repository.CafeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CafeServiceImpl implements CafeService {
    private final CafeRepository cafeRepository;

//    카페 생성
    @Transactional
    @Override
    public void createCafe(CafeRequest request) {
        Cafe cafeEntity = request.toEntity();
        cafeRepository.save(cafeEntity);
    }

//    managerId로 모든 카페리스트 가져오기 ( 내가 Manager인 카페 보기)
    @Transactional
    @Override
    public List<CafeResponse> getAllCafeByManagerId(Long managerId) {
        return cafeRepository.findByManagerId(managerId)
                .stream()
                .map(CafeResponse::from)
                .toList();
    }

//    cafeId로 cafe 하나 가져오기
    @Transactional
    @Override
    public CafeResponse getCafeByCafeId(Long cafeId) {
        Optional<Cafe> byCafeId = cafeRepository.findById(cafeId);
        Cafe cafe = byCafeId.orElseThrow(()-> new CafeException(CafeErrorCode.CAFE_NOT_FOUND));
        return CafeResponse.from(cafe);
    }


}
