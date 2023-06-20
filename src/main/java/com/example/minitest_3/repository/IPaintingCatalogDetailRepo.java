package com.example.minitest_3.repository;

import com.example.minitest_3.model.PaintingCatalogDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaintingCatalogDetailRepo extends JpaRepository<PaintingCatalogDetail,Long> {
//    PaintingCatalogDetail searchCatalog(String catalog);
@PersistenceContext
public static EntityManager entityManager = null;

    public static PaintingCatalogDetail searchAllByCatalog(String catalog){
        String sql="select from paintingCatalogDetail where catalog="+catalog;
        TypedQuery<PaintingCatalogDetail> typedQuery=(TypedQuery<PaintingCatalogDetail>)entityManager.createNativeQuery(sql,PaintingCatalogDetail.class);
        return typedQuery.getSingleResult();
    }
}
