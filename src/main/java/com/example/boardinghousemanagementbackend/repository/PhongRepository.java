package com.example.boardinghousemanagementbackend.repository;

import com.example.boardinghousemanagementbackend.modal.entity.Phong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongRepository extends JpaRepository<Phong, Long> {
}
