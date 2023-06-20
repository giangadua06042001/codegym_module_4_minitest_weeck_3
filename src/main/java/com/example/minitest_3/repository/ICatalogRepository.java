package com.example.minitest_3.repository;

import com.example.minitest_3.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICatalogRepository extends JpaRepository<Catalog, Long> {
}
