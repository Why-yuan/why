package com.why.jcartstoreback.controller;

import com.why.jcartstoreback.dto.in.ProductSearchInDTO;
import com.why.jcartstoreback.dto.out.PageOutDTO;
import com.why.jcartstoreback.dto.out.ProductListOutDTO;
import com.why.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

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

}
