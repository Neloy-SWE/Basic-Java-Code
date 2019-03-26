package Codes;

public class NasaAPP {
	
	double tpb,tp;
	NasaAPP(double n,double m){
		tpb=n;
		tp=m;
		
	}
	double sum(double tpb,double vp){
		double sum=tpb+vp;
		return sum;
	}
	void cmp(double tb,double sum){
		if(tb<sum)
			System.out.println("project  can be done");
		
	}
	
	
	
	
	

}
