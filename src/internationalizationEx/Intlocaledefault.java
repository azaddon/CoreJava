package internationalizationEx;

import java.util.Locale;
import java.util.ResourceBundle;

public class Intlocaledefault {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		// Creates a locale object using a one parameter constructor
		Locale locale = new Locale("fr"); 
		System.out.println("locale: "+locale); 
		// Create a locale object using a two parameter constructor
		Locale locale2 = new Locale("en", "US");
		System.out.println("locale2: "+locale2);
		// Create a locale object using three parameter constructor
		Locale locale3 = new Locale("en", "US", "NY");
		System.out.println("locale3: "+locale3);
		// A local object from Locale.Builder
		Locale localeFromBuilder = new Locale.Builder().setLanguage("en").setRegion("US").build();
		System.out.println("localeFromBuilder: "+localeFromBuilder);

		//Locale from forLanguageTag method
		Locale forLangLocale = Locale.forLanguageTag("en-US");
		System.out.println("forLangLocale: "+forLangLocale);
		
		//Using Locale Contant
		Locale localeCosnt = Locale.FRANCE;
		System.out.println("localeCosnt: "+localeCosnt);
		Locale currentLocale;
        ResourceBundle messages;
        //currentLocale = new Locale(local);
        messages = ResourceBundle.getBundle("C:\\Users\\mohdazad.khan\\eclipse-workspace\\CoreJAVA\\src\\MessageBundle_in_ID.properties",localeCosnt);
        System.out.println(messages.getString("greetings"));
	}
}
