package OOP;

/**
 * Created by kirstin on 28/01/2017.
 */
public class Zelda {

int elusid;

    public Zelda (int elu){
        elusid = elu;
    }

    public void kaklusKolliga(int kollilElusid) {
        elusid = elusid -kollilElusid;
    }

    public void prindiMituEluAlles() {
        System.out.println(elusid);
    }

    public void prindiKasOnElus() {
        if (elusid > 0){
            System.out.println("elus!");
        } else {
            System.out.println("ei ole elus!");
        }
    }
}
