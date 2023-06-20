package com.example.minitest_3.repository;

import com.example.minitest_3.model.PaintingCatalogDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class PaintingCatalogDetailRepository implements IPaintingCatalogDetailRepo{
@PersistenceContext
public static EntityManager entityManager;



    @Override
    public void flush() {

    }

    @Override
    public <S extends PaintingCatalogDetail> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends PaintingCatalogDetail> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<PaintingCatalogDetail> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PaintingCatalogDetail getOne(Long aLong) {
        return null;
    }

    @Override
    public PaintingCatalogDetail getById(Long aLong) {
        return null;
    }

    @Override
    public PaintingCatalogDetail getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends PaintingCatalogDetail> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PaintingCatalogDetail> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PaintingCatalogDetail> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PaintingCatalogDetail> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PaintingCatalogDetail> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PaintingCatalogDetail> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends PaintingCatalogDetail, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends PaintingCatalogDetail> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PaintingCatalogDetail> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PaintingCatalogDetail> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<PaintingCatalogDetail> findAll() {
        return null;
    }

    @Override
    public List<PaintingCatalogDetail> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(PaintingCatalogDetail entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends PaintingCatalogDetail> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<PaintingCatalogDetail> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PaintingCatalogDetail> findAll(Pageable pageable) {
        return null;
    }

    public PaintingCatalogDetail searchAllByCatalog(String catalog) {
        String sql="select catalogId, name form catalog  inner join painting  on catalog_catalog.id=painting_catalog.id where"+catalog;
        TypedQuery<PaintingCatalogDetail>typedQuery=(TypedQuery<PaintingCatalogDetail>)entityManager.createNativeQuery(sql,PaintingCatalogDetail.class);
        return typedQuery.getSingleResult();
    }
}
