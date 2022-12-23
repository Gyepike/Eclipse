package com.anti.core.core.lamba;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//https://www.youtube.com/watch?v=4HC_WyBSDGA
interface defultMethod {
	default void write(String outText) {
		System.out.println(outText);
	};
}

// only method present except method from object class all class extends object!!
@FunctionalInterface // only one method !!!
interface functionalInterFace {
	void show(int out);

	@Override // from Object extends this is fine !!
	String toString();
	// int add();
}

class implement implements functionalInterFace {

	@Override
	public void show(int out) {
		System.out.println("USE Implement InterFace : " + out);
	}

}

public class LambdaExp implements defultMethod {

	private static void executeLambda() {
		// https://www.youtube.com/watch?v=4HC_WyBSDGA

		LambdaExp exp = new LambdaExp();
		exp.write("Use Defult method: we can implment code in interface !! ");

		// with implent interface !!
		functionalInterFace imp = new implement();
		imp.show(4);

		// with anonymus InnerClass
		functionalInterFace obj = new functionalInterFace() {

			@Override
			public void show(int out) {
				// TODO Auto-generated method stub
				System.out.println("USe only interface! From anonymus InnerClass :" + out);
			}

		};
		obj.show(4);
		// with lambad same prevoius
		functionalInterFace obj2 = (int in) -> { // () method show paratmert
			System.out.println("With lamba same !!WE MUTS HE ONLY ONE METHOD!! @FunctionalInterface !!! " + in);
		};
		obj2.show(4);

		functionalInterFace obj3 = (int in) -> System.out.println("We One line ! no { } needed " + in);
		obj3.show(4);

		System.out.println("Watch video: https://www.youtube.com/watch?v=4HC_WyBSDGA");
	}

	public static void main(String[] args) {
		// executeLambda();
		List<Integer> list = Arrays.asList(1, 4, 7, 11, 3);

		System.out.println("-----------With For each-------------");
		for (Integer number : list) {
			System.out.print(number + " ");
		}
		System.out.println("");
		
		//https://www.youtube.com/watch?v=Wggc6Ziy8X8 
		System.out.println("----------With -Consumer-------------");
		Consumer<Integer> cons = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.print(t+" ");
			}
		};
		
		list.forEach(cons);
		System.out.println();
		System.out.println("-----------with inner Class-------------");
		
		list.forEach(
				new Consumer<Integer>() {
					
					@Override
					public void accept(Integer t) {
						// TODO Auto-generated method stub
						System.out.print(t+" ");
					}
				  }
				);
		
		System.out.println();
		System.out.println("---------------Lambda exp------------------");
		list.forEach( (n) -> System.out.print(n+" "));
	}
}
