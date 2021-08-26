    /**
     * author: Hasan Mashrique
     * topic: Methods
     * subtopic: creating class objects, storing results in a variable, printing variable.
     * goalDescription: Calculate the volume of the cube.
     * source:
     * *input : N/A
     * output: 27
     */
    public class Cube {

        /**
         * logical_step_1:  Declares a method vol to calculate the volume of a cube.
         * logical_step_details: A static method vol with int x as parameter is defined. The method vol computes and returns the volume of a cube.
         * question_1: What does the following code block do?
         * answer_1: Declares a method cube to calculate the volume of a cube.
         * question_2: What is defined?
         * answer_2: A static method vol with int x as parameter is defined.
         * question_3: What does the method vol do?
         * answer_3: The method vol computes and returns the volume of a cube.
         */
        /**
         * stm_comment: The keyword static means it doesn't require a class object to call the method.	
         * question_1: What does keyword static mean?
         * answer_1: The keyword static means it doesn't require a class object to call the method.	
         */
        static int vol(int x) {
            return x * x * x;
        }

        public static void main(String args[]) {

            /**
             * logical_step_2: Call a method vol and print the returned value. 
             * logical_step_details: Call the method vol of class Cube. The returned value of the method vol is assigned to a variable result. Finally, the value of the result is printed which is 27.
             * question_1: What does the following code block do?
             * answer_1: Call a method vol and print the returned value. 
             * question_2: What is called?
             * answer_2: Method vol of class Cube is called.
             * question_3: What is assigned to a variable result?
             *  answer_3: The returned value of the method vol is assigned to a variable result.
             * answer_2: what value is printed?
             * question_3: The value 27 is printed
             */
            /**
             stm_comment: The value 3 is passed as a parameter value to the method cube. 
             * question_1: What value is passed as a parameter value to method cube?
             * answer_1: The value 3 is passed as a parameter value to method cube. 
             */
            int result = Cube.vol(3);
            System.out.println(result);

        }
    }
