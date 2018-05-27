package pe.upc.swe.trika.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import pe.upc.swe.trika.model.Video;
public interface VideoRepository extends PagingAndSortingRepository<Video,Integer>
{
}
