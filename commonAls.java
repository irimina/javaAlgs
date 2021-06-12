// Standard Array/ ArrayList Algorithms for AP CS A
//shared@jdoodle.com/a/1Z50

public class Main {

  // short review exercises using arrays
  public static void main(String[] args) {
    // Array of integers
    int[] arrayOfInts = new int[10];
    for (int i = 0; i < arrayOfInts.length; i++) {
      arrayOfInts[i] = (int) (Math.random() * 101);
    } // will throw 0 - 100

    // Array of Strings
    String[] arrayOfDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    // Array of integers
    int[] arrayWithPairs = { 9, 62, 78, 78, 76, 60, 24, 84, 1, 1 };

    // ---------------------------------------------------------------
    // OUTPUT STATEMENTS BEGIN HERE

    System.out.println("The arrayOfInts contains: ");
    for (int i = 0; i < arrayOfInts.length; i++) {
      System.out.print(arrayOfInts[i] + " ");
    }

    // System.out.println();
    // System.out.println("The number at position [9]: " + arrayOfInts[9] + " ");
    // System.out.println("The sum of the arrayOfInts is: " +
    // computeSum(arrayOfInts));
    // System.out.println("The average of the arrayOfInts is: " +
    // computeAvg(arrayOfInts));
    // System.out.println("The average of the arrayOfInts is: " +
    // (computeSum(arrayOfInts))/arrayOfInts.length); // not via method
    // System.out.println("The mode of the arrayOfInts is: " +
    // findMode(arrayOfInts));
    // System.out.println("Do all of the strings in arrayOfDays end in 'y': " +
    // determineEndsInY(arrayOfDays));
    // System.out.println("The count of consecutive pairs of elements in
    // arrayWithPairs = " + numOfPairs(arrayWithPairs));

    // System.out.println("\nReverse order arrayOfInts is: ");
    // int[] reverse = reverseOrder(arrayOfInts);
    // for (int i = 0; i < reverse.length; i++)
    // {
    // System.out.print(reverse[i] + " ");
    // }
    // System.out.println();
    // output statements end here
  }// end of main here
   // -----------------------------------------------------------------------------------------------------------------
   // Methods of Algorithms with Arrays begin here
   // -----------------------------------------------------------------------------------------------------------------

  // METHOD TO COMPUTE SUM OF ALL INTEGERS IN THE ARRAY
  static int computeSum(int[] arrayOfInts) {
    int sum = 0; // initialize sum
    int i;
    // Iterate through all elements and add them to sum
    for (i = 0; i < arrayOfInts.length; i++) {
      sum += arrayOfInts[i];
    }
    return sum;
  }

  // METHOD TO COMPUTE AVERAGE OF ALL INTEGERS IN THE ARRAY
  static int computeAvg(int[] arrayOfInts) {
    int sum = 0; // initialize sum
    int len = arrayOfInts.length;
    int i;
    // Iterate through all elements and add them to sum
    for (i = 0; i < arrayOfInts.length; i++) {
      sum += arrayOfInts[i];
    }
    return sum / len;
  }

  // METHOD TO FIND MODE, IF PRESENT, IN THE ARRAY
  // MODE IS MOST FREQUENTLY OCCURING INTEGER
  public static int findMode(int[] arrayOfInts) {
    int start = 0, modeCount = 0;

    for (int i = 0; i < arrayOfInts.length; i++) {
      int count = 0;
      for (int j = 0; j < arrayOfInts.length; j++) {
        if (arrayOfInts[j] == arrayOfInts[i])
          count++;
      }
      if (count > modeCount) {
        modeCount = count;
        start = arrayOfInts[i];
      }
    }
    return start;
  }

  // A METHOD TO DETERMINE IF ALL ELEMENTS HAVE A PARTICULAR PROPERTY
  // DO ALL STRINGS END IN 'Y'
  public static boolean determineEndsInY(String[] arrayOfDays) {
    boolean endsInY = true;

    for (int i = 0; i < arrayOfDays.length; i++) {
      endsInY = arrayOfDays[i].charAt(arrayOfDays[i].length() - 1) == 'y'; // charAt evaluating 'y'
    }
    return endsInY;
  }

  // METHOD TO FIND CONSECUTIVE PAIRS
  public static int numOfPairs(int[] arrayWithPairs) {
    int countPairs = 0;
    for (int i = 1; i < arrayWithPairs.length; i++) // control starts with 1
    {
      if (arrayWithPairs[i - 1] == arrayWithPairs[i]) // notice access -- prohibits OutOfBounds
        countPairs++;
    }
    return countPairs;
  }

  // METHOD TO DETERMINE PRESENCE || ABSENCE OF DUPLICATE ELEMENTS
  // note: if array were sorted ascending first, would not need nested loop
  public static boolean containsDuplicates(int[] arrayWithPairs) {
    for (int i = 0; i < arrayWithPairs.length; i++) {
      for (int j = 0; j < arrayWithPairs.length; j++) {
        if (arrayWithPairs[i] == (arrayWithPairs[j]))
          return true;
      }
    }
    return false;
  }

  // METHOD TO REVERSE THE ORDER OF ELEMENTS
  // SWAPS IN PLACE FROM ENDS TOWARD MID
  public static int[] reverseOrder(int[] arrayOfInts) {
    int[] temp = new int[arrayOfInts.length];
    for (int i = 1; i <= arrayOfInts.length; i++) {
      temp[i - 1] = arrayOfInts[arrayOfInts.length - i];
    }
    return temp;
  }

  // METHOD WHERE YOU CREATE AN EMPTY LIST AND ADD ELEMENTS (FROM AN ARRAY) THAT
  // MEET A CERTAIN CONDITION

  // create my empty list named getDelimiters
  public ArrayList<String> getDelimitersList(String[] tokens)

  {
    ArrayList<String> d = new ArrayList<String>();

    // run the loop to go through the entire array
    for (int i = 0; i < tokens.length; i++) {
      // if I find a delimter
      if (tokens[i].equals(openDel) || tokens[i].equals(closeDel)) {
        // I add it to my empty list
        d.add(tokens[i]);
      }
    }

  } // end

} // end of Main class
