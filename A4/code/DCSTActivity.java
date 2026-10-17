public class DCSTActivity implements NIRFReportable, EventEvaluatable {

    public String activityName;
    public ActivityCategory category;
    public int participantsCount;
    public String coordinator;

    public DCSTActivity(String activityName, ActivityCategory category, int participantsCount, String coordinator) {
        this.activityName = activityName;
        this.category = category;
        this.participantsCount = participantsCount;
        this.coordinator = coordinator;
    }

    @Override
    public String getImpactMetrics() {
        return "Participants: " + participantsCount + " | Coord: " + coordinator;
    }

    @Override
    public void generateNIRFEntry() {
        System.out.println("  -> [" + category + "] " + activityName + " | " + getImpactMetrics() + " " + getVerificationBadge());
    }
}