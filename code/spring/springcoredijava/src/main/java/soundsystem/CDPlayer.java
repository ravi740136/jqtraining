package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;
  
  public CDPlayer() {
	  
  }

  
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

 public void setCompactDisc(CompactDisc cd){
	  this.cd = cd;
  }

public String play() {
    return cd.play();
  }

}
