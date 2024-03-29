package com.web.api;

import com.web.repository.ProductImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductImageApi {

    @Autowired
    private ProductImageRepository productImageRepository;

    @DeleteMapping("/user/delete-product-image")
    public ResponseEntity<?> delete(@RequestParam("id") Long id){
        productImageRepository.deleteById(id);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}

