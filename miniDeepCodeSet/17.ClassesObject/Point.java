/**
 * author: Lasang Tamang
 * topics: Classes and Objects
 * subtopics: Object intilazation, getter and setter method, accessing methods
 * goalDescription: A program to translate a point.
 * source: http://pawscomp2.sis.pitt.edu/pcex/pcex_v2/index.html?lang=JAVA&set=objects.classes.point&v=201803162257
 * input: N/A
 * output: New coordinates is (18, 8)
 */
public class Point {

    /**
     * domain_model_question: What is the goal of the following block of code?
     * logical_step_1: Declare variables to represent a point and method to access them.
     * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
     * logical_step_details: Variables x and y of integer type are declared to represent the coordinates of a point. The getter methods get the coordinates of the point. The setter method sets the coordinates of the point.
     * question_1: What is the data type of variable x and y?
     * answer_1: Variables x and y are of integer type.
     * question_2: What does a getter method do?
     * answer_2: The getter methods get the coordinates of the point.
     * question_3: What does a setter method do?
     * answer_3: The setter method sets the coordinates of the point.
     */
    private int x;
    private int y;
    public void setX(int newX) { this.x = newX; }
    public int getX() { return x; }
    public void setY(int newY) { this.y = newY; }
    public int getY() { return y; }

    public static void main(String[] args) {

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_2: Creates an object to represent a point.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details:  To represent a point, an object of class Point is initialized. The value of the x coordinate is initialized to 7. The value of the y coordinate is initialized to 2.
         * question_1: What do we do to represent a point?
         * answer_1: To represent a point, an object of class Point is initialized.
         * question_2: What value is x coordinate initialized to?
         * answer_2: The value of x coordinate is initialized to 7. 
         * question_3:  What value is y coordinate initialized to?
         * answer_3: The value of the y coordinate is initialized to 2.
         */
        Point point = new Point();
        point.setX(7);
        point.setY(2);

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_3: Call a translate method and print new coordinates.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: Method translate is invoked. After calling the translate method, the value of x and y is 18 and 8 respectively.
         * question_1: What method is invoked?
         * answer_1: Method translate is invoked.
         * question_2: What is the value of x and y coordinates after calling the translate method?
         * answer_2: After calling the translate method, the value of x and y  is 18 and 8 respectively.
         */
        /**
         * stm_comment: The values 11 and 6 are passed as a parameter to method translate?
         * question_1: What values are passed as a parameter to method translate?
         * answer_1: The values 11 and 6 are passed as a parameter to method translate?
         */
        point.translate(11, 6);
        System.out.println("New coordinates is (" + point.getX() + ", " + point.getY() + ")");

    }

    /**
     * domain_model_question: What is the goal of the following block of code?
     * logical_step_4: Define a method to translate the point.
     * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
     * logical_step_details: A method translate shifts x and y coordinates of a point. It takes dx and dy as a parameter.
     * question_1: What does method translate do?
     * answer_1: A method translate shifts x and y coordinates of a point.
     * question_2: What does method translate take as a parameter?
     * answer_2: It takes dx and dy as a parameter.
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

}
