package SpaceRentals.SpaceRentals.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpaceRentals.SpaceRentals.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
