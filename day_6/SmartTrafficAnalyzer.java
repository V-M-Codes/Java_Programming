import java.util.Scanner;

public class SmartTrafficAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vehicle Number: ");
        String vehicleNo = sc.nextLine();

        System.out.print("Enter Speed (km/h): ");
        int speed = sc.nextInt();

        System.out.print("Enter Speed Limit (km/h): ");
        int speedLimit = sc.nextInt();

        System.out.print("Enter Driver Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Helmet Status (1 = Valid, 0 = Violation): ");
        int helmetStat = sc.nextInt();

        System.out.print("Enter Seat-belt Status (1 = Valid, 0 = Violation): ");
        int seatbeltStat = sc.nextInt();

        System.out.print("Valid License? (1 = Yes, 0 = No): ");
        int licenseStat = sc.nextInt();

        System.out.print("Emergency Vehicle? (1 = Yes, 0 = No): ");
        int emergencyVehicle = sc.nextInt();

        int excessSpeed = speed - speedLimit;
        if (excessSpeed <= 0) {
            excessSpeed = 0;
        }

        boolean overSpeed = speed > speedLimit;
        boolean helmetViolation = helmetStat == 0;
        boolean seatbeltViolation = seatbeltStat == 0;
        boolean licenseViolation = licenseStat == 0;
        boolean ageViolation = age < 18;
        int fine = 0;

        if (overSpeed && !emergencyVehicleEqualsOne(emergencyVehicle)) {
            if (excessSpeed <= 10) {
                fine += 500;
            } else if (excessSpeed <= 20) {
                fine += 1000;
            } else {
                fine += 1500;
            }
        }

        if (helmetViolation) {
            fine += 1000;
        }
        if (seatbeltViolation) {
            fine += 1000;
        }
        if (licenseViolation) {
            fine += 1000;
        }
        if (ageViolation) {
            fine += 500;
        }

        int violationFlags = 0;

        if (overSpeed) {
            violationFlags++;
        }
        if (helmetViolation) {
            violationFlags++;
        }
        if (seatbeltViolation) {
            violationFlags++;
        }
        if (licenseViolation) {
            violationFlags++;
        }
        if (ageViolation) {
            violationFlags++;
        }

        String riskLevel;

        if (violationFlags >= 3 || excessSpeed > 20) {
            riskLevel = "HIGH";
        } else if (violationFlags == 2) {
            riskLevel = "MEDIUM";
        } else if (violationFlags == 1) {
            riskLevel = "LOW";
        } else {
            riskLevel = "NONE";
        }

        System.out.println();
        System.out.println("==========================================");
        System.out.println("       SMART TRAFFIC ANALYZER");
        System.out.println("==========================================");

        System.out.println();
        System.out.println("Vehicle Number   : " + vehicleNo);
        System.out.println("Speed            : " + speed + " km/h");
        System.out.println("Speed Limit      : " + speedLimit + " km/h");
        System.out.println("Excess Speed     : " + excessSpeed + " km/h");

        System.out.println();
        if (overSpeed) {
            System.out.println("Speed Status     : OVER SPEED");
        } else {
            System.out.println("Speed Status     : NORMAL");
        }

        if (helmetStat == 1) {
            System.out.println("Helmet Status    : VALID");
        } else {
            System.out.println("Helmet Status    : VIOLATION");
        }

        if (seatbeltStat == 1) {
            System.out.println("Seat Belt Status : VALID");
        } else {
            System.out.println("Seat Belt Status : VIOLATION");
        }

        if (licenseStat == 1) {
            System.out.println("License Status   : VALID");
        } else {
            System.out.println("License Status   : INVALID");
        }

        System.out.println();
        System.out.println("Total Fine       : " + "Rs " + fine);
        System.out.println("Risk Level       : " + riskLevel);
        System.out.println("Violation Flags  : " + violationFlags);

        System.out.println();
        System.out.println("==========================================");

        sc.close();
    }

    public static boolean emergencyVehicleEqualsOne(int emergencyVehicle) {
        return emergencyVehicle == 1;
    }
}