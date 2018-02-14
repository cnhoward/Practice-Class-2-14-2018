
public class SmallNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 2;
int b = 4;
int c = compnumbers (a,b);
System.out.println(c);
int d = 6;
int e = 21;
int f = compnumbers(d,e);
System.out.println(f);
int g = 119;
int h = 112;
int i = compnumbers(g,h);
System.out.println(i);
	}
	
	public static int compnumbers(int a, int b){
	if (a > b) {
		return b;
	}else {
		return a;
	}
	
	}	
}
