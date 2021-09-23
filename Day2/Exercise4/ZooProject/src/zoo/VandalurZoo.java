package zoo;

import org.animals.Deer;
import org.animals.Elephant;
import org.animals.Giraffe;
import org.animals.Lion;
import org.animals.Monkey;
import org.animals.Tiger;

public class VandalurZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		Deer deer = new Deer();
		Monkey monkey = new Monkey();
		Elephant elephant = new Elephant();
		Giraffe giraffe = new Giraffe();
		
		lion.characteristics();
		System.out.println();
		
		tiger.characteristics();
		System.out.println();
		
		deer.characteristics();
		System.out.println();
		
		monkey.characteristics();
		System.out.println();
		
		elephant.characteristics();
		System.out.println();
		
		giraffe.characteristics();
		System.out.println();
	}

}
