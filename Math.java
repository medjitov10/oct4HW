package GA.homework.oct4;

public class Math implements Course {
    private String courseName;

    public Math(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String getCourse() {
        return this.courseName;
    }
}
