import Controler.ControlerLivada;
import Repository.Repository;
import View.View;

/*
text: 6. Intr-o livada cresc meri, peri si ciresi.
Sa se afiseze toti pomii frunctiferi mai batrini
de 3 ani.
 */
public class Main {
    public static void main(String[] args) {
//        Tests.tests t = new Tests.tests();
//        t.test();

        View view = new View(new ControlerLivada(new Repository()));
        view.start();
    }
}