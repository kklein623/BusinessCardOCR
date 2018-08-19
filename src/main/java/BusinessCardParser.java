import java.io.IOException;
import parsers.*;

public class BusinessCardParser {
	
	public static ContactInfo getContactInfo(String document) throws IOException {
		ContactInfo contactInfo = new ContactInfo();
		contactInfo.setEmailAddress(EmailAddressParser.getEmail(document));
		contactInfo.setPhoneNumber(PhoneNumberParser.getOfficePhoneNumber(document));
		contactInfo.setName(NameParser.getName(document));
		return contactInfo;
	}

}
