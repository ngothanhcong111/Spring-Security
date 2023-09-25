package ngothanhcong.movie.services;

import java.util.Optional;

import ngothanhcong.movie.entity.ServiceModel;

public interface MovieService {
	public boolean addMovie(ServiceModel serviceModel);
	public ServiceModel findById(String name);
}
