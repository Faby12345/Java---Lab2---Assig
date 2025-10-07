package Repository;

import Entities.Livada;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Repository implements RepoInterface{
    public List<Livada> livada = new ArrayList<>();
    public Repository(){}
    public Repository(List<Livada> l){
        this.livada = l;
    }
    @Override
    public void add(Livada l) {
        livada.add(l);
    }
    @Override
    public void remove(Livada l) {
        livada.remove(l);
    }
    @Override
    public void display() {
        for(Livada l : livada){
            l.toString();
        }
    }
}
