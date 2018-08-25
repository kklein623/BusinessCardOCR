import java.io.IOException;
import java.util.Scanner;

public class BusinessCardParserCli {

	public static void main(String[] args) throws IOException {
		
		BusinessCardParser businessCardParser = new BusinessCardParser();
		
		boolean inputMode = false;
		String input = "";
		
		final String DIALOGUE = "Welcome. Please type a command: \n"
				+ "Input - Use the command line to input business card text blocks.\n"
				+ "Exit  - Exit the Business Card OCR.\n";
		System.out.print(DIALOGUE);
		Scanner scanIn = new Scanner(System.in);
		String command = "";
		
		System.out.println("Enter command");   
		while (!command.toLowerCase().equals("exit") | inputMode) {
			command = scanIn.nextLine();
			
			if (inputMode) {
				if (command.equals("")){
					inputMode = false;
					System.out.println("Out of Input Mode");
					ContactInfo temp = businessCardParser.getContactInfo(input);
					System.out.println(temp.printContactInfo());
					input = "";
				}
				else input += command + "\n";
			}
			
			else if (command.toLowerCase().equals("input")){
				System.out.println("In Input Mode");
				System.out.println("Please enter your business card strings. To finish, line break on an empty line");
				inputMode = true;
			}
			
			else if (!command.toLowerCase().equals("exit")) {
				System.out.println("Command " + command +" doesn't exist. Please try again with \"Input\" or \"Exit\"");  
			}
			
		}
		scanIn.close();
		System.out.println("Exiting");
	}

}
