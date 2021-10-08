package musicsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import configure.beans.Vehicle;
import external.MediaPlayer;
import musicsystem.main.classes.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/musicsystem.xml")
//@ContextConfiguration(classes = soundsystem.config.value.CDConfigValue.class)
//@ContextConfiguration(classes = soundsystem.packs.CDConfigPackages.class)
//@ContextConfiguration(classes = soundsystem.classes.CDConfigClasses.class)
public class MediaPlayerXMLConfigTest {

	@Autowired
	CompactDisc cd;

	@Autowired
	MediaPlayer mPlayer;

	@Autowired
	ApplicationContext context;

	@Autowired
	Vehicle car;

	@Test
	public void test1() {
		assertNotNull(cd);
	}

	@Test
	public void test2() {
		String s = mPlayer.play();
		System.out.println(s);
		// assertEquals(s, cd.play() + "from blueray player");
		assertEquals(s, cd.play());
	}

	@Test
	public void print() {
		String[] beans = context.getBeanNamesForType(Object.class);
		for (String s : beans) {
			System.out.println(s);
		}
	}

	@Test
	public void test3() {
		car.run();
	}

}
