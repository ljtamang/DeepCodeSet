/*
topic: Preliminary Topics
subtopic: Variables, Expressions, Constants, Primitive Data Types
goalDescription: Calcluate area of a circle.
source: NA
input: N/A
output: The area for the circle of radius 5.80 is 105.68 
*/
public class AreaOfCircle {
  public static void main(String[] args) {
   
    /**
    * logical_step_1: Declares variables to store the value of PI and radius of a circle.
    * logical_step_details: A variable PI of double type is declared to represent a mathematical constant PI. Also, the variable radius of double type is declared to represent the radius of a circle.
    * question_1: What does the following block of code do??
    * answer_1: Declares variables to store the value of PI and radius of a circle.
    * question_2: Why is variable PI declared?
    * answer_2: A variable PI of double type is declared to represent a mathematical constant PI.
    * question_3: What does the variable radius represent?
    * answer_3: The variable radius represents the radius of a circle.
    */
    /**
    * stm_comment: The keyword final is used for declaring a constant variable that always stores the same value.
    * question_1:  What is the keyword final used for?
    * answer_1: The keyword final is used for declaring a constant variable that always stores the same value.
    * */
    final double PI = 3.14159; 
    double radius = 5.8; 
    
    /**
    * logical_step_2: Calculates the area of the circle and prints the value.
    * logical_step_details: The given expression area = radius *radius*PI is used to compute the area of the circle. A variable area of double type is declared to store the calculated area of the circle. Therefore, the calculated value of the area is 105.68. Finally, the program prints the value of the radius and area of the circle.
    * question_1: What does the following block of code do?
    * answer_1: Calculates the area of the circle and prints the value.
    * question_2: What does expression area = radius * radius * PI do?
    * answer_2: The expression area = radius * radius * PI calulates area of circle.
    * question_3: What is the calculated value of the area?
    * answer_3: Therefore, the calculated value of the area is 105.68.
    */
     /**
    * stm_comment: The keyword double indicates that the variable is of double type.
    * question_1:  What is the keyword double indicate?
    * answer_1: The keyword double indicates that the variable is of double type.
    * */
    double area = radius * radius * PI;
    System.out.printf("The area for the circle of radius %.2f is %.2f ", radius, area);
    
  }
}
