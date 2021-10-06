package soundsystem;

public class TitanicMovieBlueray implements CompactDisc{
	
	private String title="Titanic movie", artist="james horner";

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Playing " + title + " by " + artist+ " in blueray format ";
	}

}
