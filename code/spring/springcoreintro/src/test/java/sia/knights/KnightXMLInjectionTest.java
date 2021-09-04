package sia.knights;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration
public class KnightXMLInjectionTest {

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
        "Fa la la, the knight is so brave!\n" +
        "Embarking on quest to slay the dragon!\n" +
        "Tee hee hee, the brave knight did embark on a quest!\n", 
        printStream.getPrintedString());
  }

}
