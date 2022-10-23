package zaichenko.edu.spring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zaichenko.edu.spring.model.Chair;
import zaichenko.edu.spring.service.chair.impls.ChairServiceImpl;
import java.util.List;

@RequestMapping("/api/chair")
@RestController
public class ChairRestController {

   @Autowired
   ChairServiceImpl chairService;

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello, from Chair Controller</h1>";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Chair> getChairList() {
        return chairService.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Chair getChair(@PathVariable("id") String id) {
        return chairService.get(id);
    }
}
