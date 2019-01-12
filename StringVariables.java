public class StringVariables {

    
    public static void main(String[] args) {
        String myString = "Sabaragamuwa University";
        int myStringLength = myString.length();
        String myStringinLowerCase = myString.toLowerCase();
        String myStringinUpperCase = myString.toUpperCase();
        String myName = "Gayathri " + "Buddhika";
        
        System.out.println(myString);
        System.out.println(myStringLength);
        System.out.println(myStringinLowerCase);
        System.out.println(myStringinUpperCase);
        System.out.println(myName);
        System.out.println(myString.replace('a', 'e'));
        System.out.println(myString.indexOf('U'));
    }
    
}