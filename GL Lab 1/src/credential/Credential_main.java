package credential;

public class Credential_main  {
    public static void main(String[] args) {
    	CredentialService cred = new CredentialService("Rajdeep", "Roy");
        System.out.println(cred.showCredentials());
    }
}
