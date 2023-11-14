public class Main {
    static String OriginalString = "programming is easy";
    static String NewString = "";

    public static void main(String[] args) {
        String Uppercase;

        //Getting rid of all spaces
        for(int i = 0; i < OriginalString.length(); i++){
            if(!OriginalString.substring(i, i+1).equals(" ")){
                NewString += OriginalString.substring(i, i + 1);
            }
        }

        ResetString();

        //Making every other letter capital and adding a space between each letter
        for (int i = 1; i <= OriginalString.length(); i++) {
            Uppercase = OriginalString.substring(i - 1, i);
            if (i % 2 == 0) {
                Uppercase = Uppercase.toUpperCase();
            } else {
                Uppercase = Uppercase.toLowerCase();
            }
            NewString += Uppercase + " ";
        }

        ResetString();
        System.out.println(OriginalString);

        //Getting rid of every other character until there is only 1 left.
        while (OriginalString.length() > 1) {
            for (int j = 0; j < OriginalString.length(); j+=2) {
                NewString += OriginalString.substring(j, j + 1);
            }

            ResetString();

            System.out.println(OriginalString);
        }
    }

    public static void ResetString() {
        //Resets Original String and New String
        OriginalString = NewString;
        NewString = "";
    }
}
