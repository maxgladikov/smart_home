package online.gladikov.home.sensordataprovider.service;

import org.springframework.web.service.annotation.GetExchange;

import online.gladikov.home.sensordataprovider.dto.SensorRecordDto;
import online.gladikov.home.sensordataprovider.model.SensorRecord;

public interface SensorReader {
	@GetExchange("/")
    SensorRecordDto	 getRecord();

}
