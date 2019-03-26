package Codes;

 class Mid1 {

	int n;
	Mid1(int d){
		n=d;
	}
	void c(int n){
		if(n%2==0)
		  System.out.println("Even0");
		else 
			System.out.println("odd");
	}
	int add(int n){
		if(n%2==0)
			n+=1000;
		else
			n+=2000;
		
		return n;
	}
	
	
	
}