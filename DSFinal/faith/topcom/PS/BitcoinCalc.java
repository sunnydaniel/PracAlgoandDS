package faith.topcom.PS;

public class BitcoinCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={2,3,4,1,5};
		int[] b={1,3,2,4,5};
		
		int m=10,k=3;
		System.out.println(calc(a,b,m,k));
	}

	private static int calc(int[] a, int[] b, int m, int k) {
		// TODO Auto-generated method stub
		int dol= m*k;
		int maxamt=dol;
		for (int i = 0; i < b.length; i++) {
			int amt=((b[i]*m)*a[i]);
			if(amt>dol) dol=amt;
		}
		return dol;
	}
}