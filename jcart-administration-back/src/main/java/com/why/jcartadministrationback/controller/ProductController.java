package com.why.jcartadministrationback.controller;

import com.why.jcartadministrationback.dto.in.ProductCreateInDTO;
import com.why.jcartadministrationback.dto.in.ProductSearchInDTO;
import com.why.jcartadministrationback.dto.in.ProductUpdateInDTO;
import com.why.jcartadministrationback.dto.out.PageOutDTO;
import com.why.jcartadministrationback.dto.out.ProductListOutDTO;
import com.why.jcartadministrationback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){

    }

}
