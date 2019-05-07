  class BasicsDemo {
    
    static void print() {
      System.out.println("\n\nInside print ...");
      System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
      System.out.println();                 // Print empty line
      System.out.print("Hello, world!!");   // Cursor stayed after the printed string
      System.out.println("Hello,");
      System.out.print(" ");                // Print a space
      System.out.print("world!!");
    }
	
	static void primitives() {
	  System.out.println("\n\nInside primitives ..."); 
	  // literals demo
	  int intHex = 0x0041;
	  System.out.println("intHex: " + intHex);
	  int intBinary = 0b01000001;
	  System.out.println("intBinary: " + intBinary);
	  int intChar = 'A'; // holds decimal equivalent, which is 65
	  System.out.println("intChar: " + intChar);
	  int intUnderscore = 1_23_456;
	  System.out.println("intUnderscore: " + intUnderscore);
	  
	  char charA = 'A';
	  System.out.println("charA: " + charA);
	  char charInt = 65;
	  System.out.println("charInt: " + charInt);
	  char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
	  System.out.println("charUnicode1: " + charUnicode1);
	  char charUnicode2 = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
	  System.out.println("charUnicode2: " + charUnicode2);
	  char charBinary = 0b01000001; // binary corresponding to decimal 65
	  System.out.println("charBinary: " + charBinary);	  		  	  
    }
  
    public static void main(String[] args) {	
	  // Language Basics 1
	  //print();				
	  primitives();	  
    }       
  }