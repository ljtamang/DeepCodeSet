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
     * logical_step_1: Declare variables to represent a point and method to access them.
     * logical_step_details: Variables x and y of integer type are declared to represent the coordinates of a point. The getter methods get the coordinates of a point. The setter method sets the coordinates of points.
     * question_1: What does the following block of code do?
     * answer_1: Declare variables to represent a point and method to access them.
     * question_2: What is the data type of variable x and y?
     * answer_2: Variables x and y are of integer type.
     * question_3: What does a getter method do?
     * answer_3:  The getter methods get the coordinates of a point.
     * question_4: What does a setter method do?
     * answer_4:  The setter method sets the coordinates of points.
     */
    private int x;
    private int y;
    public void setX(int newX) { this.x = newX; }
    public int getX() { return x; }
    public void setY(int newY) { this.y = newY; }
    public int getY() { return y; }

    /**
     * logical_step_2: Define a method to translate the point.
     * logical_step_details: A method translate is defined to shift x and y coordinates of a point.  It takes dx and dy as a parameter.
     * question_1: What does the following code block do?
     * answer_1:  Define a method to translate the point.
     * question_2: Why is method translate defined?
     * answer_2: A method translate is defined to shift x and y coordinates of a point.
     *  question_2: It takes dx and dy as a parameter.
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public static void main(String[] args) {
        
        /**
         * logical_step_3: Creates an object to represent a point.
         * logical_step_details:  To represent a point, an object of class Point is initialized. The values x and y are set to 7 and 2 respectively.
         * question_1: What does the following code block do?
         * answer_1: Creates an object to represent a point.
         * question_2: What do we do to represent a point?
         * answer_2: To represent a point, an object of class Point is initialized.
         * question_3: What is the value of x and y?
         * question_3: The value x is 7 and y is 2.
         */
        Point point = new Point();
        /**
		 * stm_comment: Calls a setter method to set the value of x.
         * question_1: What does the following statment do?
         * answer_1: Calls a setter method to set the value of x.
         */
        point.setX(7);
        point.setY(2);

        /**
         * logical_step_4: Call a translate method and print new coordinates.
         * logical_step_details: Call the method translate which shifts x by 11 and y by 6. After calling the translate method, the value of x and y is 18 and 8 respectively.
         * question_1: What does the following code block do?
         * answer_1: Call a translate method and print new coordinates.
         * question_2: What does the method translate do?
         * answer_2: The method translate shifts x by 11 and y by 6.
         * question_2: What is the value of x and y coordinates after calling the translate method?
         * answer_2:  After calling the translate method, the value of x and y  is 18 and 8 respectively.
         */
        /**
         * stm_comment: call the method translate of the point object.
         * question_1: What does the following statment do?
         * answer_1: call the method translate of the point object.
         */
        point.translate(11, 6);
        System.out.println("New coordinates is (" + point.getX() + ", " + point.getY() + ")");

    }
}
