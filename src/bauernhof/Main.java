package bauernhof;

public class Main {
    public static void main(String[] args) {
        Viehzeug haendler1 = (new Viehzeug("Rind"))
                .handlung("kauf")
                .stueckzahl(2)
                .preis(1500);

        Viehzeug haendler2 = (new Viehzeug("Huhn"))
                .handlung("verkauf")
                .stueckzahl(20)
                .preis(5);

        System.out.println(haendler1);
        System.out.println(haendler2);
    }
}