package tp6;

public class testMathematique {

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
	
		try{
			double n=Double.parseDouble(arg[0]);
			double x=Double.parseDouble(arg[1]); 
			Mathematique.f(n,x);
		}
			catch(NumberFormatException e) {
				System.out.println("Les arguments doivent etre des nombres! ");
				e.getMessage();
				e.getStackTrace();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne ");
			}
			catch(ArithmeticException a) {
				System.out.println("impossible de faire une division par zéro ! ");
			}
			catch(ParametreNullException e) {
				System.out.println(e.getMessage());
			}
			catch (NegatifException e) {
				System.out.println("Erreur");
				e.alerte();
			}
			finally { 
				System.out.println("bloc finally exécuté quel que soit le résultat d execution");
			}
		
		
	}
}
