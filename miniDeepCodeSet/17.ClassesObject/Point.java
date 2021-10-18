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
     * logical_step_1: It declares variables to represent a point in a 2-dimensional space and methods to access them.
     * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
     * logical_step_details: Variables x and y represent the coordinates of a point in a 2-dimensional space. The getter methods get the coordinates of the point. The setter method sets the coordinates of the point.
     * question_1: What do variables x and y represent?
     * answer_1: Variables x and y represent the coordinates of a point in a 2-dimensional space.
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
         * logical_step_2: It creates an object to represent a point.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: To represent a point, an object of class Point is initialized. The value of the x coordinate is initialized to 7. The value of the y coordinate is initialized to 2.
         * question_1: What do we do to represent a point?
         * answer_1: To represent a point, an object of class Point is initialized.
         * question_2: What value is x coordinate initialized to?
         * answer_2: The value of x coordinate is initialized to 7. 
         * question_3: What value is y coordinate initialized to?
         * answer_3: The value of the y coordinate is initialized to 2.
         */
        Point point = new Point();
        point.setX(7);
        point.setY(2);

        /**
         * domain_model_question: What is the goal of the following block of code?
         * logical_step_3: It translates a point and prints a new coordinate for a given Point object.
         * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
         * logical_step_details: A method translate is called to shift a point in a 2-dimensional space. After calling the translate method, the value of x and y is 18 and 8 respectively.
         * question_1: Why is method translate called?
         * answer_1: A method translate is called to shift a point in a 2-dimensional space.
         * question_2: What is the value of x and y coordinates after calling the translate method?
         * answer_2: After calling the translate method, the value of x and y  is 18 and 8 respectively.
         */
        /**
         * stm_comment: The parameter values 11 and 6 represent desired offsets along the x and y coordinates.
         * question_1: What does parameter 11 and 6 represent?
         * answer_1:  The parameter values 11 and 6 represent desired offsets along the x and y coordinates.
         */
        point.translate(11, 6);
        System.out.println("New coordinates is (" + point.getX() + ", " + point.getY() + ")");

    }

    /**
     * domain_model_question: What is the goal of the following block of code?
     * logical_step_4: It defines a method to translate the point.
     * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
     * logical_step_details: A method translate is defined with input parameters dx and dy to shift the x and y coordinates of a point. To translate a point, the method adds offset values dx and dy to x and y respectively. 
     * question_1: How is a method translate defined?
     * answer_1: A method translate is defined with input parameters dx and dy to shift the x and y coordinates of a point.
     * question_2: What is done to translate a point?
     * answer_2: To translate a point, the method adds offset value dx and dy to x and y respectively.
     /**
     * stm_comment: The input parameter dx and dy indicates the offset along the x and y coordinates, respectively.
     * question_1: What do the input parameters dx and dy represent?
     * answer_1: The input parameter dx and dy indicates the offset along the x and y coordinates, respectively.
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

}
