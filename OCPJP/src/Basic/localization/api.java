package Basic.localization;

import java.util.Arrays;
import java.util.Locale;

public class api {
	public static void main(String[] args) {
		
		// 常量用法
		System.out.println(Locale.CHINA); // zh_CN
		System.out.println(Locale.CHINESE); // zh
		
		/*
		 *  Locale(String language)
		 *  Locale(String language, String country)
		 *  Locale(String language, String country, String variant)
		 */
		
		// getDefault --> Gets the current value of the default locale for this instance of the Java Virtual Machine.
		Locale l = Locale.getDefault();
		System.out.println(l.getCountry()+" "+l.getLanguage()); // TW zh
	
		// setDefault  --> Sets the default locale for this instance of the Java Virtual Machine.
		Locale l2 =new Locale("en","US","utf-8");
		Locale.setDefault(l2);
		System.out.println(l2.getCountry()+" "+l2.getLanguage()); // US en
	
		// getISOLanguages() --> Returns a list of all 2-letter language codes defined in ISO 639.
		String[] s=Locale.getISOLanguages();
		System.out.println("ISO lang= "+Arrays.toString(s));// ISO lang= [aa, ab, ae, af, ak, am,....]
		// getISOCountries() --> Returns a list of all 2-letter country codes defined in ISO 3166.
		String[] s2=Locale.getISOCountries();
		System.out.println("ISO countries= "+Arrays.toString(s2)); // ISO countries= [AD, AE, AF, AG, AI, AL, AM, AO, AQ, AR,...]
		
		
		
		
		
		
		// getAvailableLocales() --> Returns an array of all installed locales.
		Locale[] k=Locale.getAvailableLocales();
		
		for(Locale o:k) {
			 System.out.println("avaliable locale is: ");
//			 getDisplayCountry() --> Returns a name for the locale's country that is appropriate for display to the user.
//			 getDisplayLanguage() --> Returns a name for the locale's language that is appropriate for display to the user.
//			 getDisplayName() --> Returns a name for the locale that is appropriate for display to the user.
//			 getDisplayScript() --> Returns a name for the the locale's script that is appropriate for display to the user.
//			 getDisplayVariant() --> Returns a name for the locale's variant code that is appropriate for display to the user.
			System.out.println(o.getDisplayCountry()+"  "+o.getDisplayLanguage());
			System.out.println("DispalyName:"+o.getDisplayName());
			System.out.println("DisplayScript:"+o.getDisplayScript());
			System.out.println("DisplayVariant:"+o.getDisplayVariant());
			System.out.println();
			/*
			 avaliable locale is: 
			 France  Breton
             DispalyName:Breton (France)
             DisplayScript:  // Returns the empty string if this locale doesn't specify a script code.
             DisplayVariant:  // If the locale doesn't specify a variant code, this function returns the empty string.
			 */
		}
		
		// getVariant() --> Returns the variant code for this locale.
		String v=l2.getVariant();
		System.out.println(v); // utf-8   // The variant code, or the empty string if none is defined.
			
		
		
	}
}
