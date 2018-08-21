# BusinessCardOcr

## Installation

Simply download the files or clone from the repository and open the files in "src" to view the source code. To build the jar, from the src folder, run "mvn clean install" to build the jar. It should be called "business-card-ocr-0.0.1.jar" and located in the target folder when finished.

## Running

To run the cli, run "java -jar business-card-ocr-0.0.1.jar" in a command line interface. Make sure your JRE is up to date.

## How to Use

When ran, type "input" to begin input mode. This will allow a business card to be pasted in the command line. Once you end it with an empty line, the parser will try to parse out the name, email, and phone number in the busuiness card you provided.

When out of input mode, type "exit" to exit.
