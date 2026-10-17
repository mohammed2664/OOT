public class Student extends DCSTMember {

    public String program;
    public int batchYear;

    public Student(String memberId, String name, String program, int batchYear) {
        super(memberId, name, "DCST, Goa Business School");
        this.program = program;
        this.batchYear = batchYear;
    }

    @Override
    public String getRoleDetails() {
        return "Student [" + getMemberId() + "] " + name + " | Program: " + program + " (" + batchYear + ")";
    }

    @Override
    public void generateNIRFEntry() {
        System.out.println("  -> NIRF Student Record: " + getRoleDetails() + " | Dept: " + department);
    }

    public int calculateTotalScore(int isaMarks, int seaMarks) {
        return isaMarks + seaMarks;
    }

    public int calculateTotalScore(int isaMarks, int midpointMarks, int seaMarks) {
        return isaMarks + midpointMarks + seaMarks;
    }
}