public class UnitConverter {

    public static String convert(String[] args) {
        if (args.length != 3) {
            return "ERROR"; // Ensures there are exactly three arguments
        }
        
        String fromUnit = args[0].toLowerCase();
        String toUnit = args[1].toLowerCase();
        double value;

        try {
            value = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            return "ERROR"; // Handle non-numeric input
        }
        
        switch (fromUnit) {
            case "celsius":
                if ("fahrenheit".equals(toUnit)) {
                    return String.format("%.2f", celsiusToFahrenheit(value));
                }
                break;
            case "fahrenheit":
                if ("celsius".equals(toUnit)) {
                    return String.format("%.2f", fahrenheitToCelsius(value));
                }
                break;
            case "kilometers":
                if ("miles".equals(toUnit)) {
                    return String.format("%.2f", kilometersToMiles(value));
                }
                break;
            case "miles":
                if ("kilometers".equals(toUnit)) {
                    return String.format("%.2f", milesToKilometers(value));
                }
                break;
        }
        
        return "ERROR"; // Return ERROR for unsupported unit conversions
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    private static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
}
