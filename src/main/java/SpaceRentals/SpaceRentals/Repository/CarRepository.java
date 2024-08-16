package SpaceRentals.SpaceRentals.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpaceRentals.SpaceRentals.Entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
	
}
