package com.example.minitest_3.service.paintingCatalogDetail;

import com.example.minitest_3.model.PaintingCatalogDetail;
import com.example.minitest_3.service.IGeneralService;

public interface IPaintingCatalogDetailService extends IGeneralService<PaintingCatalogDetail> {
    Iterable<PaintingCatalogDetail>findAllByCatalog(String catalog);
}
