package features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/*
 jdk introduced several predefined function interfaced to support lambda expression
 and functional programming
 Predefined functional interface in jdk 1.8:-
 1. Predicate 
 2. Function
 3. Consumer
 4. Supplier
 
 Q. what is a Predicate-
 => It is a functional interface introduced in JDK 1.8 version 
 => It is available in java.util.function package.
 => It has an abstract method which is test() method.
 => Prototype:
 interface Predicate<T>{
 	boolean test(T t);
 }
 =>It is used extensively in functional programming and stream API Operations.
 
 Q.How to use Predicate-
 Please be informed that you can use this predicate to refer
 lambda Expressions.
 
 public class Rahul implements Predicate<Integer>{
 write a logic to check if the number is great than 100 or not
 without using lambda expression
 public boolean test(Integer t){
 	if(t>100){
 		return true;
 	}else{
 		return false;
 	}
 }
 	public static void main(String[] args){
 		Predicate<Integer> p = new Prasoon();
 		System.out.println(p.test(1000));
 		System.out.println(p.test(10));
 		System.out.println(p.test(100));
 		System.out.println(p.test(10000));
 	}
 }
 
 With lambdaExpression-
 psvm(){
// 	Predicate<Integer> p = (t)->{
// 		if(t>100) {
// 			return true;
// 		}else{
// 			return false;
// 		}
// 	}; OR

	//Predicate<Integer> p = (t) -> (t>100); or
	
	Predicate<Integer> p = t -> t>100;
 
 	System.out.println(p.test(1000));
 	System.out.println(p.test(10));
 	System.out.println(p.test(100));
 }
 
 WAP accept the String type of content and check length 7> true or false
 
 
 */



public class LectureThreeDemo{ //implements Predicate<Integer>{
//	public boolean test(Integer t) {
//		if(t>100) {
//			return true;
//		}else {
//			return false;
//		}
//	}

	public static void main(String[] args) {
//		LectureThreeDemo ltd = new LectureThreeDemo();
//		System.out.println(ltd.test(1000));
//		System.out.println(ltd.test(100));
//		System.out.println(ltd.test(10000));
//		Predicate<String> p = s -> s.length()> 7;
		
//		Predicate<Integer> p = (Integer t) -> {
//			if(t>100) {
//				return true;
//			}else {
//				return false;
//			}
//		}; or
		Predicate<Integer> p = t -> t>100;
		
		System.out.println(p.test(1000));
		
		//for collection
		Predicate<Collection> c = (Collection n) -> {
			if(n.isEmpty()) {
				return true;
			}else {
				return false;
			}
		};
		
		ArrayList<Integer> arrlist = new ArrayList<>();
		arrlist.add(10);
		System.out.println(c.test(arrlist));
//		
//		System.out.println(p.test("Rahul"));
//		System.out.println(p.test("Abhishekh"));
		
	}

}
