package P3ImmutableRecord;

record HotelBooking(String hotelName, int nights, double pricePerNight) {
    public double totalCost() {
        return nights * pricePerNight;
    }
}
