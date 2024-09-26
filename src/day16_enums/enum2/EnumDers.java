package day16_enums.enum2;

enum Level {
    LOW, MEDIUM, HIGH;
}

public class EnumDers {

    public static void main(String[] args) {
        System.out.println("Level.LOW = " + Level.LOW);

        Level l = Level.MEDIUM;

        switch (l) {
            case LOW -> System.out.println("LOW");
            case MEDIUM -> System.out.println("Higher than LOW");
            case HIGH -> System.out.println("HIGHER one");
        }
    }
}
