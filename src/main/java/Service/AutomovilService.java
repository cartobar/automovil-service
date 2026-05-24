package gt.edu.umg.automovil_service.service;

import gt.edu.umg.automovil_service.entity.Automovil;
import gt.edu.umg.automovil_service.repository.AutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutomovilService {

    @Autowired
    private AutomovilRepository repository;

    public List<Automovil> devolverAutos() {
        return repository.findAll();
    }
}