/*
1.2. Krijoni klasën Profesori që është një Mësimdhënës që ka angazhimin “Ligjerata” dhe ka
atributin shtesë: thirrjaAkademike (p.sh Profesor i rregullt,Profesor i asocuar,Profesor asistent etj)
a)Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme.
b)Ofroni metodën që reprezenton në String një objekt të klasës Profesori në formatin:
Profesori <emri> : < vitiLindjes > mban <angazhimi>, ka thirrje <thirrjaAkademike
 */
public class Profesori extends Mesimdhenesi{
    //Atributti shtese
    private String thirrjaAkademike;

    // Profesori p1 = new Profesori("Tigran Gashi", 2000,"Ligjerata","Profesor i rregullt");
    public Profesori(String e,int vl,String a,String thA){

    //Per arsyje se keto 3 parametrat e pare jane atribute te mesimdhenesit me fjalen SUPER i dergojm kete parametra.
        super(e,vl,a);
        thirrjaAkademike=thA;
    }
         //Nje forme tjeter.
    /*
    // Profesori p1 = new Profesori("Lumbardh Gashi", 2000,"Ligjerata","Profesor i rregullt");
	// Profesori p2 = new Profesori("Edison Beqiri", 2001,"Ligjerata","Profesor i asocuar");

	public Profesori(String emri, int vl, String tha){
		super(emri,vl,"Ligjerata");  //Per arsyje se angazhimi nuk po ndryshon eshte i njejt nuk e dergojm si parameter.
		thirrjaAkademike = tha;
     */
            //Kur i qasem fjales super tek pjesa e angazhimit e dergojm "Ligjerata" si parameter sepse vlen per te dyja.
//a)Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
    public String getThirrjaAkademike(){
        return thirrjaAkademike;
    }
    public void setThirrjaAkademike(String thA){
        thirrjaAkademike=thA;
    }

/*
b)Ofroni metodën që reprezenton në String një objekt të klasës Profesori në formatin:
Profesori <emri> : < vitiLindjes > mban <angazhimi>, ka thirrje <thirrjaAkademike*/

    @Override
    public String toString(){
        return "Profesori " + super.toString() + " ka thirrje " + thirrjaAkademike;


       /* return "Profesori" + getEmri() + " : " + getVitiLindjes() + " mban " + getAngazhimi()
                + " ka thirrje " + thirrjaAkademike; */
    }



}
