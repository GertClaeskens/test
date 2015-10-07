package Generics;

import java.util.Arrays;

public class oef1 {

	public static void main(String[] args) {
		Integer[] ints = {1,2,3,4,5,6,7,8,9,0};
		String[] strings = {"test","wie","is","daar"};
		Double[] doubles = {3.5,2.6,4.8,1.2};
		
		printArray(keerOm(ints));
		printArray(keerOm(strings));
		printArray(keerOmGen(ints));
		printArray(keerOmGen(strings));
		printArray(keerOmGen(doubles));
	}
	public static Integer[] keerOm(Integer[] ints){
		int lengte = ints.length-1;
		Integer[] keerom = new Integer[ints.length];
		for (int i=0;i<=lengte;i++){
			keerom[i]=ints[lengte-i];
		}		
		return keerom;
	}
	public static String[] keerOm(String[] ints){
		int lengte = ints.length-1;
		String[] keerom = new String[ints.length];
		for (int i=0;i<=lengte;i++){
			keerom[i]=ints[lengte-i];
		}		
		return keerom;
	}
	public static <T>  T[] keerOmGen(T[] ints){
		int lengte = ints.length-1;
		T[] keerom = Arrays.copyOf(ints,ints.length);
		//T[] keerom = new T[lengte];
		for (int i=0;i<=lengte;i++){
			keerom[i]=ints[lengte-i];
		}		
		return keerom;
	}
	public static <T> void printArray(T[] obs){
		for (T o:obs){
			System.out.print(o +" ");
		}
		System.out.println(); 
	}
}
