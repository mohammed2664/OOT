import java.io.Serializable;

public class DCSTProgram implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    public String programName;
    public int durationYears;
    public CourseModule coreSubject;

    public DCSTProgram(String programName, int durationYears, CourseModule coreSubject) {
        this.programName = programName;
        this.durationYears = durationYears;
        this.coreSubject = coreSubject;
    }

    public DCSTProgram shallowCopy() throws CloneNotSupportedException {
        return (DCSTProgram) super.clone();
    }

    public DCSTProgram deepCopy() throws CloneNotSupportedException {
        DCSTProgram copy = (DCSTProgram) super.clone();
        copy.coreSubject = (CourseModule) this.coreSubject.clone();
        return copy;
    }

    @Override
    public String toString() {
        return programName + " (" + durationYears + " Yrs) | Core Subject -> [" + coreSubject + "]";
    }
}