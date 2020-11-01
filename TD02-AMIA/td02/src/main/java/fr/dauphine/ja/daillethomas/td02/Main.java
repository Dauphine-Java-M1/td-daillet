package fr.dauphine.ja.daillethomas.td02;

class Main {
	
	public static void main(String[] args) throws Exception {
		
//		Mere mere=new Mere();
//		Mere mereFille=new Fille();
//		Fille fille=new Fille();
//
//		//mere.miage();
//		fille.miage();
//		//mereFille.miage();
//		((Fille)mereFille).miage();	
//
//		mere.a();
//		mereFille.a();
//		fille.a();
//		((Mere)mereFille).a();
//		mereFille.b(null);
//
//		mereFille.c();
//		mereFille.c(mere);
//		mereFille.c(mereFille);
//		mereFille.c(fille);
//		fille.c(fille);
//
//		mere.d();
//		mereFille.d();
//
//		mere.printF();
//		mereFille.printF();
//
//		mereFille.j();
//		mereFille.k();
//		mereFille.l();
//		mereFille.m();
		
		Expr val = new Value(1337.0);
		System.out.println(val.eval()); //affiche 1337.0
		
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval()); //affiche 1664.0
		
		Expr e = new Add(new Value(350.0), add);
		System.out.println(e.eval()); //affiche 2014.0
		
		Expr mult = new Mult(new Value(2), e);
		System.out.println(mult.eval()); //affiche 4028.0
		
		Expr sqrt = new Sqrt(mult);
		System.out.println(sqrt.eval()); //affiche 63.47

		System.out.println("---------------------------");
		
		System.out.println(val);
		System.out.println(add);
		System.out.println(e);
		System.out.println(mult);
		System.out.println(sqrt);
			
	}
}






