package SpaceRentals.SpaceRentals.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpaceRentals.SpaceRentals.Entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
