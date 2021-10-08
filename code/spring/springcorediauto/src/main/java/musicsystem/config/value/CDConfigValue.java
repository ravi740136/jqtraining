package musicsystem.config.value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import configure.beans.CarConfig;

@Configuration
//scan packages can be specified as value without mentioning the attributes
//configuration class which scans for component objects also created as
//beans and the beans are created based on the components scanned by
//that configuration class
//@ComponentScan("configure.components,musicsystem.main.classes,configure.beans")
@ComponentScan("musicsystem.main.classes,configure.beans")
@ComponentScan(basePackages="configure.components")
//@ComponentScan(basePackageClasses=configure.components.ExternalCDPlayerConfig.class)
//@ComponentScan("external,musicsystem.main.classes,configure.beans")
//we can use the configuration class that returns beans also in component 
//scan
//@ComponentScan("configure.beans")
//@ComponentScan(basePackageClasses = CarConfig.class)
//@ComponentScan("external")
//@ComponentScan("external,musicsystem.main")
public class CDConfigValue {
	
	

}
