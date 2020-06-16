package com.example.systemdesign.parkinglot.controller;

import com.example.systemdesign.parkinglot.document.ParkingCategory;
import com.example.systemdesign.parkinglot.services.CommonRepositoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parkingcategory")
public class ParkingCategoryController {

    private final CommonRepositoryService<ParkingCategory, String> parkingCategoryService;

    public ParkingCategoryController(CommonRepositoryService<ParkingCategory, String> parkingCategoryService) {
        this.parkingCategoryService = parkingCategoryService;
    }

    @GetMapping("/all")
    public List<ParkingCategory> getParkingCategory() {
        return parkingCategoryService.findAll();
    }

    @PostMapping("/addparkingcategory")
    public ParkingCategory add(@RequestBody ParkingCategory category) {
        return parkingCategoryService.save(category);
    }

    @PutMapping("/updateparkingcategory")
    public ParkingCategory update(@RequestBody ParkingCategory category) {
        return parkingCategoryService.save(category);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteParkingCategoryById(@PathVariable String id) {
        //TODO remove category from all floors
        parkingCategoryService.deleteById(id);
    }

    @DeleteMapping("/delete")
    public void deleteParkingCategory(@RequestBody ParkingCategory category) {
        parkingCategoryService.delete(category);
    }
}
