package tp6ex2;
import java.util.Scanner;
import java.io.IOException;
public class Authentification {
	private final String LoginCorrect ="scott ";
	private final String PwdCorrect="tiger ";
	
	String getUserLogin() throws WrongLoginException,WrongInputLength,IOException{
		Scanner l = new Scanner(System.in);
        System.out.println("Quel est votre login? ");
        String login = l.nextLine();
        
        if(login.length()>10) {
        	throw new WrongInputLength("saisi dépasse 10 caractères");
        }
        if(!login.equals("scott")) {
        	throw new WrongLoginException("login incorrect");
        }
        return login;
        
	}
	
	
	String getUserPwd() throws WrongPwdException,WrongInputLength,IOException{
		Scanner p= new Scanner(System.in);
        System.out.println("Quel est votre pwd ");
        String pwd = p.nextLine();
        
        if(pwd.length()>10) {
        	throw new WrongInputLength("saisi dépasse 10 caractères");
        }
        if(!pwd.equals("tiger")) {
        	throw new WrongPwdException("pwd incorrect");
        }
        
        return pwd;
		
		
	}
	Authentification() throws WrongLoginException,WrongPwdException, WrongInputLength,IOException{
		getUserLogin();
		getUserPwd();
	}
	

}
