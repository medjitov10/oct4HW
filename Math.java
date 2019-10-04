package GA.homework.hwoct4;

import GA.homework.hwoct4.Course;

public class Math implements Course {
    private String courseName;
    private int credits;

    public Math(String courseName, int credits) {
        this.credits = credits;
        this.courseName = courseName;
    }

    @Override
    public String getCourse() {
        return this.courseName;
    }
}
