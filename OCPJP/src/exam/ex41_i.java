package exam;

import java.util.List;
import java.util.stream.Collectors;

public class ex41_i {
	public static void main(String[] args) {
		var readings=List.of(new Thermometer("HOT!",72),
				new Thermometer("Too Cold",0),
				new Thermometer("Just right!",72));
			readings
				.parallelStream()			   // k1 -->stream
				.collect(Collectors.groupingByConcurrent(
					Thermometer::getTemp)) ;    // k2 --> ConcurrentMap 類型
			//	.forEach(System.out::println); // k3  --> ConcurrentMap 類型的 forEach 需要兩個參數
			
		
		}
	}

class Thermometer {
	private String feelsLike;
	private double temp;
	
	
	public Thermometer(String feelsLike, double temp) {
		super();
		this.feelsLike = feelsLike;
		this.temp = temp;
	}
	public String getFeelsLike() {
		return feelsLike;
	}
	public void setFeelsLike(String feelsLike) {
		this.feelsLike = feelsLike;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	public String toString() {
		return "Thermometer [feelsLike=" + feelsLike + ", temp=" + temp + "]";
	}
}
/*
What is a possible output of the following application?
import java.url.*;
import java.util.stream.*;
public 
	// Constructor/Getters/Setters Omitted
	
	
	public static void main(String... season) {
		var readings=List.of(new Thermometer("HOT!",72),
			new Thermometer("Too Cold",0),
			new Thermometer("Just right!"72));
		readings
			.parallelStream()			   // k1
			.collect(Collectors.groupingByConcurrent(
				Thermometer::getTemp))     // k2
			.forEach(System.out::println); // k3
	
	}}


A) {0.0=[Cold!], 72.0=[Hot!, Just right!]}
B) {0.0=[Cold!], 72.0=[Just right!] , 72.0=[HOT!]}
C) The code does not compile because of line k1
D) The code does not compile because of line k2
E) The code does not compile because of line k3
F) None of the above







ans:E


*/