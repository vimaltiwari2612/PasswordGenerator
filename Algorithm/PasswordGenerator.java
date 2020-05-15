
import java.util.*;
import java.util.regex.Pattern;

public class PasswordGenerator implements AbstractPasswordGenerator{

    //variables
    //Set vars
    private Set<String> favouriteWordsToBeUsed;
    private Set<String> favouriteWordsHasToBeUsed;
    private Set<String> specialCharactersToBeUsed;
    private Set<String> specialCharactersHasToBeUsed;
    private Set<Integer> numbersHasToBeUsed;
	private String rememberingStrength;
    //int vars
    private int upperCaseCharCount;
    private int numbersCount;
	//enum for strenght
	public enum Level {
		HIGH,
		MEDIUM,
		LOW
	}
    //pattern for alpha chars
    private static Pattern p = Pattern.compile("^[a-zA-Z]*$");

    public Set<String> getFavouriteWordsToBeUsed() {
        return favouriteWordsToBeUsed;
    }

    public void setFavouriteWordsToBeUsed(String favouriteWordsToBeUsed) {
        this.favouriteWordsToBeUsed = new HashSet<>();
        if(favouriteWordsToBeUsed.contains(",")){
            Collections.addAll(this.favouriteWordsToBeUsed,favouriteWordsToBeUsed.split(","));
        }
        else{
			if(!favouriteWordsToBeUsed.trim().isEmpty()){
				this.favouriteWordsHasToBeUsed.add(favouriteWordsToBeUsed);
			}
        }
    }

    public Set<String> getFavouriteWordsHasToBeUsed() {
        return favouriteWordsHasToBeUsed;
    }

    public void setFavouriteWordsHasToBeUsed(String favouriteWordsHasToBeUsed) {
        this.favouriteWordsHasToBeUsed = new HashSet<>();
        if(favouriteWordsHasToBeUsed.contains(",")) {
            Collections.addAll(this.favouriteWordsHasToBeUsed, favouriteWordsHasToBeUsed.split(","));
        }
        else{
			if(!favouriteWordsHasToBeUsed.trim().isEmpty()){
				this.favouriteWordsHasToBeUsed.add(favouriteWordsHasToBeUsed);
			}
        }
    }

    public Set<String> getSpecialCharactersToBeUsed() {
        return specialCharactersToBeUsed;
    }

    public void setSpecialCharactersToBeUsed(String specialCharactersToBeUsed) {
        this.specialCharactersToBeUsed = new HashSet<>();
        if(specialCharactersToBeUsed.contains(",")) {
            Collections.addAll(this.specialCharactersToBeUsed, specialCharactersToBeUsed.split(","));
        }
        else{
			if(!specialCharactersToBeUsed.trim().isEmpty()){
				this.specialCharactersToBeUsed.add(specialCharactersToBeUsed);
			}
        }
    }

    public Set<String> getSpecialCharactersHasToBeUsed() {
        return specialCharactersHasToBeUsed;
    }

    public void setSpecialCharactersHasToBeUsed(String specialCharactersHasToBeUsed) {
        this.specialCharactersHasToBeUsed = new HashSet<>();
        if(specialCharactersHasToBeUsed.contains(",")) {
            Collections.addAll(this.specialCharactersHasToBeUsed, specialCharactersHasToBeUsed.split(","));
        }
        else{
			if(!specialCharactersHasToBeUsed.trim().isEmpty()){
				this.specialCharactersHasToBeUsed.add(specialCharactersHasToBeUsed);
			}
        }
    }

    public Set<Integer> getNumbersHasToBeUsed() {
        return numbersHasToBeUsed;
    }

    public void setNumbersHasToBeUsed(String numbersHasToBeUsed) {
        this.numbersHasToBeUsed = new HashSet<>();
        if(numbersHasToBeUsed.contains(",")) {
            for (String num : numbersHasToBeUsed.split(",")) {
                num = num.trim();
                this.numbersHasToBeUsed.add(Integer.parseInt(num));
            }
        }else{
            if(!numbersHasToBeUsed.trim().isEmpty()) {
                this.numbersHasToBeUsed.add(Integer.parseInt(numbersHasToBeUsed));
            }
        }
    }

    public int getUpperCaseCharCount() {
        return upperCaseCharCount;
    }

    public void setUpperCaseCharCount(int upperCaseCharCount) {
        this.upperCaseCharCount = upperCaseCharCount;
    }

    public String getRememberingStrength() {
        return rememberingStrength;
    }

    public void setRememberingStrength(String rememberingStrength) {
		if( rememberingStrength.toLowerCase().trim().equals(Level.HIGH.name().toLowerCase())) {
			this.rememberingStrength = rememberingStrength;
		} else if( rememberingStrength.toLowerCase().trim().equals(Level.MEDIUM.name().toLowerCase())) {
			this.rememberingStrength = rememberingStrength;
		} else if( rememberingStrength.toLowerCase().trim().equals( Level.LOW.name().toLowerCase())) {
			this.rememberingStrength = rememberingStrength;
		}
    }

    public int getNumbersCount() {
        return numbersCount;
    }

    public void setNumbersCount(int numbersCount) {
        this.numbersCount = numbersCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PasswordGenerator)) return false;
        PasswordGenerator that = (PasswordGenerator) o;
        return getUpperCaseCharCount() == that.getUpperCaseCharCount() &&
                getRememberingStrength() == that.getRememberingStrength() &&
                getNumbersCount() == that.getNumbersCount() &&
                getFavouriteWordsToBeUsed().equals(that.getFavouriteWordsToBeUsed()) &&
                getFavouriteWordsHasToBeUsed().equals(that.getFavouriteWordsHasToBeUsed()) &&
                getSpecialCharactersToBeUsed().equals(that.getSpecialCharactersToBeUsed()) &&
                getSpecialCharactersHasToBeUsed().equals(that.getSpecialCharactersHasToBeUsed()) &&
                getNumbersHasToBeUsed().equals(that.getNumbersHasToBeUsed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFavouriteWordsToBeUsed(), getFavouriteWordsHasToBeUsed(), getSpecialCharactersToBeUsed(), getSpecialCharactersHasToBeUsed(), getNumbersHasToBeUsed(), getUpperCaseCharCount(), getRememberingStrength(), getNumbersCount());
    }

    @Override
    public String toString() {
        return "PasswordGenerator{" +
                "favouriteWordsToBeUsed=" + favouriteWordsToBeUsed +
                ", favouriteWordsHasToBeUsed=" + favouriteWordsHasToBeUsed +
                ", specialCharactersToBeUsed=" + specialCharactersToBeUsed +
                ", specialCharactersHasToBeUsed=" + specialCharactersHasToBeUsed +
                ", numbersHasToBeUsed=" + numbersHasToBeUsed +
                ", upperCaseCharCount=" + upperCaseCharCount +
                ", rememberingStrength=" + rememberingStrength +
                ", numbersCount=" + numbersCount + '\'' +
                '}';
    }

    /*
    * actual algorithm to generate password
    *  @assumptions
    *   1. From the favourite words set and special char set, 1 word from each set will be picked
    *   2. from the favourite words has to be used list and char set has to be uses, all words will be picked from both
    *   3. if any specific no. needs to be included, add to the number set
    *   4. How many no. of uppercase needed = upperCaseCharCount.
    *   5. total numeric values = numberCount
    *   6. rememberingStrength defined the complexity in terms of how hard the password can be remembered .
	*
	
		Steps:
		1. Get the data from user
		2. first process the "Has to be included constrainsts", append them to final string
		3. then process Should be included words, 
			1. pick random word from Chars, append them to final string
			2. pick random word from special chars,append them to final string
		4. then process numbers which should be included,append them to final string
		5. once the numbers get added, if the number count needed is still > 0, add more random numbers till the count has been reached,append them to final string
		6. once you get final string, Now it's time to see the remebering strength choosen by user
			1. LOW	- easy to remeber, that is no need to change any thing as the above logic is for LOW strength.
			2. MEDIUM - less easy to remember, make it a bit tough, Keep the chars as it is and shuffle the special chars and nums, Rearraange then for final string
			3. HIGH - it should be tough, hard to remeber, shuffle all chars randomly and make the final string
     */

    public String generatePassword(){
        String toBeReturned = "";
		String chars = "";
		String nums = "";
		String specialChars = "";
		
        //take the "has to be used sets first and add them to final String"
        if(this.getFavouriteWordsHasToBeUsed() != null && this.getFavouriteWordsHasToBeUsed().size() > 0){
            Set<String> favouriteWordsHasToBeUsed = this.getFavouriteWordsHasToBeUsed();
            Collections.shuffle(Arrays.asList(favouriteWordsHasToBeUsed));
            for(String word : favouriteWordsHasToBeUsed){
                word = word.trim();
                toBeReturned += word;
				chars += word;
            }
        }
		
		//take the "has to be used sets first and add them to final String"
        if(this.getSpecialCharactersHasToBeUsed() != null && this.getSpecialCharactersHasToBeUsed().size() > 0){
            Set<String> specialCharactersHasToBeUsed = this.getSpecialCharactersHasToBeUsed();
            Collections.shuffle(Arrays.asList(specialCharactersHasToBeUsed));
            for(String word : specialCharactersHasToBeUsed){
                word = word.trim();
                toBeReturned += word;
				specialChars += word;
            }
        }

        //take the "favourite words set, pick one"
        if(this.getFavouriteWordsToBeUsed() != null && this.getFavouriteWordsToBeUsed().size() > 0){
            List<String> favouriteWordsToBeUsed = new ArrayList<>(this.getFavouriteWordsToBeUsed());
            String word = favouriteWordsToBeUsed.get(this.getRandom(favouriteWordsToBeUsed.size()));
            word = word.trim();
            while(toBeReturned.contains(word)){
                word = word.trim();
                word = favouriteWordsToBeUsed.get(this.getRandom(favouriteWordsToBeUsed.size()));
            }
            word = word.trim();
            toBeReturned += word;
			chars += word;
        }
		
		//make the uppercase
        if(this.upperCaseCharCount > 0 ){
            int passwordlength = toBeReturned.length();
            Set<Integer> processedIndex = new HashSet<Integer>();
            while(this.upperCaseCharCount > 0){
                int index = this.getRandom(passwordlength);
                if(processedIndex.contains(index)){
                    if(processedIndex.size() == passwordlength) break;
					continue;
                }
                processedIndex.add(index);
                char indexVal = toBeReturned.charAt(index);
                if(isAlpha(String.valueOf(indexVal)) && !Character.isUpperCase(indexVal)){
                    toBeReturned = toBeReturned.substring(0,index) + String.valueOf(indexVal).toUpperCase() + toBeReturned.substring(index+1);
                    this.upperCaseCharCount--;
                }
            }
        }

        //take the "special words set, pick one"
        if(this.getSpecialCharactersToBeUsed() != null && this.getSpecialCharactersToBeUsed().size() > 0){
            List<String> specialCharsToBeUsed = new ArrayList<>(this.getSpecialCharactersToBeUsed());
            String word = specialCharsToBeUsed.get(this.getRandom(specialCharsToBeUsed.size()));
            word = word.trim();
            while(toBeReturned.contains(word)){
                word = word.trim();
                word = specialCharsToBeUsed.get(this.getRandom(specialCharsToBeUsed.size()));
            }
            word = word.trim();
            toBeReturned += word;
			specialChars += word;
        }

        //take the "numbers has to be added"
        if(this.getNumbersHasToBeUsed() != null && this.getNumbersHasToBeUsed().size() > 0){
            Set<Integer> numbersToBeUsed = this.getNumbersHasToBeUsed();
            for(Integer num : numbersToBeUsed){
                toBeReturned += String.valueOf(num);
				nums += String.valueOf(num);
            }
        }
        
        //add the numbers has to be password from numbers count
        if(this.numbersCount > 0){
            Set<Integer> numbersToBeUsed = this.getNumbersHasToBeUsed();
            if(numbersToBeUsed != null && numbersToBeUsed.size() > 0){
                this.numbersCount -= numbersToBeUsed.size();
            }
            while(this.numbersCount > 0){
                int num = this.getRandom(10);
                while(toBeReturned.contains(String.valueOf(num))){
                    num = this.getRandom(10); 
                }
                toBeReturned += String.valueOf(num);
				nums += String.valueOf(num);
				this.numbersCount--;
            }
        }
       
		//shuffle the password chars in order to increase strength
		if(this.getRememberingStrength() != null){
			String level = this.getRememberingStrength();
			if( level == Level.HIGH.name()) {
				//shuffle all chars
				List<String> charArray = new ArrayList<>(Arrays.asList(toBeReturned.split("")));
				Collections.shuffle(charArray);
				toBeReturned = "";
				for(String c : charArray){
					toBeReturned += c;
				}
			} else if( level == Level.MEDIUM.name()) {
				//keep chars as it is and shuffle nums and special chars
				List<String> charArray = new ArrayList<>(Arrays.asList(nums.split("")));
				charArray.addAll(Arrays.asList(specialChars.split("")));
				charArray.add(chars);
				Collections.shuffle(charArray);
				toBeReturned = "";
				for(String c : charArray){
					toBeReturned += c;
				}
			} else if( level == Level.LOW.name()) {
				//do nothing, as we are appending in LOW fashion
			}
		}
        //return the string
        return toBeReturned;
    }

    ///*****************extra methods for supporting algorithm*****************//////////
    //get random number
    private int getRandom(int length) {
        int rnd = new Random().nextInt(length);
        return rnd;
    }

    public static boolean isAlpha(String s) {
        return p.matcher(s).find();
    }

    private void logPassword(String s){
        System.out.println("Password :: "+s);
    }
	
	private void logPassword(String chars, String specialChars, String nums){
        System.out.println("Chars : "+chars + "\nSpecial Chars : "+specialChars+"\nNumbers : "+nums);
    }

}