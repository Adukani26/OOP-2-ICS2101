public class MainApplication {

    public static void main(String[] args) {
    
    Admin curAdmin = new Admin(1234, "Oliver", "2x1@674gdbe");
    
    User curUser = new User(4455, "Johnny");
    
    curAdmin.performOperation(new Update()); // Admin Updates the data.
    
    curUser.performOperation(new View()); // User can view the data.
    
    
    }
    
    }
    
    
