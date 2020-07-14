package practice;

public class Main {

	public static void main(String[] args) {
//		int[][] grid = {	
//						{0, 1, 0, 0},
//						{1, 1, 1, 0},
//						{0, 1, 0, 0},
//						{1, 1, 0, 0}
//						};
//		System.out.println(new IslandPerimeter().islandPerimeter(grid));
		
//		new CyclicShifts().performCyclicShifts(7881, 3, "R");
		
//		System.out.println(new ScrambledString().isScramble("ab", "ba"));
		
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("am");	al.add("fasgoprn");	al.add("lvqsrjylg");	al.add("rzuslwan");	al.add("xlaui");
//		ArrayList<String> result = new StringJustify().fullJustify(al, 12);
//		for (String s : result)
//			System.out.println(s);
//		System.out.println(result.get(1).length() + "  " + result.get(2).length());
		
//		int[] stones = {2, 7, 4, 1, 8, 1};
//		System.out.println(new Stone().lastStoneWeight(stones));
		
//		long n=72, k=80;
//		long q1=0, q2=1, d=1;
//		
//        while ((q1+q2)<k) {
//            long x = (long) Math.floor((Math.log(n-q2) / Math.log(2)));
//            d += x;
//            q2 = (long) Math.pow(2.0, d-1);
//            if (q1+q2 > k)
//            	break;
//            else {
//            	q1 += n;
//            	q2 = 1;
//            	d -= 1;
//            }
//            
//        }
//        System.out.println(d);
		
//		System.out.println(new ZigZagString().convert("PAYPALISHIRING", 3));
		
//		new PrintRectangles().printReactangle(5, 8);
		
		/** Tushar Bday Bombs */
//		ArrayList<Integer> B = new ArrayList<Integer>();
//		B.add(8);	B.add(8);	B.add(6);	B.add(5);	B.add(4);
//		System.out.println(new TusharBdayBombs().solve(12, B));
		
		/** DP Partition Problem */
//		int arr[] = {3, 10, 3, 8, 2, 76};
//		System.out.println(new Sum_Partition_Problem().partitionPossible(arr, arr.length));
		
		/** Coin Change Problem */
//		int[] arr = new int[] {2, 5, 3, 6};
//		System.out.println(new CoinChange().no_Of_Ways(arr, arr.length, 10));
		
		//System.out.println((int) Math.ceil(19/5.0));
		
		//System.out.println(new SmartPhone().chargingSmartPhone(10, 39));
		
//		Pair[] p = new Pair[] {new Pair(5, 9), new Pair(1, 2), new Pair(3, 4),
//								new Pair(0, 6), new Pair(5, 7), new Pair(8, 9)};
//		ArrayList<Pair> al = new ArrayList<Pair>(Arrays.asList(p));
//		Collections.sort(al, (o1, o2) -> {
//
//				return (o1.second).compareTo(o2.second);
//		});
//		for (Pair pair : al) {
//			System.out.println(pair.first + " " + pair.second);
//		}
		
		/** Zero sum sub arrys */
//		int[] arr = new int[] {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
//		new ZeroSumSubArrays().findArrays(arr);
		
		/** Sort array by frequency */
//		int[] arr = new int[] {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
//		System.out.println(new Sort_Array_By_Frequency().sortArray(arr));
		
		/** Remove adjacent duplicates from a string */
//		String s = "abba";
//		System.out.println(new RemoveAdjacentDuplicates().removeDuplicates(s));
		
		/** Print all anagrams of a string */
//		String str = "abcdefghij";
//		StringBuffer sb = new StringBuffer(str);
//		new GenerateAnagrams().printAnagrams(sb, 4, 0);
//		HashSet<String> result = new GenerateAnagrams().printAnagramsEfficiently(str);
//		System.out.println(result.toString());
		
		/** Generate column nos in excel*/
//		new GenerateColumnsExcel().generateColumns();
		
		/**  Sub array sum */
//		int[] arr = new int[] {15, 2, 4, 8, 9, 5, 10, 23};
//		new SubArraySum().subArraySum(arr, 23);
		
		/** MiQ Challange */
//		int[][] arr = new int[][] { {1, 2}, {1, 3}, {2, 4}, {2, 5}, {4, 6},{4, 7} };
//		MiQ_Challange.solve(arr, 7);
		
		/** N Max Pair Combinations */
//		ArrayList<Integer> a = new ArrayList<Integer>();		a.add(1);	a.add(4);	a.add(2);	a.add(3);
//		ArrayList<Integer> b = new ArrayList<Integer>();		b.add(2);	b.add(5);	b.add(1);	a.add(6);
//		ArrayList<Integer> result = new N_MaxPairCombinations().solve(a, b);
		
		//System.out.println(new NitinTest().CountWays(100));
		
		/** Window String */
//		String A = "ADOBECODEBANC";
//		String B = "ABCCC";
//		System.out.println(new WindowString().minWindow(A, B));
		
		/** Tushar Bday Party */
//		List<Integer> a = new ArrayList<Integer>();		a.add(4);	a.add(6);
//		List<Integer> b = new ArrayList<Integer>();		b.add(1);	b.add(3);
//		List<Integer> c = new ArrayList<Integer>();		c.add(5);	c.add(3);
//		System.out.println(new TusharBdayParty().solve(a, b, c));
		
		/** Largest sum sub-matrix */
//		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
//		ArrayList<Integer> a = new ArrayList<Integer>();		a.add(-5);	a.add(-4);	a.add(-1);
//		ArrayList<Integer> b = new ArrayList<Integer>();		b.add(-3);	b.add(2);	b.add(4);
//		ArrayList<Integer> c = new ArrayList<Integer>();		c.add(2);	c.add(5);	c.add(8);
//		A.add(a);	A.add(b);	A.add(c);
//		
//		System.out.println(new LargestSumMatrix().solve(A));
	}

}
