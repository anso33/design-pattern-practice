package ex05.sub;

public class BasicGradeStrategy implements GradeStrategy{

    @Override
    public String calcGrade(int scorePoint) {

        if (scorePoint < 0) {
            System.out.println("Wrong input");
            return String.valueOf((0));
        } else if (scorePoint < 55) {
            return ("F");
        } else if (scorePoint < 70) {
            return ("D");
        } else if (scorePoint < 80) {
            return ("C");
        } else if (scorePoint < 90) {
            return ("B");
        } else if (scorePoint <= 100) {
            return ("A");
        } else {
            System.out.println("Wrong input");
            return String.valueOf((0));
        }
    }
}
