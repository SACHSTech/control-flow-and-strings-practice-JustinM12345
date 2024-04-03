class C2EveryNth extends ConsoleProgram {

    /**
    * Description
    * Given a non-empty string and an int N, 
    * return the string made starting with character 0, and then every Nth char of the string. 
    * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
    * @author: Justin M.
    */
    
    public void run() {
        String strWord;
        int intN;

        strWord = readLine("Enter a word: ");
        intN = readInt("Enter int N: ");
      
        for (int counter = 0; counter <= strWord.length(); counter = counter +intN){
            System.out.print(strWord.charAt(counter));
        }
    }
  }
  