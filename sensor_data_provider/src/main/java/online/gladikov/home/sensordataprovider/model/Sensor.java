package online.gladikov.home.sensordataprovider.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Sensor extends BaseEntity{

	private static final long serialVersionUID = -4287475643755349509L;
	
	public Sensor(String name) {
		super();
		setName(name);
	}
	private String address;
	private String description;
	@Enumerated(EnumType.ORDINAL)
	private House house;
	@Enumerated(EnumType.ORDINAL)
	private Compartment compartment;
	@OneToMany(mappedBy = "sensor")
	private Set<SensorRecord> records;
}
