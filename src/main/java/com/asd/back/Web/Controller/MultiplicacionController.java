package com.asd.back.Web.Controller;


import com.asd.back.Domain.Multiplication;
import com.asd.back.Domain.Service.MultiplicationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Multiplicacion")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class MultiplicacionController {

    @Autowired
    private MultiplicationService multiplicationService;


    @GetMapping("/todos")
    @ApiOperation("Get all Register")
    @ApiResponse(code = 200 , message = "Data of DB")
    public List<Multiplication> getAllMultiplication() {return multiplicationService.getAllMultiplication(); }


    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public Optional<Multiplication> getMultiplication(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return multiplicationService.getMultiplication(id);
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public Multiplication saveMultiplication(@RequestBody Multiplication multiplication){
        return multiplicationService.saveMultiplication(multiplication);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteMultiplication(@PathVariable("id") int multiplicationId) {
        return multiplicationService.deleteMultiplication(multiplicationId);
    }

    @RequestMapping("/espana")
    public String cadena(){
        return "desde el back";
    }

    @RequestMapping("/carnaval")
    public String cadena2(){
        return "desde el back jjjjjjj";
    }

}
