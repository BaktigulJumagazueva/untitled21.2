package com.company;

    public class Car implements AutoCloseable {
        public void close(){
            System.out.println("Машина жабылып жатат");
        }
        public static void drive(){
            System.out.println("Mашина журуп жатат");
        }
    }


