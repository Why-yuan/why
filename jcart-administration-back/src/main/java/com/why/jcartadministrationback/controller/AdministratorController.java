package com.why.jcartadministrationback.controller;

import com.why.jcartadministrationback.dto.in.AdministratorLoginDTO;
import com.why.jcartadministrationback.dto.in.AdministratorUpdateProfileDTO;
import com.why.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("administrator")
public class AdministratorController {

    //登录
    @GetMapping("/login")
    public String login(AdministratorLoginDTO administratorLoginDTO){
        return null;
    }

    //获取
    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer adminstratorId){
        return null;
    }


    //更新
    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileDTO administratorUpdateProfileDTO){

    }
}
