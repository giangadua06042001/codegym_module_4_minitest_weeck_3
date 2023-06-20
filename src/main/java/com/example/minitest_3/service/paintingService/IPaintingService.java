package com.example.minitest_3.service.paintingService;

import com.example.minitest_3.model.Painting;
import com.example.minitest_3.service.IGeneralService;

public interface IPaintingService extends IGeneralService<Painting> {
    Iterable<Painting> findAllByNameContaining(String name);
}
