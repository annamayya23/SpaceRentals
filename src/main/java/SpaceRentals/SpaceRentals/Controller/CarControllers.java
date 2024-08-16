package SpaceRentals.SpaceRentals.Controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpaceRentals.SpaceRentals.Entity.Car;
import SpaceRentals.SpaceRentals.Service.CarService;



@RestController
@RequestMapping("/car")
public class CarControllers {

	@Autowired
	private CarService carser;
	


	@PostMapping("upload")
   public void save(@RequestBody Car c) {
		
	   carser.save(c);
	  
   }
	@PutMapping("update")
	   public void update(@RequestBody Car c) {
			
		   carser.update(c);
		  
	   }
	@DeleteMapping("delete/{id}")
	   public void delete(@PathVariable Long id) {
			
		   carser.delete(id);
		  
	   }
	@GetMapping("getbyid/{id}")
	   public Optional<Car> getbyid(@PathVariable Long id) {
			
		 Optional<Car> oc =   carser.getbyid(id);
		 return oc;
		 
		  
	   }
	@PostMapping("getall")
	   public List<Car> getall() {
			
		List<Car> lc =  carser.getall();
		
		return lc;
		  
	   }
}
