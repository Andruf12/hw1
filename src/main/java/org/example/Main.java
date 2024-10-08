package org.example;

public class Main {
    public static void main(String[] args) {
            sum();
            min(6, 5);

        }
    public static void sum(){
        int a = 5;
        int b = 5;
        System.out.println(a+b);
    }
    public static void min(int a, int b){
        if (a > b){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
}
