package com.company;

import java.io.IOException;
import java.util.Arrays;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws IOException{

        try (Car car = new Car()){

            Car.drive();
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){

        }
    }
}
