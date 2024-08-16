package SpaceRentals.SpaceRentals.Service;

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
}
