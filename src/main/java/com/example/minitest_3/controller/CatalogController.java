package com.example.minitest_3.controller;

import com.example.minitest_3.model.Catalog;
import com.example.minitest_3.service.catalogSevice.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin("*")
@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private ICatalogService catalogService;
     @PostMapping
    private ResponseEntity<Catalog>saveCatalog(@RequestBody Catalog catalog){
         return new ResponseEntity<>(catalogService.save(catalog),HttpStatus.OK);
     }
     @GetMapping
    private ResponseEntity<Iterable<Catalog>>findAllCatalog(){
      return new ResponseEntity<>(catalogService.findAll(),HttpStatus.OK);
     }
     @DeleteMapping("{id}")
    private ResponseEntity<Catalog>deleteCatalogById(@PathVariable  Long id){
         Optional<Catalog> catalog = catalogService.findById(id);
         if (!catalog.isPresent()) {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }
         catalogService.remove(id);
         return new ResponseEntity<>(catalog.get(),HttpStatus.OK);
     }
     @PutMapping("{id}")
    private  ResponseEntity<Catalog>putCatalog(@PathVariable  Long id,Catalog catalog1){
         Optional<Catalog> catalog=catalogService.findById(id);
         if(!catalog.isPresent()){
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }
         catalogService.save(catalog.orElse(null));
       return new ResponseEntity<>(HttpStatus.OK);

     }

}
