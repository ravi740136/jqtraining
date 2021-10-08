package external;

import org.springframework.stereotype.Component;

import external.MediaPlayer;
import musicsystem.main.classes.CompactDisc;

@Component
public class CDPlayer implements MediaPlayer{
	
	musicsystem.main.classes.CompactDisc cd;
	
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return cd.play();
	}

}
