package ex05.sub;

public class Subject {

    private String name;
    private int scorePoint;
    private boolean majorCode;
    private String grade;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getScorePoint() { return scorePoint; }
    public void setScorePoint(int scorePoint) { this.scorePoint = scorePoint; }

    public boolean isMajorCode() { return majorCode; }
    public void setMajorCode(boolean majorCode) { this.majorCode = majorCode; }

    private void setGrade() {
        GradeStrategy gradeStrategy;

        if (isMajorCode()) {
            gradeStrategy = new MajorGradeStrategy();
        } else {
            gradeStrategy = new BasicGradeStrategy();
        }
        grade = gradeStrategy.calcGrade(scorePoint);
//        System.out.println("\ngrade : " + grade + "\n");
    }
    public String getGrade() {

        setGrade();
        return grade;
    }
}
