package Entities;

public class Cires extends Livada{
    public Cires(){}
    public Cires(int var){
        this.varsta = var;
    }
    @Override
    public int getVarsta(){
        return varsta;
    }
    @Override
    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
    public String toString(){
        return "Tip: Cires " + "varsta: " + varsta + "\n";
    }
}
