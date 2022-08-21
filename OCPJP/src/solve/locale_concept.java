package solve;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ServiceLoader;

import Basic.Collection2.generics.list.obj.student;

public class locale_concept {
	
	private static ServiceLoader<student> Loader
		= ServiceLoader.load(student.class); // 無需 new

	public static void main(String[] args) {
		Locale usLocale = new Locale("en", "US");
		long number = 123456789L;
		NumberFormat usnf = NumberFormat.getInstance(usLocale);
		System.out.println(usnf.format(number));
		
		// Date
		Date now = new Date();
		DateFormat usdf = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, usLocale);
		System.out.println(usdf.format(now));
		
		//Currency
		Locale locale =Locale.US;
		int dollars =1000;
		NumberFormat usnfc =NumberFormat.getCurrencyInstance(locale);
		System.out.println(usnfc.format(dollars)); // $1,000.00
	}
}
/*
Which of the following are considered locales?(Choose three)
A. Culture region
B. Local address
C. City
D. Time zone region
E. Political region
F. Geographical region

ans:AEF


Culture region, Political region, Geographical region

*/


/*
When localizing an application, which type of data varies in presentation depending
on locale?

A. Currencies
B. Dates
C. Both
D. Neither

ans:C

*/

/*
Given the code fragment:

Locale locale=Locale.US;
// Line 1
double currency=1_00.00;
System.out.println(formatter.format(currency));

You want to display the value of currency as $100.00.

Which code inserted on line 1 will accomplish this?

A) NumberFormat formatter=NumberFormat.getInstance(locale).getCurrency();
B) NumberFormat formatter=NumberFormat.getInstance(locale);
C) NumberFormat formatter=NumberFormat.getCurrency(locale);
D) NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);



ans:D


*/


/*
Which code fragment does a service use to load the service provider with a Print interface?

A) private java.util.ServiceLoader<Print> loader=ServiceLoader.load(Print.class);
B) private Print print=com.service.Provider.getInstance();
C) private java.util.ServiceLoader<Print> loader=new java.util.ServiceLoader<>();
D) private Print print=new com.service.PrintImpl();



ans:A
*/