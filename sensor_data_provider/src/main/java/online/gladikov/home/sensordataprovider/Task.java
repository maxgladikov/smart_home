package online.gladikov.home.sensordataprovider;

import java.util.List;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import online.gladikov.home.sensordataprovider.property.ConfigSensors;
import online.gladikov.home.sensordataprovider.service.SensorReader;

@Service
@EnableScheduling
@RequiredArgsConstructor
public class Task {
	private final List<SensorReader> clients;
//	private final ConfigSensors sensors;
	
	 @Scheduled(cron="0/30 * * ? * *")
	public void getRecord() {
		 clients.parallelStream().forEach(client -> System.out.println(client.getRecord()));
		 System.out.println("***************");
//		 System.out.println(sensors.getUrl());
	 }
	
}



//
//┌───────────── second (0-59)
//│ ┌───────────── minute (0 - 59)
//│ │ ┌───────────── hour (0 - 23)
//│ │ │ ┌───────────── day of the month (1 - 31)
//│ │ │ │ ┌───────────── month (1 - 12) (or JAN-DEC)
//│ │ │ │ │ ┌───────────── day of the week (0 - 7)
//│ │ │ │ │ │          (or MON-SUN -- 0 or 7 is Sunday)
//│ │ │ │ │ │
//* * * * * *
