package tp6;

public class NegatifException extends Exception {
	public void  alerte() {
		System.out.println(super.getMessage()+ "on ne peut pas calculer une racine pour un reel negatif !!!!!!");
		}

}
