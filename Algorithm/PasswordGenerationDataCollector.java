
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PasswordGenerationDataCollector {

    //variables
    //Set vars
    private String favouriteWordsToBeUsed;
    private String favouriteWordsHasToBeUsed;
    private String specialCharactersToBeUsed;
    private String specialCharactersHasToBeUsed; 
    private String numbersHasToBeUsed;
	private String rememberingStrength;
    //int vars
    private int upperCaseCharCount;
    private int numbersCount;
    //PasswordGenerator
    PasswordGenerator passwordGenerator;

    public void performTask(){
        passwordGenerator = new PasswordGenerator();
        passwordGenerator.setFavouriteWordsHasToBeUsed(favouriteWordsHasToBeUsed);
        passwordGenerator.setFavouriteWordsToBeUsed(favouriteWordsToBeUsed);
        passwordGenerator.setSpecialCharactersHasToBeUsed(specialCharactersHasToBeUsed);
        passwordGenerator.setSpecialCharactersToBeUsed(specialCharactersToBeUsed);
        passwordGenerator.setNumbersCount(numbersCount);
        passwordGenerator.setNumbersHasToBeUsed(numbersHasToBeUsed);
        passwordGenerator.setUpperCaseCharCount(upperCaseCharCount);
        passwordGenerator.setRememberingStrength(rememberingStrength);
        System.out.println("PASSWORD :: "+passwordGenerator.generatePassword());
    }

    void getTestDataFromSource(){
        favouriteWordsToBeUsed = "";
        favouriteWordsHasToBeUsed = "vimal";
        specialCharactersHasToBeUsed = "$";
        specialCharactersToBeUsed = "";
        numbersCount = 3;
        numbersHasToBeUsed ="78";
        upperCaseCharCount = 2;
        rememberingStrength = "MEDIUM";
    }
	
	public static void main(String...arg){
		PasswordGenerationDataCollector pgdc = new PasswordGenerationDataCollector();
		pgdc.getTestDataFromSource();
		pgdc.performTask();
	}

}
