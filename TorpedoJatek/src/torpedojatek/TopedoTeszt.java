package torpedojatek;

public class TopedoTeszt {
    public static void main(String[] args) {
        tesztLoves(4);
    }
    
    public static String tesztLoves(int poz){
        Hajo hajo = new Hajo();
        String t = hajo.talalat(poz);
        assert t.equals("talált"): "Nem jó a találat ellenőrzés!";
        System.out.println(t);
        return t;
    }
}