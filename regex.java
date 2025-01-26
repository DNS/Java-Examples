import java.util.regex.*;

public class regex {
	public static void main (String[] args) {
		// simple match, case sensitive
		Pattern p1 = Pattern.compile("stRIng.ABcde");
 		Matcher m1 = p1.matcher("input\nstring\nabcde");
		System.out.println( "Found: " + m1.find() );
		
		// simple match, case insensitive, dot match all
		Pattern p2 = Pattern.compile("stRIng.ABcde", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
 		Matcher m2 = p2.matcher("input\nstring\nabcde");
		System.out.println( "Found: " + m2.find() );
		
		System.out.println("=========================\n");
		
		// simple match, case insensitive, dot match all in regex pattern string
		Pattern p3 = Pattern.compile("(?ims)stRIng.ABcde");
 		Matcher m3 = p3.matcher("input\nstring\nabcde");
		System.out.println( "Found: " + m3.find() );
		
		System.out.println("=========================\n");
		
		// capture group match
		Pattern p4 = Pattern.compile("a(.)(.)d");
 		Matcher m4 = p4.matcher("abcd axzd atnd asnd abgd");
		while ( m4.find() ) {
			System.out.println( m4.group(0) );
			System.out.print("    " + m4.group(1) );
			System.out.println(m4.group(2) );
			System.out.println("---------------------");
		}


		// replace string
		System.out.println("hello".replace("l", "z"));
		System.out.println("hello".replaceAll("l", "z"));
		System.out.println("hello".replaceFirst("l", "z"));

	}

}


