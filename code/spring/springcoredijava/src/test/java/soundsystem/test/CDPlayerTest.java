package soundsystem.test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import soundsystem.CDPlayerConfig;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;
import soundsystem.PrintBeans;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {

  @Autowired
  CompactDisc cd;	
	
  @Autowired
  private MediaPlayer player;
  
  //to check same cd object is injected by spring in all the places
  @Autowired
	PrintBeans pBeans;
	
  @Autowired
  ApplicationContext context;
  
  @Test
	public void validateCD() {
		assertNotNull(cd);
	}
//test with different players and cds
  @Test
  public void play() {
	  String s = player.play();
		System.out.println(s);
		assertEquals(s, cd.play());
		//assertEquals(s, cd.play() + "from blueray player");
  }
  
  @Test
  public void printTest() {
	  player.play();
	  System.out.println("from test: " + cd);
		pBeans.print();
		
		String[] beans = context.getBeanNamesForAnnotation(Bean.class);
		for (String bean : beans) {
			System.out.println(bean);
		}
  }

}
