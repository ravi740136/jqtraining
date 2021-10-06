package soundsystem;

public class TitanicMovie implements CompactDisc{
	
	private String title="Titanic movie";
	private String artist="james horner";
	
	@Override
	public String play() {
		// TODO Auto-generated method stub		
		    return "Playing " + title + " by " + artist;
		
	}

}
