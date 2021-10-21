package com.iportfolio.speacle.data.repository;

import com.iportfolio.speacle.data.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TestRepository extends JpaRepository<TestEntity, Long> {

    TestEntity findByName(String name);
    Optional<TestEntity> findById(Long id);

}
