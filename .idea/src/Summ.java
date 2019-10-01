import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Summ {

    int  numOfNumbersInNumber = 0;
    ArrayList<Integer> numList = new ArrayList <> ();


    void logic(){                                     //метод узнает разрядность числа и заносит каждое число в коллекцию
        Scanner scanner = new Scanner (System.in);
        System.out.println ("input number" );
        int s =  scanner.nextInt ();
        numOfNumbersInNumber = (int) Math.log10(s)+1;   //узнаем разрядность
        //десятичный логарифм - в какую степень нужно возвести 10 что бы получить s +1
        //int отбрасывает знаки после запятой
        System.out.println ("разрядность числа="+numOfNumbersInNumber );

        for (int i = 1; i <=numOfNumbersInNumber ; i++) {
            switch (i){
                case 1:
                    numList.add (s%( (int)Math.pow (10,i)));
//                    System.out.println ("case1" );
//                    System.out.println (numList.get (0) );
//                    System.out.println ("i="+i );
                    break;
                case 2:
                    numList.add (s%( (int)Math.pow (10,i))/10);
//                    System.out.println ("case2" );
//                    System.out.println (numList.get (1) );
//                    System.out.println ("i="+i );

                    break;
                default:
                    numList.add (s%( (int)Math.pow (10,i))/((int)Math.pow (10,i-1)));
//                    System.out.println ("default" );
//                    System.out.println (numList.get (i-1 ));
//                    System.out.println ("i="+i );
                    break;
            }
        }
    }


    int summ(){                                                   //метод берет числа из коллекции и складывает их
        int s=0 ;
        for (int i = 0; i <numList.size () ; i++) {

            s+= numList.get (i);

        }
        return s;
    }


}

