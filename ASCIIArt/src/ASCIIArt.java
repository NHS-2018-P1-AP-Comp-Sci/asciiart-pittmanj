/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)
public class ASCIIArt {
	public static void main(String[] args) {
		
		lCharacter ();
		spaceCharacter ();
		oCharacter ();
		spaceCharacter ();
		gCharacter ();
		spaceCharacter ();
		iCharacter() ;
		spaceCharacter ();
		cCharacter();
		spaceCharacter ();
		myStatement();
	}
	public static void lCharacter () {
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|________");	
		// this will print a L
	}
	
	public static void oCharacter () {
		System.out.println("__________");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("|________|");
		// this will print a O
	}
	public static void spaceCharacter () {
		System.out.println("");
	}
	public static void gCharacter () {
		System.out.println("+________+");
		System.out.println("|        ");
		System.out.println("|        ");
		System.out.println("|     ___");
		System.out.println("|    /   \\");
		System.out.println("|        |");
		System.out.println("+________|");
		// this will print a G and has one of the 2 special string characters
	}
	public static void iCharacter () {
		System.out.println("      **    ");
		System.out.println("            ");
		System.out.println("      ||    ");
		System.out.println("      ||     ");
		System.out.println("      ||     ");
		System.out.println("      ||     ");
		System.out.println("      ||    ");
		System.out.println("      ||    ");
		//this will print a I
	}
	public static void cCharacter () {
		System.out.println("+__________  ");
		System.out.println("|             ");
		System.out.println("|            ");
		System.out.println("|            ");
		System.out.println("|            ");
		System.out.println("|          ");
		System.out.println("+__________  ");
		// this will print a C
	}
	public static void myStatement () {
		System.out.print(" \" this is the name of my favorite rapper\" ");
	// this is the other special string character
	}
}
