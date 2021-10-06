package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
//same bean that is created in configuration class is autowired 
//here
public class PrintBeans {
	
	@Autowired
	CompactDisc cd;
	
	public void print() {
		System.out.println("from pBeans: " + cd);
	}
	

}
