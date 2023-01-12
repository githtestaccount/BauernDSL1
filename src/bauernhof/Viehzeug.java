package bauernhof;

import java.util.Objects;

public class Viehzeug {
    private final String art;
    private int stueckzahl;
    private int preis;
    private String handlung;


    public Viehzeug(String art) {
        if (Objects.equals(art, "Rind")) {
            this.art = "Rinder";
        } else if (Objects.equals(art, "Huhn")) {
            this.art = "Hühner";
        } else if (Objects.equals(art, "Schwein")) {
            this.art = "Schweine";
        } else {
            this.art = "Viecher";
        }
    }

    public Viehzeug stueckzahl(int stueckzahl) {
        this.stueckzahl = stueckzahl;
        return this;
    }

    public Viehzeug preis(int preis) {
        this.preis = preis;
        return this;
    }

    public Viehzeug handlung(String handlung) {
        this.handlung = handlung+"st";
        return this;
    }

    @Override
    public String toString() {
        return "Du " + this.handlung + " " + this.stueckzahl + " "
                     + this.art + " fuer " + this.stueckzahl*this.preis + " Euro.";
    }
}
