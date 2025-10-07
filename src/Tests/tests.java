import Controler.ControlerLivada;
import Entities.Cires;
import Entities.Livada;
import Entities.Mar;
import Entities.Par;
import Repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class tests {
    List<String> l = new ArrayList<>();
    Mar m1 = new Mar(3);
    Mar m2 = new Mar(5);
    Mar m3 = new Mar(7);
    Par p1 = new Par(3);
    Par p2 = new Par(5);
    Par p3 = new Par(7);
    Cires c1 = new Cires(3);
    Cires c2 = new Cires(5);
    Cires c3 = new Cires(7);
    List<Livada> l1 = new ArrayList<>();
    Repository repo = new Repository(l1);

    ControlerLivada controler;
    public void test(){
        repo.add(m1);
        repo.add(m2);
        repo.add(m3);
        repo.add(p1);
        repo.add(p2);
        repo.add(p3);
        repo.add(c1);
        repo.add(c2);
        repo.add(c3);
        controler = new ControlerLivada(repo);


        int ans = controler.displayWithConditionTest();

//        assert ans == 6 : "Test 1 failed, expected 6 but got " + ans;
//        System.out.println("Test 1 passed");

        if(ans == 6){
            System.out.println("Test 1 passed");
        }
        else{
            throw new RuntimeException("Test 1 failed");
        }


    }
}
