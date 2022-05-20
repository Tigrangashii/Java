/*
1.1.Krijoni klasën Mesimdhenesi që ka tri atribute:
emri[readonly], vitiLindjes si dhe angazhimi (p.sh. Ligjerata, Ushtrime, etj.)
a) Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet.
b) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
c) Ofroni metodën që reprezenton në String një objekt të klasës Mesimdhenesi në formatin:
<emri> : <vitiLindjes> mban <angazhimi>
d) Ofroni metodën për krahasimin e dy objekteve Mesimdhenesi për barazi.
Veni re: Dy mësimdhënës janë të njëjtë nëse kanë emrin dhe vitin e lindjes të njëjtë. */

/*1.1.Krijoni klasën Mesimdhenesi që ka tri atribute:
        emri[readonly], vitiLindjes si dhe angazhimi (p.sh. Ligjerata, Ushtrime, etj.)*/
public class Mesimdhenesi {
    private String emri;
    private int vitiLindjes;
    private String angazhimi;

//a) Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të gjitha atributet.
    public Mesimdhenesi(String e, int vl, String a) {
        emri = e;
        vitiLindjes = vl;
        angazhimi = a;
    }

//b) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
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

/* c) Ofroni metodën që reprezenton në String një objekt të klasës Mesimdhenesi në formatin:
               <emri> : <vitiLindjes> mban <angazhimi>                                     */
    @Override
    public String toString() {
        return emri + " : " + vitiLindjes + " mban " + angazhimi;
    }

/* d) Ofroni metodën për krahasimin e dy objekteve Mesimdhenesi për barazi.
Veni re: Dy mësimdhënës janë të njëjtë nëse kanë emrin dhe vitin e lindjes të njëjtë. */
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
