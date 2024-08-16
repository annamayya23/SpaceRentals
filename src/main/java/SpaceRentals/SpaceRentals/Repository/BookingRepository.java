package SpaceRentals.SpaceRentals.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpaceRentals.SpaceRentals.Entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
