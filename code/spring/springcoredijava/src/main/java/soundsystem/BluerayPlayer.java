package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

public class BluerayPlayer implements MediaPlayer {
	@Autowired
	CompactDisc cd;

	public BluerayPlayer() {

	}

	public BluerayPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		System.out.println("from player: " + cd);
		return cd.play() + "from blueray player";
	}

}
