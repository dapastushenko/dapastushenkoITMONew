package Patterns;

import java.util.Objects;

abstract class CarFactory {
    static CarFactory JPFactory;
    static CarFactory DEFactory;
    static CarFactory RUFactory;

    public static CarFactory getFactory(String reg) {
       if(Objects.equals(reg, "JP")){
            if (JPFactory == null)
               JPFactory = new JapanFactory();

            return JPFactory;
       }
        else if (Objects.equals(reg, "DE")){
            if (DEFactory==null)
                DEFactory = new GermanFactory();
            return DEFactory;
        }
        else{
            if (RUFactory==null)
                RUFactory= new RussianFactory();
            return RUFactory;
        }

    }

    public abstract Car createCar();

 }
