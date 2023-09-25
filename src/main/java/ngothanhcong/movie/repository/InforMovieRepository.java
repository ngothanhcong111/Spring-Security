package ngothanhcong.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ngothanhcong.movie.entity.ServiceModel;

@Repository
public interface InforMovieRepository extends CrudRepository<ServiceModel, String> {
	
}
