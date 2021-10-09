package soundsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerImportConfig.class)
public class ImportXmlConfigTest {

  @Autowired
  private MediaPlayer player;
  
  @Autowired
  private CompactDisc disc;


  @Test
  public void play() {
    System.out.println(player.play());
    assertEquals(
        "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n" +
        "-Track: Sgt. Pepper's Lonely Hearts Club Band\n" +
        "-Track: With a Little Help from My Friends\n" +
        "-Track: Lucy in the Sky with Diamonds\n" +
        "-Track: Getting Better\n" +
        "-Track: Fixing a Hole\n",
        player.play());
  
  
  assertEquals(disc.play(),player.play());
  }

}
