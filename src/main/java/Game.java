enum Waza {
    rock,
    paper,
    scissors;

    int id() {
        if (this == rock) return 0;
        if (this == paper) return 1;
        return 2;
    }
}

enum Kekka {
    p1,
    p2,
    draw
}

public class Game {
    Boolean valid(String s) {
        for (Waza w : Waza.values())
            if (w.toString().equals(s))
                return true;
        return false;
    }
    // return 0: Draw, 1: P1 win, 2: P2 win
    Kekka duel(Waza w1, Waza w2) {
        int dif = w1.id() - w2.id();
        if (Math.abs(dif) == 2) dif = ((dif / 2) * -1);
        if (dif ==  1) return Kekka.p1;
        if (dif == -1) return Kekka.p2;
        return Kekka.draw;
    }
}
