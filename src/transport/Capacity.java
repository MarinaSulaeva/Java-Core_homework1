package transport;

public enum Capacity {
    ESPECIALLY_SMALL(null, 10),
    SMALL(null, 25),
    AVERAGE(25, 50),
    LARGE(50, 80),
    ESPECIALLY_LARGE(80, 120);

    private final Integer minSeats;
    private final Integer maxSeats;

    Capacity(Integer minSeats, Integer maxSeats) {
        this.minSeats = minSeats;
        this.maxSeats = maxSeats;
    }

    @Override
    public String toString() {
        if (minSeats == null) {
            return "Вместимость: " + maxSeats + " мест";
        } else {
            return "Вместимость: " + minSeats + " - " + maxSeats + " мест";
        }
    }

    public Integer getMinSeats() {
        return minSeats;
    }

    public Integer getMaxSeats() {
        return maxSeats;
    }
}
