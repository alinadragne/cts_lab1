package ro.ase.cts.seminar7.Main;

import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import ro.ase.cts.seminar7.Adapter.AdapterMetric;
import ro.ase.cts.seminar7.Adapter.AmericanCar;
import ro.ase.cts.seminar7.Adapter.Lamborghini;
import ro.ase.cts.seminar7.Adapter.MoveableImperial;

public class Main7 {

	public static void main(String[] args) {
		ArrayList<MoveableImperial> cars = new ArrayList<MoveableImperial>();
		cars.add(new AmericanCar("Ford"));
		cars.add(new AmericanCar("Chevrolet"));
		cars.add(new AmericanCar("Dodge"));
		
		Lamborghini lambo = new Lamborghini("Aventador");
		
		AdapterMetric adapter = new AdapterMetric(lambo);
		cars.add(adapter);
		
		for(MoveableImperial car : cars)
		{
			System.out.println("Max speed is " + car.getMaxSpeed());
		}
		
		System.out.println(cars.get(0).getMaxSpeed());
		

	}

}
