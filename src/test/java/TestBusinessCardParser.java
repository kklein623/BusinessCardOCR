import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TestBusinessCardParser {
	
	private final static String SAMPLE_1 = 	"ASYMMETRIK LTD\n" 
											+ "Mike Smith\n"
											+ "Senior Software Engineer\n" 
											+ "(410)555-1234\n"
											+ "msmith@asymmetrik.com";
	
	private final static String SAMPLE_2 = 	"Foobar Technologies\n" 
											+ "Analytic Developer\n" 
											+ "Lisa Haung\n" 
											+ "1234 Sentry Road\n" 
											+ "Columbia, MD 12345\n" 
											+ "Phone: 410-555-1234\n" 
											+ "Fax: 410-555-4321\n"  
											+ "lisa.haung@foobartech.com";
	
	private final static String SAMPLE_3 = 	"Arthur Wilson\n" 
											+ "Software Engineer\n" 
											+ "Decision & Security Technologies\n" 
											+ "ABC Technologies\n" 
											+ "123 North 11th Street\n" 
											+ "Suite 229\n" 
											+ "Arlington, VA 22209\n" 
											+ "Tel: +1 (703) 555-1259\n" 
											+ "Fax: +1 (703) 555-1200\n" 
											+ "awilson@abctech.com";
	
	private final static String SAMPLE_4 = 	"Zogg Law Firm LLC\n"
											+ "Family Lawe . Bankruptcy . Litigation\n"
											+ "Mary Zogg\n"
											+ "954.703.0005\n"
											+ "mary@zogglaw.com\n"
											+ "www.zogglaw.com";
	
	private final static String SAMPLE_5 = 	"Holland & Knight LLP\n"
											+ "Gary Schoenbrun\n"
											+ "Stamford: 203.905.4530\n"
											+ "New York: 203.905.4530\n"
											+ "www.hklaw.com";
	
	private void TestSample(String name, String number, String email, String sample) throws IOException {
		ContactInfo ci = BusinessCardParser.getContactInfo(sample);
		assertEquals(name, ci.getName());
		assertEquals(number, ci.getPhoneNumber());
		assertEquals(email, ci.getEmailAddress());
	}

	@Test
	public void TestSample1() throws IOException {
		TestSample("Mike Smith", "4105551234", "msmith@asymmetrik.com", SAMPLE_1);
	}
	
	@Test
	public void TestSample2() throws IOException {
		TestSample("Lisa Haung", "4105551234", "lisa.haung@foobartech.com", SAMPLE_2);
	}
	
	@Test
	public void TestSample3() throws IOException {
		TestSample("Arthur Wilson", "17035551259", "awilson@abctech.com", SAMPLE_3);
	}
	
	@Test
	public void TestSample4() throws IOException {
		TestSample("Mary Zogg", "9547030005", "mary@zogglaw.com", SAMPLE_4);
	}
	
	@Test
	public void TestSample5() throws IOException {
		TestSample("Gary Schoenbrun", "2039054530", "None", SAMPLE_5);
	}

}
