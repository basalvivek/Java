//import java.util.Calendar;
//import java.util.Date;
//import static java.lang.Thread.sleep;

public class Check {

    public static void main(String[] args) throws InterruptedException {

// Character to ASCII
        char letter = 'A';
        int letterValue = (int) letter;
        System.out.println("Character to ASCII : "+letterValue);
// ASCII to Character
        int unicodeValue = 65;
        char letter_1 = (char) unicodeValue;
        System.out.println("ASCII to Character : "+letter_1);

//Unicode to Character
        char letter_2 = '\u0041';
        System.out.println("Unicode to Character : "+letter_2);

//Upper and Lower predefined functions
        String txt = "Hello There";
        System.out.println("Upper Case String : " +txt.toUpperCase());
        System.out.println("Lower Case String : " +txt.toLowerCase());


//Upper to Lower and Lower to Upper conversion
        String originalString = "This Is Test String";
        String originalString_New=""; //Doubt to ask

        for (int i = 0; i < originalString.length(); i++) {
            char c = originalString.charAt(i);

            if (Character.isUpperCase(c))
            {
                //System.out.println("First If"+originalString);
                originalString_New += Character.toLowerCase(c);
            }

            else if (Character.isLowerCase(c))
            {
                //System.out.println("Second If"+originalString);
                originalString_New += Character.toUpperCase(c);
            }
            else
            {
                originalString_New = originalString_New+c;
            }
        }
        System.out.println("Upper to Lower and Lower to Upper conversion : "+originalString_New);

//Printing ASCII Values
        for(int i = 65; i <= 90; i++)
        {
            System.out.println(" The ASCII value of " + (char)i + " = " + i);//Upper Case
            System.out.println(" The ASCII value of " + (char)(i+32) + " = " + (i+32)); //Lower Case
        }
/*
// Date and Times in Java
        long start = System.currentTimeMillis();
        // some time passes
        sleep(1000);
        long end = System.currentTimeMillis();

        long elapsedTime = end - start;

        System.out.println("start : "+start);
        System.out.println("end : "+end);
        System.out.println("elapsedTime : "+elapsedTime);
//Nano Time
        long nanostart = System.nanoTime();
        // some time passes
        sleep(1000);
        long nanoend = System.nanoTime();
        long nanoelapsedTime = nanoend - nanostart;

        System.out.println("nano start : "+nanostart);
        System.out.println("nano end : "+nanoend);
        System.out.println("nano elapsedTime : "+nanoelapsedTime);

        //Date

        java.util.Date date = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day_of_month = cal.get(Calendar.DAY_OF_MONTH);
        int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
        int day_of_year = cal.get(Calendar.DAY_OF_YEAR);

        System.out.println("Current Date   : "+date);
        System.out.println("Month          : "+month);
        System.out.println("Year           : "+year);
        System.out.println("Day_of_month   : "+day_of_month);
        System.out.println("Day_of_week    : "+day_of_week);
        System.out.println("Day_of_year    : "+day_of_year);
*/
    }
}