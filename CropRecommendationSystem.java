import java.util.Scanner;
public class CropRecommendationSystem {
    public static void recommendCrop(double soilPH, String nitrogenLevel, String climate) {
        if (soilPH >= 6.0 && soilPH <= 7.5) {
            if (nitrogenLevel.equalsIgnoreCase("high")) {
                System.out.println("Recommended Crop: Rice or Wheat");
            } else if (nitrogenLevel.equalsIgnoreCase("medium")) {
                System.out.println("Recommended Crop: Maize or Soybean");
            } else if (nitrogenLevel.equalsIgnoreCase("low")) {
                System.out.println("Recommended Crop: Barley or Millets");
            }
        } else if (soilPH < 6.0) {
            if (nitrogenLevel.equalsIgnoreCase("high")) {
                System.out.println("Recommended Crop: Peanuts or Potatoes");
            } else if (nitrogenLevel.equalsIgnoreCase("medium")) {
                System.out.println("Recommended Crop: Corn or Peas");
            } else if (nitrogenLevel.equalsIgnoreCase("low")) {
                System.out.println("Recommended Crop: Sorghum or Lentils");
            }
        } else if (soilPH > 7.5) {
            System.out.println("Recommended Crop: Alfalfa or Beets");
        }
        if (climate.equalsIgnoreCase("tropical")) {
            System.out.println("Additional Suggestion: Consider growing Sugarcane or Bananas.");
        } else if (climate.equalsIgnoreCase("temperate")) {
            System.out.println("Additional Suggestion: Consider growing Apples or Grapes.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter soil pH: ");
        double soilPH = scanner.nextDouble();
        System.out.print("Enter nitrogen level (high/medium/low): ");
        String nitrogenLevel = scanner.next();
        System.out.print("Enter climate type (tropical/temperate/arid): ");
        String climate = scanner.next();
        recommendCrop(soilPH, nitrogenLevel, climate);
        scanner.close();
    }
}
