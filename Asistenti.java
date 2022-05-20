/*
1.3.Krijoni klasën Asistenti që është një Mesimdhenesi që ka angazhimin “Ushtrime”dhe ka atributin
shtesë: llojiUshtimreve (p.sh. Numerike, Laboratorike, etj.)
a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme.
b) Ofroni metodën që reprezenton në String një objekt të klasës Asistenti në formatin:
Asistenti <emri> : < vitiLindjes > mban <angazhimi> <llojiUshtrimeve>
 */

public class Asistenti extends Mesimdhenesi {

    private String llojiUshtrimeve;

    ////Asistenti a1 = new Asistenti("Tigran Gashi", 2000, "Ushtrime", "numerike");
    public Asistenti(String e,int vl,String llU){
        super(e, vl, "Ushtrime");
        llojiUshtrimeve=llU;
    }

//a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme.
    public String getLlojiUshtrimeve(){
        return llojiUshtrimeve;
    }
    public void setLlojiUshtrimeve(String llU){
        llojiUshtrimeve=llU;
    }


/*b) Ofroni metodën që reprezenton në String një objekt të klasës Asistenti në formatin:
        Asistenti <emri> : < vitiLindjes > mban <angazhimi> <llojiUshtrimeve>  */
    @Override
    public String toString(){
         return "Asistenti" + super.toString() + llojiUshtrimeve;

     }


}

