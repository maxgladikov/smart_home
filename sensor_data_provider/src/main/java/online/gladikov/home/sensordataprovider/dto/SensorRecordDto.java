package online.gladikov.home.sensordataprovider.dto;

//import com.fasterxml.jackson.annotation.JsonCreator;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import lombok.Data;

//@Data
//public class SensorRecordDto {
//	
//	private String sensor;	// Celsus 
//	private double temperature;	// Celsus 
//	private double pressure;	// mmHg
//	private double humidity;	// %
//	
//	@JsonCreator
//	public SensorRecordDto(@JsonProperty("sensor")String sensor, @JsonProperty("temperature")Double temperature,
//															@JsonProperty("pressure")Double pressure,
//															@JsonProperty("humidity")Double humidity) {		
//	        this.sensor = sensor;
//	        this.temperature = temperature;
//	        this.pressure = pressure;
//	        this.humidity = humidity;
//	}
//
//}


public record SensorRecordDto (String sensor,double temperature,double pressure,double humidity) {}