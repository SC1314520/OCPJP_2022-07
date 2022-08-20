package Basic.localization;

import java.text.NumberFormat;
import java.util.Locale;

// forLanguageTag();
public class ex3 {
	public static void main(String[] args) {
		Locale usLocale = Locale.forLanguageTag("en-US");
		Locale deLocale = Locale.forLanguageTag("de-Germany");
		Locale zhLocale = Locale.forLanguageTag("zh-CN");
		long number = 123456789L;
		NumberFormat denf = NumberFormat.getInstance(deLocale);
		NumberFormat usnf = NumberFormat.getInstance(usLocale);
		NumberFormat zhnf = NumberFormat.getInstance(zhLocale);
		System.out.println(denf.format(number));
		System.out.println(usnf.format(number));
		System.out.println(zhnf.format(number));

	}
}
/*

123.456.789
123,456,789
123,456,789

*/