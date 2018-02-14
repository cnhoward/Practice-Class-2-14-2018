
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 118;
int b = 36;
int c = 22;
double d = avgnumbers(a,b,c);
System.out.println(d);

int e = 118;
int f = 36;
int g = 22;
double h = avgnumbers(e,f,g);
System.out.println(h);

	}
	
public static double avgnumbers(double a, double b, double c){
double d = (a + b + c) / 3;
return d;

}	
}

