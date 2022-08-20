package Basic.localization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

// 優先級別列表
public class ex4 {
	public static void main(String[] args) {
		String ranges = "en-US;q=1.0,en-GB;q=0.5,de-DE;q=0.0";
		List<Locale.LanguageRange> languageRanges = Locale.LanguageRange.parse(ranges);

		Collection<Locale> localesList = new ArrayList<>();
		localesList.add(Locale.forLanguageTag("en-GB"));
		localesList.add(Locale.forLanguageTag("en-US"));
		localesList.add(Locale.forLanguageTag("ja-*"));
		localesList.add(Locale.forLanguageTag("fe-FE"));

		List<Locale> filteredSet = Locale.filter(languageRanges,localesList);
		for(Locale locale : filteredSet){
		    System.out.println(locale.toString());
		}

	}
}
/*

en_US
en_GB

*/