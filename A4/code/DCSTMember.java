public abstract class DCSTMember implements NIRFReportable {

    public String name;
    protected String department;
    private String memberId;

    private static int memberCount = 0;

    public DCSTMember(String memberId, String name, String department) {
        this.memberId = memberId;
        this.name = name;
        this.department = department;
        memberCount++;
    }

    public String getMemberId() {
        return memberId;
    }

    public String verifyInternalAccess() {
        return "Internal Private ID Check OK: " + this.memberId;
    }

    public static void displayTotalMembers() {
        System.out.println("Total DCST Members Registered for NIRF: " + memberCount);
    }

    public abstract String getRoleDetails();
}