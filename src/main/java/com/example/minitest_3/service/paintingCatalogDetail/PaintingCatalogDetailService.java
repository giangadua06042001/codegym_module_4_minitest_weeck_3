package com.example.minitest_3.service.paintingCatalogDetail;

import com.example.minitest_3.model.PaintingCatalogDetail;
import com.example.minitest_3.repository.IPaintingCatalogDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PaintingCatalogDetailService implements IPaintingCatalogDetailService{
    @Autowired
    private IPaintingCatalogDetailRepo ipaintingCatalogDetailRepo;
    @Override
    public Iterable<PaintingCatalogDetail> findAll() {
        return ipaintingCatalogDetailRepo.findAll();
    }

    @Override
    public PaintingCatalogDetail save(PaintingCatalogDetail paintingCatalogDetail) {
        return ipaintingCatalogDetailRepo.save(paintingCatalogDetail);
    }

    @Override
    public Optional<PaintingCatalogDetail> findById(Long id) {
        return ipaintingCatalogDetailRepo.findById(id);
    }

    @Override
    public void remove(Long id) {
       ipaintingCatalogDetailRepo.deleteById(id);
    }

    @Override
    public Iterable<PaintingCatalogDetail> findAllByCatalog(String catalog) {
       return (Iterable<PaintingCatalogDetail>) IPaintingCatalogDetailRepo.searchAllByCatalog(catalog);
    }
}
