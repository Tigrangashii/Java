
public class Asistenti extends Mesimdhenesi {

    private String llojiUshtrimeve;
    public Asistenti(String e,int vl,String llU){
        super(e, vl, "Ushtrime");
        llojiUshtrimeve=llU;
    }

    public String getLlojiUshtrimeve(){
        return llojiUshtrimeve;
    }
    public void setLlojiUshtrimeve(String llU){
        llojiUshtrimeve=llU;
    }


    @Override
    public String toString(){
         return "Asistenti" + super.toString() + llojiUshtrimeve;

     }


}

