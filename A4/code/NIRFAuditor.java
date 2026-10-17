public class NIRFAuditor {

    public static void submitToPortal(NIRFReportable item) {
        item.generateNIRFEntry();
    }
}