package Entities;

public class Mar extends Livada{

    public Mar(){}
    public Mar(int var){
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
        return "Tip: Mar " + "varsta: " + varsta + "\n";
    }

}
