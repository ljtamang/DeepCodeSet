{
    "author": "Lasang Tamang, refind by Dr Vasile Rus",
    "topic": "Preliminary Topics",
    "subtopic": "Variables, Expressions, Constants, Primitive Data Types",
    "goalDescription": "Calculate the area of a circle.",
    "source": "N/A",
    "input": "N/A",
    "output": "The area for the circle of radius 5.80 is 105.68",
    "code": "public class AreaOfCircle {\n    public static void main(String[] args) {\n\n        final double PI = 3.14159;\n        double radius = 5.8;\n        double area;\n\n        area = radius * radius * PI;\n        System.out.printf(\"The area for the circle of radius %.2f is %.2f \", radius, area);\n\n    }\n}\n",
    "blocks": [
        {
            "blockNum": 1,
            "start": 4,
            "end": 6,
            "domainModelQuestion": "What is the goal of the block of code (line 4-line 6)?",
            "logicalStep": "It declares variables to store the value of the constant PI, radius, and area of a circle.",
            "programModelQuestion": "Can you explain in detail how the goal of the current block of code (line 4-line 6) is actually implemented?",
            "logicalStepDetail": "A variable PI of double type is declared to hold the value of the mathematical constant PI. The variable radius of double type is declared to store the value of the radius of a circle. The variable area of double type is declared to store the area of a circle.",
            "questions": [
                {
                    "questionNum": "1",
                    "question": "Why is variable PI declared?",
                    "answer": "A variable PI of double type is declared to hold the value of the mathematical constant PI."
                },
                {
                    "questionNum": "2",
                    "question": "Why is the variable radius declared?",
                    "answer": "The variable radius stores the value of the radius of a circle."
                },
                {
                    "questionNum": "3",
                    "question": "Why is the variable area declared?",
                    "answer": "The variable area of double type is declared to store the area of a circle."
                }
            ],
            "statements": [
                {
                    "statementNum": 1,
                    "start": 4,
                    "end": 4,
                    "statementComment": "The keyword final is used for declaring a constant variable that always stores the same value.",
                    "questions": [
                        {
                            "questionNum": 1,
                            "question": "What is the keyword final used for?",
                            "answer": "The keyword final is used for declaring a constant variable that always stores the same value."
                        }
                    ]
                }
            ]
        },
        {
            "blockNum": 2,
            "start": 8,
            "end": 9,
            "domainModelQuestion": "What is the goal of the block of code (line 8-line 9)?",
            "logicalStep": "It calculates the area of the circle and prints its value.",
            "programModelQuestion": "Can you explain in detail how the goal of the current block of code (line 8-line 9) is actually implemented?",
            "logicalStepDetail": "The expression for computing the area of a circle (area = radius*radius*PI) is used to calculate the area of the circle. The area of the circle is 105.68. The program uses the statement printf to print the value of the radius and area of the circle at the standard output device.",
            "questions": [
                {
                    "questionNum": "1",
                    "question": "How is the area of the circle computed?",
                    "answer": "The well-known mathematical expression for the area of the circle (area = radius * radius * PI) is used to calculate the area of the circle."
                },
                {
                    "questionNum": "2",
                    "question": "What is the calculated value of the area?",
                    "answer": "The calculated value of the area is 105.68."
                },
                {
                    "questionNum": "3",
                    "question": "How is the computed value of the area of the circle actually printed?",
                    "answer": "The program uses the statement printf to print the value of the radius and area of the circle at the standard output device."
                }
            ],
            "statements": []
        }
    ]
}
