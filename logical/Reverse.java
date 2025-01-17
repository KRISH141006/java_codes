class Reverse{
	public static void main(String []args){
		int n = Integer.parseInt(args[0]);
		int r,t=0;
		for(;n>0;){
			r=n%10;
			n=n/10;
			t=t+r;
		}
		System.out.println("rev = "+ t);
		
	}
}