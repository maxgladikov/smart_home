package online.gladikov.home.sensordataprovider.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import online.gladikov.home.sensordataprovider.model.jackson.RecordDeserializer;

@Setter
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonDeserialize(using = RecordDeserializer.class)
public class SensorRecord{

	private static final long serialVersionUID = -7320582847465208332L;
	
	@JsonCreator
	public SensorRecord(@JsonProperty("sensor")String sensorName, @JsonProperty("temperature")Double temperature,
															@JsonProperty("pressure")Double pressure,
															@JsonProperty("humidity")Double humidity) {		
	        sensor =new Sensor(sensorName);
	        this.temperature = temperature;
	        this.pressure = pressure;
	        this.humidity = humidity;
	}
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
	
	@CreationTimestamp
	@Column(updatable=false,nullable = false)
	private LocalDateTime created;
	
	private double temperature;	// Celsus 
	private double pressure;	// mmHg
	private double humidity;	// %
	
	@ManyToOne
	@JoinColumn(name = "sensor_id")
	private Sensor sensor;
	

}
