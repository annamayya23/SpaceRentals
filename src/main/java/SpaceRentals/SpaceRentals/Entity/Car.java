package SpaceRentals.SpaceRentals.Entity;

import SpaceRentals.SpaceRentals.Entity.User.UserStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Name;
	private String Features;
	private String seatingCapacity;
	private String  fuelType;

	
	@Enumerated(EnumType.STRING)
	private CarStatus status;
	
	public void setStatus(CarStatus status) {
		this.status = status;
	}

	public enum CarStatus{
		PENDING,
		APPROVED,
		REJECTED
	}
}
