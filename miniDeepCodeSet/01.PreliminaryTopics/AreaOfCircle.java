/**
 * author: Lasang Tamang
 * topic: Preliminary Topics
 * subtopic: Variables, Expressions, Constants, Primitive Data Types
 * goalDescription: Calculate the area of a circle.
 * source: NA
 * input: N/A
 * output: The area for the circle of radius 5.80 is 105.68 
 */
public class AreaOfCircle {
    public static void main(String[] args) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_1: Declares variables to store the value of PI, radius, and area of a circle.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: A variable PI of double type is declared to hold the value of a mathematical constant PI. The variable radius of double type is declared to store the value of the radius of a circle. The variable area of double type is declared to store the area of a circle.
         * question_1: Why is variable PI declared?
         * answer_1: A variable PI of double type is declared to hold the value of a mathematical constant PI.
         * question_2: What does the variable radius store?
         * answer_2: The variable radius stores the value of the radius of a circle.
         * question_3: Why is a variable area declared?
         * answer_3: The variable area of double type is declared to store the area of a circle.
         */
        /**
         * stm_comment: The keyword final is used for declaring a constant variable that always stores the same value.
         * question_1: What is the keyword final used for?
         * answer_1: The keyword final is used for declaring a constant variable that always stores the same value.
         */
        final double PI = 3.14159;
        double radius = 5.8;
        double area;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: Calculates the area of the circle and prints the value.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: The given expression area = radius *radius*PI calculates the area of the circle. The calculated value of the area is 105.68. Therefore, the program prints the value of the radius and area of the circle.
         * question_1: What does expression area = radius * radius * PI do?
         * answer_1: The expression area = radius * radius * PI calculates the area of the circle.
         * question_2: What is the calculated value of the area?
         * answer_2: The calculated value of the area is 105.68.
         */
        area = radius * radius * PI;
        System.out.printf("The area for the circle of radius %.2f is %.2f ", radius, area);

    }
}
