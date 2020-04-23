package practice;

public class CyclicShifts {
	
	public void performCyclicShifts(int n, int m, String c) {
		String str = Integer.toBinaryString(n);
		while (str.length() < 16) {
			str = "0" + str; 
		}
			
		System.out.println("Old String : " + str);
		
        String strNew = "";

        int i = 0;
        if (c.equals("L")) {
            i -= m%16;
            if (i<0)
                i = -i;
            System.out.println("i = " + i);
            strNew += str.substring(i, 16);
            System.out.println(strNew);
            strNew += str.substring(0, i);
            System.out.println(strNew);
        }
        else {
            i += m%16;
            System.out.println("i = " + i);	
            
            strNew += str.substring(16-i, 16);
            System.out.println(strNew);
            
            strNew += str.substring(0, 16-i);
            System.out.println(strNew);
        }
        
        System.out.println("New String : " + strNew);
        
        int result = Integer.parseInt(strNew, 2);
        System.out.println(result);
        
	}

}
