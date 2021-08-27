/**
 * author: Lasang Tamang
 * topics: Classes and Objects
 * subtopics: Object intilazation, getter ans setter method, accessing methods
 * goalDescription: A program to translate a point.
 * source: http://pawscomp2.sis.pitt.edu/pcex/pcex_v2/index.html?lang=JAVA&set=objects.classes.point&v=201803162257
 * output: The new coordinates: (18, 8)
 */
public class Point {
    
    /**
    * logical_step_1: Declare variables to reperesnet a point and method to access them.
    * logical_step_details: Variables x and y of integer type are declared to represent the coordinates of a point. The getter methods get the coordinates of a point. The setter method sets the coordinates of a points.
    * question_1: What does the following block of code do?
    * answer_1: Declare variables to reperesnet a point and method to access them.
    * question_2: What is the data type of variable x and y?
    * answer_2: Variables x and y are of integer type.
    * question_3: What does a getter method do?
    * answer_3:  The getter methods get the coordinates of a point.
    * question_2: What does a setter method do?
    * answer_2:  The setter method sets the coordinates of a points.
    */
    private int x;
    private int y;
    public void setX(int newX) { this.x = newX; }
    public int getX() { return x; }
    public void setY(int newY) { this.y = newY; }
    public int getY() { return y; }


/**
 * logical_step_2: Define a method to translate the point.
 * logical_step_details: A method is defined to shift x and y coordinates of a point.  It shifts the X by dx and y by dy amount.
 * question_1: What does the following code block do?
 * answer_1:  Define a method to translate the point.
 * question_2: What does the method do?
 * answer_2: It shifts the X by dx and y by dy amount.
 */
public void translate(int dx, int dy) {
    x += dx;
    y += dy;
}

public static void main(String[] args) {
    /**
     * logical_step_3: Creates an object to represent a point.
     * logical_step_details:  To represent a point, an object of class Point is intilaized. The value x and y is set to 7 and 2 respectively.
     * question_1: What does the following code block do?
     * answer_1: Creates an object to represent a point.
     * question_2: What do we do represent a point?
     * answer_2: To represent a point, an object of class Point is intilaized.
     * question_2: What is the value of x and y?
     * question_2: The value x is 7 and y is 2.
     */
    Point point = new Point();
    /*stm_comment: Calls a setter method to set the value of x.
     * question_1: What does the following statment do?
     * answer_1: Calls a setter method to set the value of x.
    */
    point.setX(7);
    point.setY(2);

    /*
     * logical_step_4: Calls a tanslate method .
     the value of x and y by given amount and prints new coordinates.
     * logical_step_details:  Call the method translate which shifts x by 11 and y by 6. The final x and y coordinates printed after calling translate method is 18, 8.
     * question_1: What does the following code block do?
     * answer_1: Tanslates the value of x and y by given amount and prints new coordinates.
     * question_2: What is the value of x and y coordinates after calling translate method?
     * answer_2: 18,8
     */
    /**
     * stm_comment: class the method translate of the point object.
     */
    point.translate(11, 6);
    System.out.println("The new coordinates: (" + point.getX() + ", " + point.getY() + ")");

}
}
