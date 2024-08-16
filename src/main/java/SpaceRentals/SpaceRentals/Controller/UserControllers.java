package SpaceRentals.SpaceRentals.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpaceRentals.SpaceRentals.Entity.User;
import SpaceRentals.SpaceRentals.Entity.User.UserStatus;
import SpaceRentals.SpaceRentals.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserControllers {

	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		user.setStatus(UserStatus.PENDING);
		userService.saveUser(user);
		return ResponseEntity.ok("User Register successfully! Awaiting admin approval");
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id){
		userService.deleteUser(id);
		return ResponseEntity.ok(id+" This user deleted successfuly");
	}
	
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<User> getById(@PathVariable Long id){
		Optional<User> user = userService.getById(id);
		return ResponseEntity.ok(user.get());
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> list= userService.getAllUsers();
		return ResponseEntity.ok(list);
	}
}
