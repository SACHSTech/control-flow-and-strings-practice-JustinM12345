class C4IsSandwich extends ConsoleProgram {

    /**
    * Description
    * A sandwich is two pieces of bread with something in between. 
    * Return the string that is between the first and last appearance of "bread" in the given string, 
    * or output the empty string "" if there are not two pieces of bread.
    * @author: Justin M.
    */
    
    public void run() {
      String strWord;
      
      strWord = readLine("Enter a sandwich word:");

      int intIndexBread1 = strWord.indexOf("bread") + 5;
      int intIndexBread2 = strWord.lastIndexOf("bread");
      
      for (int counter = intIndexBread1; counter < intIndexBread2; counter++){
        System.out.print(strWord.charAt(counter));
    }
  }
}
  