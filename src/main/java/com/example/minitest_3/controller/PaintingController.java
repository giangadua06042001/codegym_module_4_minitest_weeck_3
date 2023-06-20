package com.example.minitest_3.controller;

import com.example.minitest_3.model.Painting;
import com.example.minitest_3.service.paintingService.IPaintingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@CrossOrigin("*")
@RestController
@RequestMapping("/painting")
public class PaintingController {
    @Autowired
    private IPaintingService ipainting;
    @PostMapping
    public ResponseEntity<Painting>savePainting(@RequestBody Painting painting){
        return new ResponseEntity<>(ipainting.save(painting), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<Iterable<Painting>>findAll(){
        return new ResponseEntity<>(ipainting.findAll(),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Painting>deletePainting(@PathVariable Long id){
        Optional<Painting>painting=ipainting.findById(id);
        if(!painting.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        ipainting.remove(id);
        return new ResponseEntity<>(painting.get(),HttpStatus.OK);
    }
    @GetMapping("/search")
    private ResponseEntity<Iterable<Painting>>searchName(@RequestParam ("s")String name){
       return new ResponseEntity<>( ipainting.findAllByNameContaining(name),HttpStatus.OK);

    }
}
