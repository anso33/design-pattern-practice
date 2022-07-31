package ex05.sub;

public class MajorGradeStrategy implements GradeStrategy{

    @Override
    public String calcGrade(int scorePoint) {

        if (scorePoint < 0) {
            System.out.println("Wrong input");
            return String.valueOf((0));
        } else if (scorePoint < 60) {
            return ("F");
        } else if (scorePoint < 70) {
            return ("D");
        } else if (scorePoint < 80) {
            return ("C");
        } else if (scorePoint < 90) {
            return ("B");
        } else if (scorePoint < 95) {
            return ("A");
        } else if (scorePoint <= 100) {
            return ("S");
        } else {
            System.out.println("Wrong input");
            return String.valueOf((0));
        }
    }
}
