package practice;

public class SchindlerChallenge {
	
	public static void main(String[] args) {
		String s = "11as";
		Validator.isValid(s);
	}
	static class Validator {
		public static boolean isValid(String s) {
			boolean alphabet=false, numeric=false;
			
			for (int i=0; i<s.length(); i++) {
				if( (s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) )
					alphabet = true;
				else if ( s.charAt(i)>=48 && s.charAt(i)<=57 )
					numeric = true;
			}
			try {
				if (numeric) {
					if (!alphabet)
						System.out.println("Valid String");
					else
						throw new AlphaNumericException("Alpha Numeric Exception");
				}
				if (alphabet) {
					throw new StringException("String Exception");
				}
			}
			catch (AlphaNumericException e) {
				System.out.println(e.toString());
			}
			catch (StringException e) {
				System.out.println(e.getMessage());
			}
			
			return false;
		}
	}
	static class AlphaNumericException extends Exception {
		public AlphaNumericException(String msg) {
			super(msg);
		}
	}
	static class StringException extends Exception {
		public StringException(String msg) {
			super(msg);
		}
	}

}
