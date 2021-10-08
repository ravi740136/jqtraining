package musicsystem.packs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "external,musicsystem.main.classes,configure.beans")
//scan base packages and also the sub packages of them
//multiple component scan annotations is allowed
@ComponentScan(basePackages = "external")
@ComponentScan(basePackages = "configure.beans")
//specifying single package, it will scan subpackages also
@ComponentScan(basePackages = "musicsystem.main")
public class CDConfigPackages {
}
