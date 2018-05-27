package pe.upc.swe.trika.Service;

import org.springframework.stereotype.Service;

import pe.upc.swe.trika.model.Carrera;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarreraService
{
    List<Carrera> calidadList;

    public List<Carrera> findAll()
    {
        if(calidadList==null)
        {
            calidadList = new ArrayList<>();
            //calidadList.add(new Carrera(1,"Ingenieria de Software"));
            //calidadList.add(new Carrera(2,"Ingenieria de Telecomunicaciones y Redes"));
        }
        return calidadList;
    }

    public Carrera findId(int id)
    {
        Carrera objCar = null;
        try
        {
            for (Carrera x:findAll()) if(x.getIdCarrera() == id) objCar = x;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return objCar;
    }

}
