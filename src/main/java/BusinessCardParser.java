import java.io.IOException;

import parsers.*;

/**
 * Used to parse out the results of an optical character recognition (OCR) component for a business card reader
 * @author Kevin
 *
 */
public class BusinessCardParser {
	
	/**
	 * Parsed out a given string that's a business card
	 * @param document The business card text
	 * @return a ContactInfo object that contains the name, email, and phone number listed on the card if any
	 * @throws IOException Only if the en-ner-person.bin file is missing for the NameParser
	 */
	
	NameParser nameParser;
	
	public BusinessCardParser() throws IOException {
		this.nameParser = new NameParser();
	}
	
	public ContactInfo getContactInfo(String document) {
		ContactInfo contactInfo = new ContactInfo();
		contactInfo.setEmailAddress(EmailAddressParser.getEmail(document));
		contactInfo.setPhoneNumber(PhoneNumberParser.getOfficePhoneNumber(document));
		contactInfo.setName(nameParser.getName(document));
		return contactInfo;
	}

}
