package credential;
import java.util.Scanner;

public class CredentialService {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private String company = "xyz.com";

    public CredentialService(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        this.department = generateDepartment();
        this.email = generateEmailAddress();
        this.password = generatePassword();
    }
    
    private String generateEmailAddress() {
    	email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company;
    	return email;
    }
    
    private String generatePassword() {
    	password = "agsDH@2423";
    	return password;
    }
    
    private String generateDepartment() {
        System.out.print("Please enter the department from the following \n" + "1. Technical \n2. Admin \n3. Human Resource \n4. Legal\n");
        Scanner in = new Scanner(System.in);
        
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "tech"; }
        else if (depChoice == 2) {return "admin";}
        else if (depChoice == 3) {return "hr";}
        else if (depChoice == 4) {return "legal";}
        else { return "";}
    }

    public String showCredentials() {
        return "Dear " + firstName +" your generated credentials are as follows \n" + "Email	 --->" + email + "\n"
        		+"Password --->" + password;
    }
}