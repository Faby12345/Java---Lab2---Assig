package Entities;

public class Par extends Livada{
    public Par(){}
    public Par(int var){
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
        return "Tip: Par " + "varsta: " + varsta + "\n";
    }
}
