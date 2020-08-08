package zay.edu.hellospring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zay.edu.hellospring.model.Cafedra;
import zay.edu.hellospring.service.cafedra.impls.CafedraServiceImpl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RequestMapping("/api/cafedra")
@RestController
public class CafedraRestController {

   @Autowired
    CafedraServiceImpl cafedraService;

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello, from Cafedra Controller</h1>";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    List<Cafedra> getCafedraList(){
        return cafedraService.getAll();
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    Cafedra getCafedra(@PathVariable("id") String id){
        return cafedraService.get(id);
    }

}
