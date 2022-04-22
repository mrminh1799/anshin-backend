package com.anshinbackend.controller.website;

import com.anshinbackend.dto.Customer.FavoriteDTO;
import com.anshinbackend.entity.Favorite;
import com.anshinbackend.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auth/favorite")
@CrossOrigin("*")
public class FavoriteController {
    @Autowired
    FavoriteService favoriteService;

    @GetMapping("{aid}")
    public List<FavoriteDTO> getOne(@PathVariable("aid")Integer id){
        return  favoriteService.findByAccountId(id);
    }

    @GetMapping("/count/{pid}")
    public Optional<Favorite> findByProductId(@PathVariable("pid")Integer id){
        return  favoriteService.findByProductId(id);
    }
}
