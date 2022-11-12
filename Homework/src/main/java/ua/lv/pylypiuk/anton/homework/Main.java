package ua.lv.pylypiuk.anton.homework;

public class Main {
    public static void main(String[] args) {
        SamsungPhone ourSamsungPhone = new SamsungPhone();
        NokiaPhone ourNokiaPhone = new NokiaPhone();

            System.out.println("samsung can operate such functions : \n");
            ourSamsungPhone.call();
            ourSamsungPhone.sendMassages();
            ourSamsungPhone.takePicture();
            ourSamsungPhone.sendMassages();
            ourSamsungPhone.makeVideo();
            System.out.println("samsung can operate such functions : \n");
            System.out.println(ourSamsungPhone);
            System.out.println("NokiaPhone can operate such functions : \n");
            ourNokiaPhone.call();
            ourNokiaPhone.sendMassages();
        }
    }
