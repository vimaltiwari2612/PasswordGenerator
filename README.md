# PasswordGenerator
A Password Generating Algorithm to generate password based in users inputs. 


# Algorithm

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
     
# download the Andorid App
[Password Genenator](https://github.com/vimaltiwari2612/JustWallpapers/blob/master/Just%20Wallpapers.apk?raw=true)


# screenshots
![screenshot](https://github.com/vimaltiwari2612/PasswordGenerator/blob/master/screenshots/1.PNG)


Have fun!!

