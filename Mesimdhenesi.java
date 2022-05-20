
public class Mesimdhenesi {
    private String emri;
    private int vitiLindjes;
    private String angazhimi;


    public Mesimdhenesi(String e, int vl, String a) {
        emri = e;
        vitiLindjes = vl;
        angazhimi = a;
    }

    public String getEmri() {
        return emri;
    }

    public void setVitiLindjes(int vl) {
        vitiLindjes = vl;
    }

    public int getVitiLindjes() {
        return vitiLindjes;
    }

    public void setAngazhimi(String a) {
        angazhimi = a;
    }

    public String getAngazhimi() {
        return angazhimi;
    }


    @Override
    public String toString() {
        return emri + " : " + vitiLindjes + " mban " + angazhimi;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Mesimdhenesi) {
            Mesimdhenesi krahasues = (Mesimdhenesi) obj;
            if (emri.equals(krahasues.getEmri()) && vitiLindjes == krahasues.getVitiLindjes()) {
                return true;
            }
        }
        return false;


    }
}
