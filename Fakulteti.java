
public class Fakulteti {
    private String drejtimi;
    public Mesimdhenesi [] vargu;
    public int index=0;


    public Fakulteti(String d,int kapacitetivargut){
        drejtimi=d;
        vargu = new Mesimdhenesi[kapacitetivargut];
    }

    public boolean ekziston(Mesimdhenesi m){
        for(int i=0; i<index; i++){
            if(vargu[i].equals(m)){
                return true;
            }
        }
        return false;
    }


    public void shtoMesimdhenesin(Mesimdhenesi m){
        if(m == null){
            System.out.println("Objekti eshte null");
            return;
        }
        if(index > vargu.length){
            System.out.println("Nuk ka vende te lira ne varg");
            return;
        }
        if(ekziston(m)){
            System.out.println("Mesimdhenesi ekziston");
            return;
        }
        vargu[index++] = m;
    }

    public Profesori profesoriMeiRi(){
        if(index == 0){
        System.out.println("Nuk ka asnje mesimdhenes ne varg");
        return null;
        }
        Profesori meiRi = null;
        for(int i = 0; i < index; i++){
            if(vargu[i] instanceof Profesori){

              
                if(meiRi == null || meiRi.getVitiLindjes() < vargu[i].getVitiLindjes()){
                    meiRi = (Profesori)vargu[i];
                }

            }

        }
        if(meiRi == null){
            System.out.println("Nuk ka asnje profesor ne varg");
        }
        return meiRi;

    }

/* e) Ofroni metodën shtypLlojinEUshtrimeve që i shtyp / afishon asistentët që kanë mbajnë
ushtrime të një lloji të caktuar. Lloji i ushtrimeve ti dërgohet metodës si parametër.*/
    public void shtypLlojinEUshtrimeve(String llu){
        if(index == 0){
            System.out.println("Nuk ka asnje mesimdhenes ne varg");
            return;
        }
        for(int i =0; i < index; i++){
            if(vargu[i] instanceof Asistenti){
                
                  
                Asistenti a = (Asistenti)vargu[i];
                if(a.getLlojiUshtrimeve().equals(llu)){
                    System.out.println(a);
                }
            }
        }

    }


      

    public static void main(String[] args) {
        Fakulteti f = new Fakulteti("Shkenca Kompjuterike", 15);

        Profesori p1 = new Profesori("Tigran Gashi", 1989, "Profesori", "Profesor i rregullt");
        Profesori p2 = new Profesori("Shpetim Gashi", 1970, "Profesori", "Profesor i rregullt");
        Profesori p3 = new Profesori("Arber Thaqi", 1980, "Profesori", "Profesor asistent");

        Asistenti a1 = new Asistenti("Egzon Pajaziti", 1995, "UL1");
        Asistenti a2 = new Asistenti("Agim Gashi", 1962, "Vizatim");
        Asistenti a3 = new Asistenti("Benis Gashi", 1998, "Muzik");

        f.shtoMesimdhenesin(p1);
        f.shtoMesimdhenesin(p2);
        f.shtoMesimdhenesin(p3);
        f.shtoMesimdhenesin(a1);
        f.shtoMesimdhenesin(a2);
        f.shtoMesimdhenesin(a3);


          

        Profesori iRi = f.profesoriMeiRi();
        System.out.println("profesori me i ri : " + iRi);


        f.shtypLlojinEUshtrimeve("Muzik");
        }

    }



















