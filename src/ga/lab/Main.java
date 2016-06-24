package ga.lab;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String charString;
        double summedDoubles;
        int middleValue;



        //Problem 1:
        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");

        //Problem 2:
        reversedOrder();

        //Problem 3:
        maxValue(new int[]{2, 52, 7, 91, 10, 12});
        maxValue(new int[]{12, 1, 11});
        maxValue(new int[]{0, 14});
        maxValue(new int[]{100, 23, 29, 101, 1});

        //Problem 4:

       /* _____ = sumOfValues(new double[]{12.1, 13.9, 7.0});
        //how do we print a variable to the command line

        _____ = sumOfValues(new double[]{1.23, 2.09, 9.2});
        //how do we print a variable to the command line

        _____ = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
        //how do we print a variable to the command line

        _____ = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        //how do we print a variable to the command line
*/

        //Problem 5:
        charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(charString);
        //how do we print a variable to the command line

        charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
        System.out.println(charString);
        //how do we print a variable to the command line

        charString = charsToString(new char[]{'I', ' ', 'a', 'm', ' '});
        System.out.println(charString);
        //how do we print a variable to the command line

        charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
        System.out.println(charString);
        //how do we print a variable to the command line

        //Problem 6:
        List<String> myStringList = new ArrayList<>();
        myStringList.add("cars");
        myStringList.add("toys");
        myStringList.add("books");
        myStringList.add("movies");
        myStringList.add("shows");

      /*  //Problem 7:
        reversedStringOrder;
/*
        //Problem 8:
        printOrAdd(/*use the List you created in problem 6/);

        //Problem 9:
        //Create an int array of an odd size, with the variable name 'oddSizedArray'
        //Make sure the size is at least 5.
/*
        //Problem 10:
        findMiddle(/*use the array you created in problem 9/);
        //how do we print a variable to the command line
/*
        findMiddle(new int[]{2, 7, 9, 12, 15});
        //how do we print a variable to the command line

        findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10});
        //how do we print a variable to the command line

        findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145});
        //how do we print a variable to the command line
*/


    }

    public static void stringLengthOrValue(String one) {

        if (one.length() > 5) {
            System.out.println(one);
        } else {
            System.out.println(one.length());
        }


    }

    public static void reversedOrder() {

        int[] number = new int[10]; //array


        for (int i = 0; i < number.length; i++) {
            number[i] = i;
        }

        for (int i = number.length -1; i >= 0; i--){ //begining, end, count
            System.out.println(number[i]);

        }

        //declare your functions
    }




    public static int maxValue(int [] name){

        int j = name[0];

        for(int i = 0; i < name.length; i ++){
            if(j >= name[i]){
                continue;

            }

            else {
                j = name[i];
            }

        }

        return j;



    }


    public static double sumOfValues(double [] summ){

        double k = summ[0];

        for(int i = 1; i < summ.length; i++){
           k = k + summ[i];

        }
        return k;
    }

    public static String charsToString(char [] command){

        String f = "";

        for(int i = 0; i < command.length; i++){
            f = f + command[i];
        }
        return f;

    }

    public static void reversedStringOrder(List<String>myStringList){


        for(int i = myStringList.size() - 1; i >= 0 ; i--){


            System.out.println(myStringList);

        }


int[] oddSizedArray = new int[7];


    }








}
