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
         * logical_step_1: It declares variables to store the length and volume of the cube. 
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: A variable sideLength is declared to represent the length of a side of the cube. The value of the variable sideLength is initialized to 3. The variable vol is declared to store the volume of the cube.
         * question_1: Why is variable sideLength declared?
         * answer_1: A variable sideLength is declared to represent the length of a side of the cube. 
         * question_2: What value is the variable sideLength initialized to?
         * answer_2: The value of the variable sideLength is initialized to 3.
         * question_3: Why is variable vol declared?
         * answer_3: The variable vol is declared to store the volume of the cube.
         */
        int sideLength = 3;
        int vol;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: It calls a method vol and prints the returned value. 
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: To calculate the volume of the cube, the program calls a method vol with parameter sideLength which is 3.  The method vol returns the value of 27 which is assigned to the variable vol. Therefore, the program prints 27.
         * question_1: What does the program do to calculate the volume of the cube?
         * answer_1: To calculate the volume of the cube, the program calls a method vol with parameter sideLength which is 3.
         * question_2: What value does method vol return?
         * answer_2: The method vol returns the value 27.
         * question_3: What does the program print?
         * answer_3: The program prints 27.
         */
        vol = Cube.vol(sideLength);
        System.out.println(vol);

    }

    /**
     * domain_model_question: What is the goal of the following block of code?
     * logical_step_3: It defines a method vol to calculate the volume of a cube.
     * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
     * logical_step_details: A method vol is defined to compute and return the volume of a cube. The parameter x of method vol represents the side of the cube. The volume is computed by multiplying the x, side of a cube, itself for 3 times.
     * question_1: Why is method vol defined?
     * answer_1: A method vol is defined to compute and return the volume of a cube.
     * question_2: What does the parameter x of method vol represent?
     * answer_2: The parameter x of method vol represents the side of the cube.
     * question_3: How is a volume of cube computed?
     * answer_3: The volume is computed multiplying the x, side of a cube, itself for 3 times.
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
