package Basic.localization;

import java.util.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ex2 {
	public static void main(String[] args) {
		Locale deLocale = new Locale("de", "De");
		Locale usLocale = new Locale("en", "US");
		Locale zhLocale = new Locale("zh", "CN");
		long number = 123456789L;
		NumberFormat denf = NumberFormat.getInstance(deLocale);
		NumberFormat usnf = NumberFormat.getInstance(usLocale);
		NumberFormat zhnf = NumberFormat.getInstance(zhLocale);
		System.out.println(denf.format(number));
		System.out.println(usnf.format(number));
		System.out.println(zhnf.format(number));
		
		// Date
		Date now = new Date();
		DateFormat usdf = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, usLocale);
		DateFormat dedf = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, deLocale);
		DateFormat zhdf = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, zhLocale);
		System.out.println(usdf.format(now));
		System.out.println(dedf.format(now));
		System.out.println(zhdf.format(now));
		
		//Currency
		Locale locale =Locale.US;
		int dollars =1000;
		NumberFormat usnfc =NumberFormat.getCurrencyInstance(locale);
		System.out.println(usnfc.format(dollars)); // $1,000.00
		

	}
}
/*
 

123.456.789
123,456,789
123,456,789
August 20, 2022 at 12:20:07 AM CST
20. August 2022 um 00:20:07 CST
2022年8月20日 CST 上午12:20:07


*/