package ngothanhcong.movie.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ngothanhcong.movie.entity.ServiceModel;
import ngothanhcong.movie.repository.InforMovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private InforMovieRepository inforMovieRepository;
	
	public List<ServiceModel> findByAllMovie(){
		return (List<ServiceModel>) inforMovieRepository.findAll();
	}
	
	public void DeleteById(String name) {
		inforMovieRepository.deleteById(name);
	}
	
	

	@Override
	public boolean addMovie(ServiceModel serviceModel) {
		
		return inforMovieRepository.save(serviceModel)!=null;
	}

	@Override
	public ServiceModel findById(String name) {
		Optional<ServiceModel> eMovie = inforMovieRepository.findById(name);
		if(eMovie!=null) {
			return eMovie.get(); 
		}
		
		return null;
	}
	
	
	
	
	
}
