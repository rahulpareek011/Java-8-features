package features;

public class LectureOne {

	public static void main(String[] args) {
		//java 8 features
		
		//lambda expression - JDK 1.8
		// it is an anonymous function which is nameless function
		//name less means - no name, no modifier, no return type
		
		//used with only functional interfaces
		//often used for collections and Streams API
		
		//benefits -> to enable functional programming
		//-> To write more readable & maintainable and clear concise code.
		//-> To use API in easily and effective manner.
		//-> To enable parallel processing
		
		/*syntax-> (parameters) -> {};
		Parameters -> similar like methods parameters
		optional for use if there is only one parameter
		
		Arrow Operator(->):- separates the parameters from the
		body of the lambda expression
		
		Body:- logic(code)
		*/
		
		//usage
		
		//case1
//		//before java8
//		public void show() {
//			System.out.println("hello");
//		}
		
		//after java8
		//()->{ System.out.println("hello") };
		/*note: if u have only one line in the body, the curly
		 braces are optional
		*/
		//()-> System.out.println();
		
		//case2
//		//before java8
//		public void add(int a,int b) {//100 , 200
//			System.out.println(a+b);//300
//		}
		
		//after java8
		//(int a,int b)->{ System.out.println(a+b) }; or
		//(int a,int b) -> System.out.println(a+b); or
		//note: based on the context the compiler can able to 
		//recongnize the data type of the parameter so, optional
		//(a,b)-> System.out.println(a+b);
		
		
		//case2
//		//before java8
//		public int getLength(String s) {
//			return s.length();
//		}
		
		//after java8 lambda expression
		//(String s)-> return s.length(); or
		//note: if body contains single return statement
		//then the return statement is optional and 
		//if one parameter is being passed then parentheses around parameter
		//are optional
		//s-> s.length();
		
		
		//Lecture 2 -> Using programmatically 
		//Functional Interface - A interface containing Single abstract method
		//SAM(single abstract method)
		
		//from java 8 we can write inside interface-
		//default method
		//static method
		
		//eg.
//		interface I{
//			void m1();//by default public abstract
		
//			default void m2(){ //allow in java8
//				System.out.println("Hello m2 default method");
//			}
			
//			static void m3() { //allow in java8
//				System.out.println();
//			}
//		}
		
//		
//		class A Implements I{
//			pubilc void m1() {
//				System.out.println("Hello m1 method");
//			}
//		}
		
		
		//eg.
		//@functional Interface //if there is annotation of FunInter
		//and more than one abs.Method contains then compiler throw error

		
//		interface A{
//			public abstract void m1();
//			//public abstract void m1(); not allowed, default and static is allowed
//		}//normal interface can contain many methods
		
		
		//eg. Runnable which have SAM -> run()
		//eg. Callable(java.util.concurrent) -> call()
		//eg. Comparable (java.lang) -> compareTo()
		
		// if using without lambda Expression
		//class Test implements A{
			//public void m1(){
				//System.out.println("Hello m1 method");
			//}
		//}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
