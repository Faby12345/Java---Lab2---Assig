package Entities;

public class Livada {
    static String name = "Livada Cluj";
    int latime;
    int lungime;
    public int varsta;
    public Livada(){}
    public Livada(String name,int lat, int lun){
        this.name = name;
        this.latime = lat;
        this.lungime = lun;
    }
    public static String getName(){
        return name;
    }
    public static void setName(String name){
        Livada.name = name;
    }
    public int getLatime(){
        return latime;
    }
    public int getLungime(){
        return lungime;
    }
    public void setLatime(int latime){
        this.latime = latime;
    }
    public void setLungime(int lungime){
        this.lungime = lungime;
    }
    public int getVarsta(){
        return varsta;
    }
    public void setVarsta(int varsta){
        this.varsta = varsta;
    }

    public String toString(){
        return "Livada: " + name + " latime: " + latime + " lungime: " + lungime;
    }



}
