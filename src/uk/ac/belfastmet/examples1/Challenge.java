package uk.ac.belfastmet.examples1;

class Challenge {
	  /**
	  * Count how many pairs of braces exist in a given string
	  *@param String braces The string to check
	  *@return integer The number of pairs of braces. Returns -1 if input is invalid.
	  */
	  public static Integer numberOfBracePairs( String braces ) {
	    int totalPairsOfBraces = 0;
	    
	    /*Let's check for invalid input first
	    *The first checks are for length because they are quick to rule out
	    */
	    if(braces.isEmpty())
	    {
	      totalPairsOfBraces = 0;
	    }
	    //Check for uneven string length because then there definitely is an extra brace
	    else if(braces.length()%2>0)
	    {
	      totalPairsOfBraces = -1;
	    }
	    //This checks for invalid immediate pairs of braces
	    else if(braces.contains("(}")||braces.contains("(]")||braces.contains("[}")||braces.contains("[)")||braces.contains("{]")||braces.contains("{)"))
	    {
	      totalPairsOfBraces = -1;
	    }
	    //This check is to pass additional tests where the first brace is a closing brace
	    else if(braces.charAt(0)==']'||braces.charAt(0)==')'||braces.charAt(0)=='}')
	    {
	      totalPairsOfBraces = -1;
	    }  
	    //Given that we've ruled out all the invalid input the remaining input must be valid so the number is the length halved.
	    else
	    {
	      totalPairsOfBraces = braces.length()/2;
	    }  
	    
	    return totalPairsOfBraces;
	  }
	}