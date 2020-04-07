package practice;

public class SmartPhone {
	
	static int chargingSmartPhone(int initCharge, int finalCharge){
        int result = 0;
        int currentCharge = initCharge;
        while (currentCharge < finalCharge) {
            if (currentCharge>=0 && currentCharge<=10) {
                currentCharge +=10;
                result++;
                if (currentCharge >= finalCharge)
                    break;
            }
            if (currentCharge<=230) {
                if (finalCharge <= 230) {
                    result += (int) Math.ceil((finalCharge-currentCharge)/5);
                    break;
                }
                else
                    result += (int) Math.ceil((230-currentCharge)/5);
            }
            if (currentCharge<=559) {
                if (finalCharge <= 559) {
                    result += (int) Math.ceil((finalCharge-currentCharge)/8);
                    break;
                }
                else
                    result += (int) Math.ceil((559-currentCharge)/8);
            }
                
            if (currentCharge<=1009) {
                if (finalCharge <= 1009) {
                    result += (int) Math.ceil((finalCharge-currentCharge)/2);
                    break;
                }
                else
                    result += (int) Math.ceil((1009-currentCharge)/2);
            }
            if (currentCharge<=5000) {
                if (finalCharge <= 5000) {
                    result += (int) Math.ceil((finalCharge-currentCharge)/7);
                    break;
                }
                else
                    result += (int) Math.ceil((5000-currentCharge)/7);
            }
            if (currentCharge<=10000) {
                if (finalCharge <= 10000) {
                    result += (int) Math.ceil((finalCharge-currentCharge)/8);
                    break;
                }
                else
                    result += (int) Math.ceil((10000-currentCharge)/8);
            }
            if (currentCharge<=1000000000) {
                if (finalCharge <= 1000000000) {
                    result += (int) Math.ceil((finalCharge-currentCharge)/3);
                    break;
                }
                else
                    result += (int) Math.ceil((1000000000-currentCharge)/3);
            }
        }
        return result;
    }

}
