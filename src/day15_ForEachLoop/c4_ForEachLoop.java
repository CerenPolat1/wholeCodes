package day15_ForEachLoop;

public class c4_ForEachLoop {

    public static void main(String[] args) {
        //loop types
        //for loop
        //while loop
        //do while loop
        //for each loop

        int [] numbers={1,2,3,4,5};

        for (int eachNumber : numbers){
            //for each loop will store each element from the numbers list in each iteration from first one to last one
            System.out.println(eachNumber);
        }

        String [] names= { "Yad" , "Mesut" , "Ozgur"};

        for (String name : names){
            System.out.println(name);
        }

        String sentence="Hello world java is here";
        //split method to store everything in the array
        String [] words=sentence.split(" "); //splitin icinde space var o yuzden kelime kelime aliyor
                                                   //eger split("") soyle dersen harf harf verir
                                                   //dikkat ettt!!!!!

        System.out.println("......");
        for (String word : words ){
            System.out.println("..."+ word);
        }
        System.out.println(".............");
        //for each loop doesnt need to have starting and ending point
        //it will check everything you have in the list,arrray

        for (int i = 0 ; i < words.length ; i++){  //second way to solve the problem
            System.out.println(words[i]);
        }
        System.out.println("...............");

        int [] numberList={1,2,5,20,4,-8,9,100};
        for (int number : numberList) { // 0 ... lastindex
            System.out.println("hello");
            System.out.println(number);
        }

    }
}