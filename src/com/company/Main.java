package com.company;

import java.util.Locale;
import java.util.Scanner;
/*Кундорго enum тузунуз (Monday, Tuesday ...)
консолдон бир кунду белгилениз .
Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм" же Tuesday болсо - анда "Шейшемби куну англис тили сабагын окуйм"
деп кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
Жуманын кундорун кыргыз тилинде корсотунуз.*/
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String week = scanner.nextLine();
        try {
            System.out.println(Weekday.valueOf(week.toUpperCase(Locale.ROOT)));
        }catch (IllegalArgumentException a){
            System.out.println("Enter the correct query: "+week);
        }


    }




}
