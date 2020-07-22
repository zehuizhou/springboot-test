package com.example.demo.service;

import com.example.demo.entity.Boy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoyRepository extends JpaRepository<Boy, Integer> {
}
