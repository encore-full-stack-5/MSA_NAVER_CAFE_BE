package com.example.cafe.global.domain.repository;

import com.example.cafe.dto.response.CafeResponse;
import com.example.cafe.global.domain.entity.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CafeRepository extends JpaRepository<Cafe,Long> {
    List<Cafe> findByManagerId(Long managerId);
    List<Cafe> findAllByNameContainingOrderByCreatedAtDesc(String query);
}
