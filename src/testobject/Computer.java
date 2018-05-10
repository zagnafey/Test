package testobject;

public class Computer {

    private String name;

    private int ram;

    private int hdd;

    private double weight;

    public Computer(String name, int ram, int hdd, double weight) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName (String newName){
        name = newName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam (int newRam){
        if (newRam > 0) {
            ram = newRam;
        }else{
                System.out.println("Error ram < 0");
            }

        if (newRam ==100) {
            System.out.println("Error ram !=char");
        }
        }

    public int getHdd(int i){
        return hdd;
    }

    public void setHdd(int newHdd){
        hdd = newHdd;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void on(){
        System.out.println("i am on, my model "+name);
    }

    public void load() {
        System.out.println("i am loading, my hard drive capacity "+ram+" G");
    }

    public void off(){
        System.out.println("i am off "+hdd+" G");
    }

    public void weight(){
        System.out.println("I have "+weight+" kg");
    }


}
