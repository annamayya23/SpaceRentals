package SpaceRentals.SpaceRentals.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpaceRentals.SpaceRentals.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
	
}
