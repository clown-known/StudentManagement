package com.java8.tms.common.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java8.tms.common.entity.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, UUID> {
}
