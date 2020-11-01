package fr.dauphine.ja.daillethomas.td02;

import java.io.IOException;

public class Fille extends Mere {
	
	void miage() {
		System.out.println("Miage");
	}

	@Override
	public void a() {
		System.out.println("Fille_a"); }

	@Override
	protected void b(Fille fille) {
		System.out.println("Fille_b(Fille)");}
	
	@Override
	public void c(Mere mere) {
		System.out.println("Fille_c(Mere)");}
	
	void c(Fille b) {
		System.out.println("Fille_c(Fille)"); }

	static void d() {
		System.out.println("static Fille_d");}
	
	static void d(Mere mere) {
		System.out.println("Fille_d(Mere)");}


	
	protected void f() {
		System.out.println("Fille_f");}

	@Override
	String g() {
		System.out.println("Fille_g"); return "c";}

	@Override
	void j() throws IOException {
		System.out.println("Fille_j");  }
	
	@Override
	void l() {
		System.out.println("Fille_l");}
	
	@Override
	void m() throws IOException, IllegalArgumentException {
		System.out.println("Fille_m");  }

	
}

