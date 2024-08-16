package SpaceRentals.SpaceRentals.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpaceRentals.SpaceRentals.Entity.Car;
import SpaceRentals.SpaceRentals.Repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carrepo;

	
	
     public void save(Car c)
     {
    	 
    	 carrepo.save(c);
    	
     }
     public void update(Car c)
     {
    	 
    	 carrepo.save(c);
    	
     }
     public void delete(Long c)
     {
    	 
    	 carrepo.deleteById(c);
    	
     }
     public Optional<Car>  getbyid(Long c)
     {
    	 
    	Optional<Car> cr = carrepo.findById(c);
    	
    	return cr;
    	
     }
     public List<Car> getall()
     {
    	 
    	 List<Car> lc = carrepo.findAll();
    	 
    	 return lc;
    	
     }



}
