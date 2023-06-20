package com.example.minitest_3.service.paintingService;

import com.example.minitest_3.model.Painting;
import com.example.minitest_3.repository.IPaintingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaintingService implements IPaintingService {
    @Autowired
    private IPaintingRepository paintingRepository;

    @Override
    public Iterable<Painting> findAll() {
        return paintingRepository.findAll();
    }

    @Override
    public Painting save(Painting painting) {
        return paintingRepository.save(painting);
    }

    @Override
    public Optional<Painting> findById(Long id) {
        return paintingRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
       paintingRepository.deleteById(id);
    }

    @Override
    public Iterable<Painting> findAllByNameContaining(String name) {
      return   paintingRepository.findAllByNameContaining(name);
    }
}
