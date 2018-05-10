package testproject;

import testobject.Computer;

public class Main {

    public static void main(String[] args) {
        Computer comp = new Computer("Lenovo", 8000, 120, 2.0);

       /* comp.setRam(4000);
       comp.setName("ACER");
        comp.setHdd(500);
        comp.setRam(100);*/

        comp.on();
        comp.load();
        comp.off();
        comp.weight();
    }
}
