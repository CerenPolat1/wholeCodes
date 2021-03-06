
package day21_CustomClasses;

import java.util.ArrayList;

public class ShoeObject {

    public static void main(String[] args) {
        //create an object from Shoe class
        //ArrayList<>  list     =  new ArrayList<>();
        //  Class     refName           OBJECT

        Shoe shoe1=new Shoe();
        //since shoe is in same package with shoeobject no need import
        // if it is not in same package you will need to import

        System.out.println("shoe1.brand = " + shoe1.brand);//null
        System.out.println("shoe1.size = " + shoe1.size);//0
        System.out.println("shoe1.color = " + shoe1.color);//null

        shoe1.wear();//Person is wearing  null

        shoe1.getShoeInfo();//null , 0 , null

        shoe1.color="green";
        System.out.println("shoe1.color = " + shoe1.color);
        shoe1.brand="nike";
        System.out.println("shoe1.brand = " + shoe1.brand);
        shoe1.size=9;

        shoe1.wear(); // Person is wearing  nike
        shoe1.getShoeInfo(); // nike , 9 , green
                            //brand, size, color

        System.out.println(shoe1); //nike/green/9
        shoe1.setShoeInfo("ac",9,"pink"); //neden run etmedi cunku methodun icinde println yok

//        //neden bu sirayla aldi cunku yanda ustte asagidakini yazmisiz
//        System.out.println("shoe1.brand = " + shoe1.brand);//null
//        System.out.println("shoe1.size = " + shoe1.size);//0
//        System.out.println("shoe1.color = " + shoe1.color);//null
    }
}