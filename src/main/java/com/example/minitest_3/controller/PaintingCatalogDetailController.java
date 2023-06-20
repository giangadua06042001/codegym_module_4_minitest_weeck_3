package com.example.minitest_3.controller;

import com.example.minitest_3.model.Painting;
import com.example.minitest_3.model.PaintingCatalogDetail;
import com.example.minitest_3.service.paintingCatalogDetail.IPaintingCatalogDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/demo")
public class PaintingCatalogDetailController {
    @Autowired
    private IPaintingCatalogDetailService paintingCatalogDetailService;
    @PostMapping
    private ResponseEntity<PaintingCatalogDetail>savePaintingCatalogDetail(@RequestBody PaintingCatalogDetail paintingCatalogDetail ){
        return new ResponseEntity<>(paintingCatalogDetailService.save(paintingCatalogDetail), HttpStatus.OK);
    }
    @GetMapping
    private ResponseEntity<Iterable<PaintingCatalogDetail>>findAllPaintingCatalogDetail(){
        return new ResponseEntity<>(paintingCatalogDetailService.findAll(),HttpStatus.OK);
    }
    @GetMapping("/find")
    private ResponseEntity<Iterable<PaintingCatalogDetail>>searchByCatalog(@RequestParam("s") String  catalog){
        return new ResponseEntity<>(paintingCatalogDetailService.findAllByCatalog(catalog),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    private ResponseEntity<PaintingCatalogDetail>remove(@PathVariable Long id){
        Optional<PaintingCatalogDetail> painting=paintingCatalogDetailService.findById(id);
        if(!painting.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        paintingCatalogDetailService.remove(id);
        return new ResponseEntity<>(painting.get(),HttpStatus.OK);
    }
}
