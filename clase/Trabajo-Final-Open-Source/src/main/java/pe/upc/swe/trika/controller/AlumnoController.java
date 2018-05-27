package pe.upc.swe.trika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pe.upc.swe.trika.Service.AlumnoService;
import pe.upc.swe.trika.model.Alumno;

import java.util.List;

@RestController
@RequestMapping(path = "/alumnosx")
public class AlumnoController
{

	@Autowired
	private AlumnoService alumnoService;

	@RequestMapping(method = {RequestMethod.GET},produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Alumno> listarAlumno()
	{
		return alumnoService.findAll();
	}

	@RequestMapping(value = "/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Alumno AlumnoId(@PathVariable("id") int id)
	{
		return alumnoService.findId(id);
	}
	
}
