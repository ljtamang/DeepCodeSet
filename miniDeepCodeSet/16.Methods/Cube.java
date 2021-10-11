/**
 * author: Lasang Tamang
 * topic: Methods
 * subtopic: Define method, calling method
 * goalDescription: Calculate the volume of the cube.
 * source: N/A
 * input: N/A
 * output: 27
 */
public class Cube {
    public static void main(String args[]) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_1: Declare variables to store the length and volume of the cube. 
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: A variable sideLength of integer type is declared to represent the length of a side of the cube. The value of the variable sideLength is initialized to 3. The variable vol is declared to store the volume of the cube.
         * question_1: What is the type of variable sideLength?
         * answer_1: The variable sideLength is of integer type. 
         * question_2: What value is the variable sideLength initialized to?
         * answer_2: The value of the variable sideLength is initialized to 3.
         * question_3: Why is variable vol declared?
         * answer_3: The variable vol is declared to store the volume of the cube.
         */
        int sideLength = 3;
        int vol;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_1: Computes the volume of cube and prints the value.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: To calculate the volume of the cube, the program calls a method vol. The method vol returns the value 27. Therefore, the program prints 27.
         * question_1: What does the program do to calculate the volume of the cube?
         * answer_1: To calculate the volume of the cube, the program calls a method vol.
         * question_2: What value does method vol return?
         * answer_2: The method vol returns the value 27.
         * question_3: What does the program print?
         * answer_3: The program prints 27.
         */
        /**
         * stm_comment: The value 3 is passed as a parameter value to the method cube. 
         * question_1: What value is passed as a parameter value to method cube?
         * answer_1: The value 3 is passed as a parameter value to the method cube. 
         */
        vol = Cube.vol(sideLength);
        System.out.println(vol);

    }

    /**
     * domain_model_question: What is the goal of the following block of code?
     * logical_step_3: Defines a method vol to calculate the volume of a cube.
     * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
     * logical_step_details: A static method vol with int x as parameter is defined. The method vol computes and returns the volume of a cube.
     * question_1: What is defined?
     * answer_1: A static method vol with int x as parameter is defined.
     * question_2: What does the method vol do?
     * answer_2: The method vol computes and returns the volume of a cube.
     */
    /**
     * stm_comment: The keyword static means it doesn't require a class object to call the method.	
     * question_1: What does keyword static mean?
     * answer_1: The keyword static means it doesn't require a class object to call the method.	
     */
    static int vol(int x) {
        return x * x * x;
    }

}
