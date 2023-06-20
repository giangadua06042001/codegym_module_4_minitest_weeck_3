package com.example.minitest_3.repository;

import com.example.minitest_3.model.Painting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaintingRepository extends JpaRepository<Painting,Long> {
   Iterable<Painting>findAllByNameContaining(String name);
}

