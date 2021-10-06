package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

	@Bean
	public CompactDisc compactDisc() {
		// return new SgtPeppers();
		return new TitanicMovie();
		// return new TitanicMovieBlueray();
	}

	// we can use method call instead of passing bean as parameter
	/*
	 * @Bean 
	 * public MediaPlayer myPlayer() {
	 *  return new CDPlayer(compactDisc()); 
	 *  }
	 * 
	 */
	
	
	// try injecting cd through constructor and also with
	// autowiring
	@Bean
	public MediaPlayer myPlayer(CompactDisc cd) {
		return new CDPlayer(cd);
		// return new BluerayPlayer(cd);
		// return new BluerayPlayer();

	}

	@Bean
	public PrintBeans myPrint() {
		return new PrintBeans();
	}

}
