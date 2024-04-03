class B3DivisorCount extends ConsoleProgram {

    /**
    * Description
    * Write a program DivisorCount that lets you enter an integer and that prints all the divisors of that number. 
    * Note that d is a divisor of n if n%d=0
    * @author:
    */
    
    public void run() {
      int intNum;

      intNum = readInt("Pick an integer to find the divisors: ");

      for (int counter = 1; counter <= intNum; counter++){
        boolean blnIsDivisor = intNum % counter == 0;

        if (blnIsDivisor == true){
            System.out.println(counter + " Is a Divisor");
        }
      }
      
    }
  }
  