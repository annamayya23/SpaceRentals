package SpaceRentals.SpaceRentals.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpaceRentals.SpaceRentals.Entity.Booking;
import SpaceRentals.SpaceRentals.Entity.Car;
import SpaceRentals.SpaceRentals.Repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookrepo;
	

    public void save(Booking b)
    {
   	 
    	bookrepo.save(b);
   	
    }
    public void update(Booking b)
    {
   	 
    	bookrepo.save(b);
   	
    }
    public void delete(Long id)
    {
   	 
    	bookrepo.deleteById(id);
   	
    }
    public Optional<Booking>  getbyid(Long c)
    {
   	 
   	Optional<Booking> cb = bookrepo.findById(c);
   	
   	return cb;
   	
    }
    public List<Booking> getall()
    {
   	 
   	 List<Booking> lb = bookrepo.findAll();
   	 
   	 return lb;
   	
    }

}
