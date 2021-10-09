package soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {

  private String title;
  private String artist;
  private List<String> tracks;

  public BlankDisc(String title, String artist, List<String> tracks) {
    this.title = title;
    this.artist = artist;
    this.tracks = tracks;
  }

  public String play() {
	  String s;
    s = "Playing " + title + " by " + artist+"\n";
    for (String track : tracks) {
      s = s + "-Track: " + track+"\n";
    }
    return s;
  }

}