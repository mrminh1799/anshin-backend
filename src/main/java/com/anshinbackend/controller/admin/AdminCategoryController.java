package com.anshinbackend.controller.admin;

import com.anshinbackend.dto.Admin.CategoriDTO;
import com.anshinbackend.entity.Category;
import com.anshinbackend.entity.Product;
import com.anshinbackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/admin/Categories")
@CrossOrigin("*")
public class AdminCategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/findAll")
    public List<Category> getAll(){
        return  categoryService.findAll();
    }


    @PostMapping("/create")
    public Category create(@RequestBody Category category) {
        return categoryService.create(category);
    }

    @PutMapping("{id}")
    public Category update(@PathVariable("id") Integer id, @RequestBody Category category) {
        return categoryService.update(category);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Category> delete(@PathVariable("id")Integer id) {
        categoryService.delete(id);
        return  ResponseEntity.ok(null);
    }

    //Code việt anh
    @GetMapping("/findByCategoryParentId/{id}")
    public  ResponseEntity<List<Category>> findByCategoryParentId(@PathVariable("id")Integer id){
        return  ResponseEntity.ok().body(categoryService.findByCategoryParentId(id));
    }
    @GetMapping("/findAllBacon/{id}")
    public  ResponseEntity<List<CategoriDTO>> findForNavbar1(
//            @PathVariable("fid")Integer fid,
            @PathVariable("id")Integer id){
        return  ResponseEntity.ok().body(categoryService.findForNavbar1(id));
    }


}
