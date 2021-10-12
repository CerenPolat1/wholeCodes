package day22_CustomClasses_StaticVariables;

public class Car {

    String brand; // instance variable
    int modelYear; // instance
    static boolean hasEngine=true; //static variable

    //eger multiple copy yaratmayacaksan, static variables kullan cunku staticte tum variablelar tek copy alir bastan sona tek value kalir!!
    //such as folderpaths ,envriomentName , specific url

    //set to details
    public void setCarInfo(String brand ,int modelYear){

        this.brand=brand;  //mor olan brand instance
        this.modelYear=modelYear;
    }

    //create a method that will print only brand name
    public String brandName(){
        return brand;
    }
    //to return hasengine
    public static boolean isHasEngine(){
        return hasEngine;
    }


    public String toString(){
        return brand + " ::::: " + modelYear + " ::::::  has engine : " + hasEngine;
    }

}