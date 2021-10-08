package musicsystem.classes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import external.MediaPlayer;
import musicsystem.main.classes.CompactDisc;

@Configuration
@ComponentScan(basePackageClasses = {MediaPlayer.class,CompactDisc.class})
//multiple component scan annotations are allowed
//single class, will scan the package of the class and also 
//subpackages
//@ComponentScan(basePackageClasses = MediaPlayer.class)
//@ComponentScan(basePackageClasses = CompactDisc.class)
public class CDConfigClasses {
	
	

}
