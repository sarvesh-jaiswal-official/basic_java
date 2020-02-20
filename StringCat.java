class StringCat
{
	public static void main(String args[])
	{
		String fn, mn, sn, fulln, fin;
		
		fn = args[0];
		mn = args[1];
		sn = args[2];
		
		fulln = fn.concat(mn);
		fin = fulln.concat(sn);
		
		System.out.println("Full Name= "+fin);
	}
}