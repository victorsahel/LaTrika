package pe.upc.swe.trika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.upc.swe.trika.Service.CarreraService;
import pe.upc.swe.trika.model.Carrera;

import java.util.List;

@RestController
@RequestMapping(path = "/carrera")
public class CarreraController
{
    @Autowired
    private CarreraService carreraService;

    @RequestMapping(method = {RequestMethod.GET},produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Carrera> listarCarrera()
    {
        return carreraService.findAll();
    }

    @RequestMapping(value ="/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Carrera CarreraId(@PathVariable("id") int id)
    {
        return carreraService.findId(id);
    }
}
