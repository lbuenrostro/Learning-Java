package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = reader.nextLine();
		System.out.println("Hello, " + name);

		System.out.print("Please have the same format as the example: ");
		System.out.println("32 F to C");
		Double temperature = reader.nextDouble();
		String startUnit = reader.next();
		reader.next();
		String endUnit = reader.next();
		TemperatureConverter convertTemp = new TemperatureConverter(startUnit, endUnit);
		System.out.print(convertTemp.convert(temperature) + " ");
		System.out.println(endUnit);

//		System.out.print("[C]elsius, [F]ahrenheit, or [K]elvin \n");
//		String source = reader.nextLine();
//		System.out.print("What unit are we converting to? ");
//		System.out.print("[C]elsius, [F]ahrenheit, or [K]elvin \n");
//		String result = reader.nextLine();
//		System.out.print("What temperature would you like to convert? ");
//		double temp = reader.nextDouble();
//		System.out.println("Your new temperature is: ");
		System.out.println("----------Temperature Converted----------");
	}
}


