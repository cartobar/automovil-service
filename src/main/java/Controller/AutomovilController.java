package gt.edu.umg.automovil_service.controller;

import gt.edu.umg.automovil_service.entity.Automovil;
import gt.edu.umg.automovil_service.service.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/automoviles")
@CrossOrigin(origins = "*")
public class AutomovilController {

    @Autowired
    private AutomovilService service;

    @GetMapping
    public List<Automovil> devolverAutos() {
        return service.devolverAutos();
    }
}