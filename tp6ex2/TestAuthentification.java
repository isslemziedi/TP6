package tp6ex2;

import java.io.IOException;

public class TestAuthentification {

	public static void main(String[] args) {
		boolean erreur=false;
	
		do {
			try {
				Authentification a = new Authentification();
				erreur = true;	
			}
			catch(WrongLoginException e) {
				System.out.println("erreur");
				e.getMessage();
				e.printStackTrace();
			}
			catch(WrongPwdException e) {
				System.out.println("erreur");
				e.getMessage();
				e.printStackTrace();
			}
			catch(WrongInputLength e) {
				System.out.println("erreur");
				e.getMessage();
				e.printStackTrace();
			}
			catch(IOException e) {
				System.exit(0);
			}
			finally { 
				System.out.println("bloc finally exécuté quel que soit le résultat d execution");
			}
		}
		while(!erreur);

	}

}
