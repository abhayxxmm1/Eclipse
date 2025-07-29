package pack2;

import pack1.G;
import pack1.GDriver;

public class ZP extends G{
	
	public void add(int a,int b) {
		int res = a + b;
		System.out.println(res);
		
	}
		protected String multi()
		{
			return "Fuck u";
		}
		
		public static void main(String[] args) {
			G g1 = new ZP();
			g1.add(10, 20);
//			System.out.println(g1.multi()); // CTE
//			g1.multi();
//			
//			G.multi();
			
			G.mad();
			G.badAss();
		}
}
