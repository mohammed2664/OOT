public class Staff extends DCSTMember {

    public String designation;
    public boolean isTeaching;

    public Staff(String memberId, String name, String designation, boolean isTeaching) {
        super(memberId, name, "DCST, Goa Business School");
        this.designation = designation;
        this.isTeaching = isTeaching;
    }

    @Override
    public String getRoleDetails() {
        String staffType = isTeaching ? "Teaching Faculty" : "Non-Teaching Staff";
        return staffType + " [" + getMemberId() + "] " + name + " (" + designation + ")";
    }

    @Override
    public void generateNIRFEntry() {
        System.out.println("  -> NIRF Staff Record:   " + getRoleDetails());
    }
}