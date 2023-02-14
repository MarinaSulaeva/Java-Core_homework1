package transport;

public enum CarryingCapacity {
    N1(null, 3.5F),
    N2(3.5F, 12F),
    N3(12F, null);

    private final Float minCarryingCapacity;
    private final Float maxCarryingCapacity;

    CarryingCapacity(Float minCarryingCapacity, Float maxCarryingCapacity) {
        this.minCarryingCapacity = minCarryingCapacity;
        this.maxCarryingCapacity = maxCarryingCapacity;
    }

    public Float getMinCarryingCapacity() {
        return minCarryingCapacity;
    }

    public Float getMaxCarryingCapacity() {
        return maxCarryingCapacity;
    }

    @Override
    public String toString() {
        if (minCarryingCapacity == null) {
            return "Грузоподъемность: до " + maxCarryingCapacity + " тонн";
        } else if (maxCarryingCapacity == null) {
            return "Грузоподъемность: от " + minCarryingCapacity + " тонн";
        } else {
            return "Грузоподъемность: от " + minCarryingCapacity + " тонн до " + maxCarryingCapacity + " тонн";
        }
    }
}

