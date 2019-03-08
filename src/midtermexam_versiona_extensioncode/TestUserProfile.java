package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author marth
 */
public class TestUserProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserProfile newprofile = new UserProfile();

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = in.nextLine();

        System.out.println("Please choose your choice of genre:\n");
        newprofile.printString(newprofile.getGenres());
        String genre = in.nextLine();

        newprofile.setUserID(name);
        newprofile.setGenre(genre);
        
        System.out.println("User profile was created.");

    }

}
