import java.util.ArrayList;

public class LecteurSon {

    ArrayList<JouableSon> lecteur;

    LecteurSon()
    {
        lecteur.get(0).jouerSon();
        // jouable son est une interface ... c'est un type mais pour construire
        JouableSon obj = new Bouton();
        obj.jouerSon();

    }

}
