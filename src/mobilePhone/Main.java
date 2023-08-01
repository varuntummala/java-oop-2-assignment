package mobilePhone;

public class Main {
    public static void main(String[] args) {
    	
        // Instantiate a brand new MobilePhone object and pass it the 4 parameters for your phone (Brand, Model, Phone Number, and Storage Capacity)
        MobilePhone myPhone1 = new MobilePhone("iPhone","14","803-792-2439","256");

        
        // Call the makeCall() method using your phone object - remember to pass it a phone number as input!
        myPhone1.makeCall("803-693-2543");

        
        // Call the installApp() method using your phone object - remember to pass it an app name as input!
        myPhone1.installApp("TTS");

        
        // Display your phones information using the displayInfo() method!
        System.out.println(myPhone1);

    }
}
