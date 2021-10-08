package configure.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vehicle{
	
	@Autowired
	Engine eng;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		eng.run();
	}

}
