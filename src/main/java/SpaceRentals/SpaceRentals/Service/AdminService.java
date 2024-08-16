package SpaceRentals.SpaceRentals.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpaceRentals.SpaceRentals.Entity.Admin;
import SpaceRentals.SpaceRentals.Repository.AdminRepository;

@Service
public class AdminService {

	
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	
	public void deleteAdmin(Long id) {
		adminRepository.deleteById(id);
		
	}
	
	public Optional<Admin> getById(Long id) {
		return  adminRepository.findById(id);
	}
	
	public List<Admin> getAllAdmins(){
		return adminRepository.findAll();
	}
}
