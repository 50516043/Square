/*利用データ
 * x={ 0.0, 0.4, 0.8, 1.0,1.2, 1.6, 1.8 }
 * y={ 1.5, 2.0, 3.2, 4.5, 5.0, 7.0, 7.6 }
 * 理論値 y=3.6232x+0.8803
 * 
 * */



package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = { 0.0, 0.4, 0.8, 1.0,1.2, 1.6, 1.8 };
		 double y[] = { 1.5, 2.0, 3.2, 4.5, 5.0, 7.0, 7.6 };
		 double theta[] = new double[2];
		 
		 Squares_lib slib = new Squares_lib(x, y);
		 
		 for(int i = 0; i < 100; i++){
				theta = slib.getDx();
				System.out.println(i+" : theta[0] = "+theta[0]);
				System.out.println(i+" : theta[1] = "+theta[1]);
				System.out.println(i+" : Objective function = "+slib.getRx());
			}



	}

}
