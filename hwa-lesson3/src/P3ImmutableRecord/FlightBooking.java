package P3ImmutableRecord;

record FlightBooking(String origin, String destination, double distanceKm) {
    public FlightBooking {
        if (origin == null || destination == null || distanceKm <= 0)
            throw new IllegalArgumentException("Invalid input");
    }
    public double computeFlightTime(double avgSpeed) {
        return distanceKm / avgSpeed;
    }
}
