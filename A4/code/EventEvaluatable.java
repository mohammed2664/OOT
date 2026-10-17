public interface EventEvaluatable {
    String getImpactMetrics();

    default String getVerificationBadge() {
        return "[NIRF-Verified-Activity]";
    }
}