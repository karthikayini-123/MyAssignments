
/*//Home Assignment <1>: Demonstrating Inheritance in Java
 * ===========================================================

WebElement.java
Button.java
CheckBoxButton.java
RadioButton.java
ElementsExecution.java  for Execution

Assignment Details: 
	Create classes for WebElement, Button, TextField, CustomButton, and RadioButton to demonstrate various types of inheritance. 
	
Assignment Requirements: 
	Base Class: WebElement - Create a base class named WebElement with common methods such as click() and setText(String text). 
	Subclasses: Button and TextField - Implement two subclasses, Button and TextField, both inheriting from the WebElement base class. -
	In the Button subclass, include a submit() method. -
	In the TextField subclass, include a getText() method.
	Additional Subclass: CheckBoxButton - Develop a new class named CheckBoxButton that inherits from the Button subclass. - 
	In the CheckBoxButton class, introduce a method named clickCheckButton(). 
	Another Subclass: RadioButton - Create another subclass named RadioButton, also inheriting from the Button subclass. -
	In the RadioButton class, add a method called selectRadioButton().
	Execution Class: Elements - Create execution class named , also inheriting from the Button subclass.
*/

package Week3.day1;

public class ElementsExecution extends Button {

	public static void main(String[] args) {
		
		ElementsExecution elementobj = new ElementsExecution();
		elementobj.submit();
		elementobj.click();
		elementobj.setText("Message Received");
	}

}
