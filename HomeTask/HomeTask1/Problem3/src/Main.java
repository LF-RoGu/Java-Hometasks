// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String text = "To be or not to be, that is the question;"
                +"Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";
        String lowerCaseText = text.toLowerCase();
        int     spaces = 0,
                vowels = 0,
                letters = 0;

        for(int i = 0; i < lowerCaseText.length(); i++)
        {
            char l_varCharFromText = lowerCaseText.charAt(i);

            if(l_varCharFromText == ' ')
            {
                spaces++;
            }
            else if ((l_varCharFromText >= 'a') || (l_varCharFromText <= 'z'))
            {
                if(
                        (l_varCharFromText == 'a') ||
                        (l_varCharFromText == 'e') ||
                        (l_varCharFromText == 'i') ||
                        (l_varCharFromText == 'o') ||
                        (l_varCharFromText == 'u')
                )
                {
                    vowels++;
                }
                else {
                    letters++;
                }
            }
        }
//YOUR CODE HERE
        System.out.println("The text contained vowels: " + vowels);
        System.out.println("The text contained constants: " + letters);
        System.out.println("The text contained spaces: " + spaces);
    }
}