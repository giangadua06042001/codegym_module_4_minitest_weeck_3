package com.example.minitest_3.service.catalogSevice;

import com.example.minitest_3.model.Catalog;
import com.example.minitest_3.repository.ICatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CatalogService implements ICatalogService {
    @Autowired
    private ICatalogRepository catalogRepository;
    @Override
    public Iterable<com.example.minitest_3.model.Catalog> findAll() {
        return  catalogRepository.findAll();
    }

    @Override
    public Catalog save(Catalog catalog) {
      return   catalogRepository.save(catalog);
    }

    @Override
    public Optional<com.example.minitest_3.model.Catalog> findById( Long id) {
      return   catalogRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
      catalogRepository.deleteById(id);
    }


}
