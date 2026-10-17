import java.io.Serializable;

public class CourseModule implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    public String courseCode;
    public String courseTitle;

    public CourseModule(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return courseCode + ": " + courseTitle;
    }
}