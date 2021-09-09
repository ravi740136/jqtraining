package sia.knights;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes=KnightConfig.class,loader=AnnotationConfigContextLoader.class)
@ContextConfiguration(classes=KnightConfig.class)
public class KnightJavaConfigInjectionTest {

  @Autowired
  Knight knight;
  
  @Autowired
  FakePrintStream printStream;

  @AfterEach
  public void clearPrintStream() {
    printStream.clear();
  }

  @Test
  public void shouldInjectKnightWithSlayDragonQuest() {
    knight.embarkOnQuest();
    assertEquals(
        "Embarking on quest to slay the dragon!\n", 
        printStream.getPrintedString());
  }

}
