import java.util.*;

public class OTPGenerator {

	// Method to generate a 6-digit OTP number
    public static  int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to ensure OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
      
		
        // Generate 10 OTP numbers
        for (int i = 0; i < 10; i++) {
			int x=generateOTP();
            otps[i] = x;
        }

        // Check if OTP numbers are unique
        boolean isUnique = areOTPsUnique(otps);
        
        
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are OTPs unique? " + isUnique);
    }

    
}