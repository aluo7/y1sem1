//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title: P05 Fish Tank 3000
// Course: CS 300 Fall 2021
//
// Author: Alan Luo
// Email: aluo7@wisc.edu
// Lecturer: Mouna Kacem
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name: Isha Rustagi
// Partner Email: irustagi@wisc.edu
// Partner Lecturer's Name: Hobbes LeGault
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// X Write-up states that pair programming is allowed for this assignment.
// X We have both read and understand the course Pair Programming Policy.
// X We have registered our team prior to the team registration deadline.
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// Persons: none
// Online Sources: none
//
///////////////////////////////////////////////////////////////////////////////

/*
 * extends Button, AddOrangeFishButton is of type Button
 */
public class AddOrangeFishButton extends Button {
	/*
	 * constructor for AddOrangeFishButton, creates new Button
	 * @param x type float represents the x location of the button, y type float represents 
	 * the y location of the button
	 */
	public AddOrangeFishButton(float x, float y) {
		// calls the constructor for button with label "Add Orange" at location (x, y)
		super("Add Orange", x, y);
	}
	
	@Override
	/*
	 * overrides mousePressed from class Fish
	 * if the mouse is over the button, adds an orange fish to arrayList objects
	 */
	public void mousePressed() {
		if(isMouseOver()) {
			tank.addObject(new Fish());
		}
	}
}
