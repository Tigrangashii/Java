
public class Profesori extends Mesimdhenesi{
    //Atributti shtese
    private String thirrjaAkademike;

    public Profesori(String e,int vl,String a,String thA){

    //Per arsyje se keto 3 parametrat e pare jane atribute te mesimdhenesit me fjalen SUPER i dergojm kete parametra.
        super(e,vl,a);
        thirrjaAkademike=thA;
    }
         
	public Profesori(String emri, int vl, String tha){
		super(emri,vl,"Ligjerata");  
		thirrjaAkademike = tha;
     */

    public String getThirrjaAkademike(){
        return thirrjaAkademike;
    }
    public void setThirrjaAkademike(String thA){
        thirrjaAkademike=thA;
    }



    @Override
    public String toString(){
        return "Profesori " + super.toString() + " ka thirrje " + thirrjaAkademike;


     
    }



}
