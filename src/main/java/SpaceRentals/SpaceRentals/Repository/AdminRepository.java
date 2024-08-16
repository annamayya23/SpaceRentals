package SpaceRentals.SpaceRentals.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpaceRentals.SpaceRentals.Entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
