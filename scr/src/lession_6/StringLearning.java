package lession_6;

import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
        String mypass = "123myasswword";
         char[] myChac = mypass.toCharArray();
        System.out.println(Arrays.toString(myChac));

        int dìgiCount, lowerCaseCount, upperCaseCount;
        dìgiCount= lowerCaseCount=upperCaseCount=0;
        for (char character : myChac) {
            if(Character.isDigit(character))
                dìgiCount++;
            else if (Character.isLowerCase(character))
                lowerCaseCount++;
            else if (Character.isUpperCase(character))
                upperCaseCount++;

            }
        if (dìgiCount >0 && lowerCaseCount >0 && upperCaseCount >0)
            System.out.println("You are all sett");
        else
            System.out.println("Password format is invalid....");
        //Immutable
        String badword = "con chó, con mèo";
        String badword1 = "hư nè...hư nè";
        String filterStr= badword.replace("con", "c**");
        String filterStr1= badword1.replace("hư", "h*");
        System.out.println(filterStr);
        System.out.println(filterStr1);


        //subString, indexOf, split
        String url = "https://google.com";
        System.out.println(url.substring(0, 5));
        System.out.println(url.substring(8));

        System.out.println(url.indexOf("o"));
        System.out.println(url.indexOf("https"));

        String[] split = url.split("o");
        System.out.println(Arrays.toString(split));

    }

}
