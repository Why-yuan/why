package com.why.jcartadministrationback.controller;

import com.why.jcartadministrationback.dto.in.ReturnSearchInDTO;
import com.why.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import com.why.jcartadministrationback.dto.out.PageOutDTO;
import com.why.jcartadministrationback.dto.out.ReturnListOutDTO;
import com.why.jcartadministrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
