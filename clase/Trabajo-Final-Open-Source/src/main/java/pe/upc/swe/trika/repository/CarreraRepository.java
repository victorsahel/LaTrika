package pe.upc.swe.trika.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import pe.upc.swe.trika.model.Carrera;

public interface CarreraRepository extends PagingAndSortingRepository<Carrera,Integer>
{

}
