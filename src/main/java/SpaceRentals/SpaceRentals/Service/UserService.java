package SpaceRentals.SpaceRentals.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpaceRentals.SpaceRentals.Entity.User;
import SpaceRentals.SpaceRentals.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	public Optional<User> getById(Long id){
		return userRepository.findById(id);
	}
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
}
