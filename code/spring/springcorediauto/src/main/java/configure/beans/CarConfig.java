package configure.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
	
	@Bean
	public Vehicle myVehicle() {
		return new Car();
	}
	
	@Bean
	public Engine myEngine() {
		return new Honda16();
	}

}
