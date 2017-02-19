/**
 * The final exam counts for 40% of the grade. The midterm counts for 35% of the grade. The three quizzes together count for a total of 25% of the grade.
 * (Do not forget to convert the quiz scores to percentages before they are averaged in.)
 *Any grade of 90 or more is an A, any grade of 80 or more (but less than 90) is a B, any grade of 70 or more (but less than 80) is a C,
 *any grade of 60 or more (but less than 70) is a D, and any grade below 60 is an F. The program should read in the student’s scores and output the student’s record,
 * which consists of three quiz scores and two exam scores,
 *as well as the student’s overall numeric score for the entire course and final letter grade.
 */
public class GradeBook {
    private int quiz1, quiz2, quiz3, midterm, last;
    private double finalGrade; // weighted average numeric grade
    private char letterGrade;

    public GradeBook(int quiz1Grade, int quiz2Grade, int quiz3Grade, int midtermGrade, int lastTestGradeResult){
        quiz1 = quiz1Grade > 0 ? quiz1Grade : 0;
        quiz2 = quiz2Grade > 0 ? quiz2Grade : 0;
        quiz3 = quiz3Grade > 0 ? quiz3Grade : 0;
        midterm = midtermGrade > 0 ? midtermGrade : 0;
        last = lastTestGradeResult > 0 ? lastTestGradeResult : 0;
    }

    public GradeBook(int quiz1Grade){
        quiz1 = quiz1Grade > 0 ? quiz1Grade : 0;
        quiz2 = 0;
        quiz3 = 0;
        midterm = 0;
        finalGrade = 0;
    }

    public GradeBook(int quiz1Grade, int quiz2Grade){
        quiz1 = quiz1Grade > 0 ? quiz1Grade : 0;
        quiz2 = quiz2Grade > 0 ? quiz2Grade : 0;
        quiz3 = 0;
        midterm = 0;
        finalGrade = 0;
    }

    public void set(int quiz1Grade, int quiz2Grade, int quiz3Grade, int midtermGrade, double finalGradeResult){
        quiz1 = quiz1Grade > 0 ? quiz1Grade : 0;
        quiz2 = quiz2Grade > 0 ? quiz2Grade : 0;
        quiz3 = quiz3Grade > 0 ? quiz3Grade : 0;
        midterm = midtermGrade > 0 ? midtermGrade : 0;
        finalGrade = finalGradeResult > 0 ? finalGradeResult : 0;
    }

    public void setQuiz1(int quiz1Grade){
        quiz1 = quiz1Grade > 0 ? quiz1Grade : 0;
    }

    public void setQuiz2(int quiz2Grade){
        quiz2 = quiz2Grade > 0 ? quiz2Grade : 0;
    }

    public void setQuiz3(int quiz3Grade){
        quiz3 = quiz3Grade > 0 ? quiz3Grade : 0;
    }

    public void setMidterm(int midterm1){
        midterm = midterm1 > 0 ? midterm1 : 0;
    }

    public void setLast(int last1){
        last = last1 > 0 ? last1 : 0;
    }

    private double calculateFinalGrade(){
        finalGrade = (.40 * last) + (.35 * midterm) + .25*((quiz1+quiz3+quiz3)/3);
        finalGrade = finalGrade * 100;
        return finalGrade;
    }

    public char yourLetterGrade(){

        if(finalGrade > 90){
            System.out.println("Your final grade is: ");
            return 'A';
        }
        else if (finalGrade < 90  && finalGrade >= 80){
            System.out.println("Your final grade is: ");
            return 'B';
        }
        else if (finalGrade < 80 && finalGrade >= 70){
            System.out.println("Your final grade is: ");
            return 'C';
        }
        else if (finalGrade < 70 && finalGrade >= 60){
            System.out.println("Your final grade is: ");
            return 'D';
        }
        else{
            System.out.println("Your final grade is: ");
            return 'F';
        }
    }



}
