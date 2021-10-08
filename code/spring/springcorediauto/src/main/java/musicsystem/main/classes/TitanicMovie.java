package musicsystem.main.classes;

import org.springframework.stereotype.Component;

@Component
public class TitanicMovie implements CompactDisc{
	
	private String title="Titanic movie", artist="james horner";
	
	public TitanicMovie() {
		
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "playing " + title + " by " + artist;
	}

}
