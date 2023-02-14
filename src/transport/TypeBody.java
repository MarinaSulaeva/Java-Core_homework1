package transport;

public enum TypeBody {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе"),
    STATION_WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String typeInRussian;

    TypeBody(String typeInRussian) {
        this.typeInRussian = typeInRussian;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + typeInRussian;
    }

    public String getTypeInRussian() {
        return typeInRussian;
    }
}
