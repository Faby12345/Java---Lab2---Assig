package Controler;

import Entities.Livada;
import Repository.Repository;

public class ControlerLivada {
    private final Repository repo;
    public ControlerLivada(Repository r){
        this.repo = r;
    }
    public int displayWithConditionTest(){
        int ans = 0;
        for(Livada l : repo.livada){
            if(l.varsta > 3){
                ans++;
            }
        }
        return ans;
    }
    public void displayWithCondition(){
        for(Livada l : repo.livada){
            if(l.varsta > 3){
                System.out.println(l);
            }
        }
    }
    public void display(){
        for(Livada l : repo.livada){
            System.out.println(l);
        }
    }
    public void add(Livada l){
        repo.add(l);
    }
    public void remove(int index){
        repo.remove(repo.livada.get(index));
    }



}
