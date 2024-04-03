class A1FreezingHot extends ConsoleProgram {

    /**
    * Description
    * Given two temperatures via user input, output true if one is less than 0 and the other is greater than 100.
    * @author: Justin M.
    */
    
    public void run() {
      int intTemp1;
      int intTemp2;

      intTemp1 = readInt("Enter Temperature 1: ");
      intTemp2 = readInt("Enter Temperature 2: ");

      boolean blnIsTemp1Hot = intTemp1 > 100;
      boolean blnIsTemp2Hot = intTemp2 > 100;

      boolean blnIsTemp1Cold = intTemp1 < 0;
      boolean blnIsTemp2Cold = intTemp2 < 0;

      boolean blnIsTrue = ((blnIsTemp1Hot == true || blnIsTemp2Hot == true) && (blnIsTemp1Cold == true || blnIsTemp2Cold == true));

      System.out.println(blnIsTrue);
    }
  }
  
