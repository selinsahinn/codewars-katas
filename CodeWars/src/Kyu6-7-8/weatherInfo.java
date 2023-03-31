package Kyu8;

public class weatherInfo {
    public static String weatherInfo(int temperature) {
        double c=convertToCelsius(temperature);

        if (c > 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static int convertToCelsius(int temperature) {
        int celsius = (temperature - 32) * (5/9);
        return temperature;
    }
}
