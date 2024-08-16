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

import SpaceRentals.SpaceRentals.Entity.Booking;
import SpaceRentals.SpaceRentals.Entity.Car;
import SpaceRentals.SpaceRentals.Service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingControllers {
	
	@Autowired
	private BookingService bookserv;

	@PostMapping("upload")
	   public void save(@RequestBody Booking c) {
			
		bookserv.save(c);
		  
	   }
		@PutMapping("update")
		   public void update(@RequestBody Booking c) {
				
			bookserv.update(c);
			  
		   }
		@DeleteMapping("delete/{id}")
		   public void delete(@PathVariable Long id) {
				
			bookserv.delete(id);
			  
		   }
		@GetMapping("getbyid/{id}")
		   public Optional<Booking> getbyid(@PathVariable Long id) {
				
			 Optional<Booking> oc =   bookserv.getbyid(id);
			 return oc;
			 
			  
		   }
		@PostMapping("getall")
		   public List<Booking> getall() {
				
			List<Booking> lc =  bookserv.getall();
			
			return lc;
			  
		   }
}
