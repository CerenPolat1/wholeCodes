package day11_whileLoop;

public class c1_continueStatements {

    public static void main(String[] args) {

        //break will stop loop
        //continue will only skip ccurrent iteration

        for (int i =0 ; i < 5 ;i++){//0
            System.out.println("Before Break");//0 1 2

            if (i==2){

                break;//when java reachs here it will break the loop //2
                // System.out.println("After Break"); unreachable statement

            }
            System.out.println("After if");//0 1

        }
        System.out.println("$$$$$$$$$$$$");

        /////////////////////////
        //starting point 0, ending point 5, repeat= before break= until the end,
        // but =after if= should last until 2 times.

        for(int ib=0 ; ib<5; ib++){
            System.out.println("before break " +ib);

            if(ib==2){
                break;
            }
            System.out.println("after break"+ ib);
        }





        System.out.println("****************");
        for (int i = 0 ; i<5 ;i++){ //0
            System.out.println("Before continue "+ i);//0 1 2 3 4

            if (i==2){
                continue;
            }
            System.out.println("after Continue " + i);//0 1  3  4
        }
        System.out.println("***************");

        ////////
        //starting point 0, ending point 5. iteration +1. before continue last at the end
        //  but after continue lasts 2 times

        for (int b=0; b<5; b++){
            System.out.println("before continue"+ b);

            if(b==2){
                continue;
            }
            System.out.println("after continue"+b);
        }







        //print only even numbers from 1 - 10
        //first way you can just look for if (i%2==0) then print  i number
        //second way you can skip the odd numbers by using continue statement

        for (int i=1 ; i <= 10 ; i++){

            //System.out.println(i); if you print before checking if condtiton it will print everyting
            if (i % 2 != 0){//this will be true for odd numbers
                //which i want to skip odd numbers and print only even numbers
                continue;//this will skip odd numbers such as 1,3,5,7,9
            }
            System.out.println(i);//we print here to make sure numbers has checked by our if condition

        }

        //// create a java logic that will not print numbers that are divisible both by 2 and 3 from 1 to 20
        //        // anything left should  be priented
        //        // use continue statement
        // 1 2 3 4 5   ...

        ///output should not include 6 ,12 and 18 beacause they are divisible by 2 and 3 at same time

        System.out.println("*****************");
        //starting point 1
        //ending point 20

        //i <=20 or i < 21
        for (int i = 1 ; i < 21 ; i++){
            if (i %2 == 0 && i%3==0){//this means numbers are divisibile by 2 and 3 at same time
                //which we dont want them printed
                //if you want to skip them
                continue; // 6 12 18 skipped
            }
            System.out.print(i + " , ");

        }

        for(int d1=1; d1<10; d1++){
            if(d1%2==0 && d1%3==0){
                continue;
            }
            System.out.print( " , "+ d1);
        }





    }
}

