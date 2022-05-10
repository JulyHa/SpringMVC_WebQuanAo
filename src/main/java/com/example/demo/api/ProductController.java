package com.example.demo.api;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ImageRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins = "", allowedHeaders = "")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ImageRepository imageRepository;

    @GetMapping
    public ResponseEntity<?> getAllProducts(){
        List<ProductEntity> products = productService.getListProduct();
        return ResponseEntity.ok().body(products);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateProduct(@PathVariable int id, @RequestBody ProductEntity newProduct){
        ProductEntity productEntity = productService.updateProduct(id, newProduct);
        if(productEntity == null){
            return ResponseEntity.ok("Sản phẩm không tồn tại");
        }
        return ResponseEntity.ok("Update thành công");
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductEntity newProduct){
//        return ResponseEntity.ok(newProduct);
        if(!productService.createProduct(newProduct)){
            return ResponseEntity.ok("Không tạo được sản phẩm");
        }
        return ResponseEntity.ok("Thêm sản phẩm thành công");
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable int id){
        if(!productService.deleteProduct(id)){
            return ResponseEntity.ok("Xóa không thành công");
        }
        return ResponseEntity.ok("Xóa thành công");
    }




}
