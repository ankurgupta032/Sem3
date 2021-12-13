package Live;

import Music.Playable;
import Music.String.Veena;
import Music.Wind.Saxophone;

public class Test{
    public static void main(String[] args) {
        Veena v = new Veena();
        v.play();
        Saxophone s = new Saxophone();
        s.play();
        s.display();
        Playable p = v;
        p.play();
        Playable o = s;
        o.play();

    }
}
