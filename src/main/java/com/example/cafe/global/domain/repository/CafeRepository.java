package com.example.cafe.global.domain.repository;

import com.example.cafe.global.domain.entity.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CafeRepository extends JpaRepository<Cafe,Long> {
}
