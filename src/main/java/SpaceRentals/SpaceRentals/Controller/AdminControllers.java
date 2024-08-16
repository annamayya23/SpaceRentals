package SpaceRentals.SpaceRentals.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpaceRentals.SpaceRentals.Entity.Admin;
import SpaceRentals.SpaceRentals.Entity.Car;
import SpaceRentals.SpaceRentals.Entity.Car.CarStatus;
import SpaceRentals.SpaceRentals.Entity.User;
import SpaceRentals.SpaceRentals.Entity.User.UserStatus;
import SpaceRentals.SpaceRentals.Repository.CarRepository;
import SpaceRentals.SpaceRentals.Repository.UserRepository;
import SpaceRentals.SpaceRentals.Service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminControllers {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CarRepository carRepository;
	
	@PostMapping("/register")
	public ResponseEntity<String> saveAdmin(@RequestBody Admin admin){
		 adminService.saveAdmin(admin);
		 return ResponseEntity.ok("Admin register successfully");
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteAdmin(@PathVariable Long id){
		adminService.deleteAdmin(id);
		return ResponseEntity.ok(id+" Admin deleted successfully");
	}
	
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Admin> getById(@PathVariable Long id){
		Optional<Admin> admin = adminService.getById(id);
		return ResponseEntity.ok(admin.get());
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Admin>> getAll(){
		List<Admin> list = adminService.getAllAdmins();
		return ResponseEntity.ok(list);
	}
	
	@PostMapping("/approveuser/{id}")
	public ResponseEntity<String> approveUser(@PathVariable Long id){
		Optional<User> optionalUser = userRepository.findById(id);
		
		if(optionalUser.isPresent()) {
			User user = optionalUser.get();
			user.setStatus(UserStatus.APPROVED);
			userRepository.save(user);
			return ResponseEntity.ok("User Approved successfully");
		}
		return ResponseEntity.ok("User Not Found");
	}
	
	@PostMapping("/rejectuser/{id}")
	public ResponseEntity<String> rejectUser(@PathVariable Long id){
		Optional<User> optionalUser = userRepository.findById(id);
		
		if(optionalUser.isPresent()) {
			User user = optionalUser.get();
			user.setStatus(UserStatus.REJECTED);
			userRepository.save(user);
			return ResponseEntity.ok("User rejectedd Successfully");
		}
		return ResponseEntity.ok("User Not Found");
	}
	
	@PostMapping("/approvecar/{id}")
	public ResponseEntity<String> approveCar(@PathVariable Long id){
		Optional<Car> optionalCar = carRepository.findById(id);
		
		if(optionalCar.isPresent()) {
			Car car = optionalCar.get();
			car.setStatus(CarStatus.APPROVED);
			carRepository.save(car);
			return ResponseEntity.ok("Car Approved successfully");
		}
		return ResponseEntity.ok("Car Not Found");
	}
	
	@PostMapping("/rejectcar/{id}")
	public ResponseEntity<String> rejectCar(@PathVariable Long id){
		Optional<Car> optionalCar = carRepository.findById(id);
		
		if(optionalCar.isPresent()) {
			Car car = optionalCar.get();
			car.setStatus(CarStatus.REJECTED);
			carRepository.save(car);
			return ResponseEntity.ok("Car rejectedd Successfully");
		}
		return ResponseEntity.ok("Car Not Found");
	}
}
