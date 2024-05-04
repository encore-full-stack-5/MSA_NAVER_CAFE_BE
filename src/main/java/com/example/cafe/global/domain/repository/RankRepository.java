package com.example.cafe.global.domain.repository;

import com.example.cafe.global.domain.entity.Rank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankRepository extends JpaRepository<Rank,Long> {
}
