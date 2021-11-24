/**
 * author: Lasang Tamang, refined by Dr Vasile Rus
 * topic: Methods
 * subtopic: Define method, calling method
 * goalDescription: Calculate the volume of the cube.
 * source: N/A
 * input: N/A
 * output: 27
 */
public class Cube {

    /**
     * domain_model_question: What is the goal of the following block of code?
     * logical_step_1: It defines a method vol that calculates the volume of a cube whose size is passed as an input parameter.
     * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
     * logical_step_details: A static method vol is defined to compute and return the volume of a cube whose size is passed as an input parameter. The method vol is defined as static such that it belongs to the class which means it can be called without instantiating a specific instance or object of the class. The parameter x of the method vol represents the side of the cube. The volume is computed using the mathematical formula which indicates to multiply the side of the cube, which is x, 3 times.
     * question_1: Why is the method vol defined?
     * answer_1: A static method vol is defined to compute and return the volume of a cube whose size is passed as an input parameter.
     * question_2: Why is the method vol defined as static?
     * answer_2: The method vol is defined as static such that it belongs to the class which means it can be called without instantiating a specific instance or object of the class.
     * question_3: What does the input parameter x of the vol method represent?
     * answer_3: The parameter x of vol method represents the side of the cube.
     * question_4: How is the volume of the cube computed?
     * answer_4: The volume is computed using the mathematical formula which indicates to multiply the side of the cube, which is x, 3 times.
     */
    /**
     * stm_comment: The keyword static means there is no need for a class object to call the method.	
     * question_1: What does keyword static mean for this method?
     * answer_1: The keyword static means there is no need for a class object to call the method.	
     */
    static int vol(int x) {
        return x * x * x;
    }

    public static void main(String args[]) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: It declares variables to store the length and volume of a cube. 
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: A variable sideLength is declared to represent the length of a side of a cube. The value of the variable sideLength is initialized to 3. The variable vol is declared to store the volume of the cube.
         * question_1: Why is variable sideLength declared?
         * answer_1: A variable sideLength is declared to represent the length of a side of a cube.
         * question_2: What value is the variable sideLength initialized to?
         * answer_2: The value of the variable sideLength is initialized to 3.
         * question_3: Why is variable vol declared?
         * answer_3: The variable vol is declared to store the volume of the cube.
         */
        int sideLength = 3;
        int vol;

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_3: It calls a method vol and prints the returned value. 
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: To calculate the volume of the cube, the program calls a method vol with parameter sideLength whose value is 3. The method vol returns the value of 27 which is assigned to the variable vol. Therefore, the program prints the volume of the cube which is 27.
         * question_1: What does the program do to calculate the volume of the cube?
         * answer_1: To calculate the volume of the cube, the program calls a method vol with parameter sideLength whose value is 3.
         * question_2: What value does method vol return?
         * answer_2: The method vol returns the value 27.
         * question_3: What does the program print?
         * answer_3: The program prints the volume of the cube which is 27.
         */
        vol = Cube.vol(sideLength);
        System.out.println(vol);

    }
}
