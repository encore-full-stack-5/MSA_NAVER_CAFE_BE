package com.example.cafe.global.domain.repository;

import com.example.cafe.global.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
