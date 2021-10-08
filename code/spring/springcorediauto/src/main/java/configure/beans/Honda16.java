package configure.beans;

public class Honda16 implements Engine {

	private String name = "Honda 1.6";
	private String speed = "1600cc";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running " + name + " with capacity " + speed);
	}

}
