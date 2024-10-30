package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String passWord;
    private String department;
    private int defaultPassLength = 8;
    private int mailBoxCapacity = 500;
    private String alternateEmail;

    // Email Constructor
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email created for: " + this.firstName +" "+ this.lastName);

        this.department = setDepartment();
        //System.out.println("Department specified for " + this.firstName +" "+ this.lastName+": " + this.department);

        this.passWord = randPassword(defaultPassLength);
        //System.out.println("Default Password: " + this.passWord);

        // Generate Email
        System.out.println("Email generated for the user: " + this.firstName + " " + this.lastName);
        System.out.println(this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "." + "company" + ".com");
        System.out.println("Default Password: " + this.passWord);
    }



    // Ask for the department
    private String setDepartment(){
        System.out.println("Enter the department\n1 Sales\n2 Development\n3 Accounting\n0 none ");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if (choice ==1){return "sales"; }
        else if (choice ==2){return "development";}
        else if (choice ==3){return "accounting";}
        else {return "";}
    }

    // Generating random password
    private String randPassword(int length){
        String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    // Set the alternate Email
    public void setAlternateEmail(String alterEmail){
    this.alternateEmail = alterEmail;
    }

    // Change the password
    public void changePassword(String newPass){
    this.passWord = newPass;
    }

}
