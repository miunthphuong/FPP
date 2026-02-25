package P3ImmutableRecord;

record HotelBooking(String hotelName, int nights, double pricePerNight) {
    public HotelBooking {
        if (hotelName == null || nights <= 0 || pricePerNight <= 0)
            throw new IllegalArgumentException("Invalid input");
    }

    public double totalCost() {
        return nights * pricePerNight;
    }
}
