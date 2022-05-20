/*
1.4.Krijoni klasën Fakulteti që ka atributin drejtimi, dhe përmban një varg ku do të ruhen si profesorë
ashtu edhe asistentë.
a) Ofroni konstruktorin e kësaj klase, i cili pranon drejtimin si dhe numrin e mësimdhënësve të
fakultetit.
b) Ofroni metodën ekziston e cila tregon nëse në mësimdhënës jep mësim në fakultet.
Mësimdhënësi ti dërgohet metodës si parametër.
c) Ofroni metodën shtoMesimdhenesin që e shton një mësimdhënës në varg nëse ai veç se nuk
ekziston dhe ka vend në varg.
d) Ofroni metodën profesoriMeIRi që e kthen profesorin e parë më të ri në fakultet.
e) Ofroni metodën shtypLlojinEUshtrimeve që i shtyp / afishon asistentët që kanë mbajnë
ushtrime të një lloji të caktuar. Lloji i ushtrimeve ti dërgohet metodës si parametër.
f) Ofroni metodën main ku do të krijohet një instancë e klasës Fakulteti me drejtim “Shkenca
Kompjuterike”, me mundësi të ruajtjes së 15 mësimdhënësve dhe shtoni disa profesorë dhe
disa asistentë.
g) Të testohen metodat ekziston, profesoriMeIRi dhe shtypLlojinEUshtrimeve.
 */

/*1.4.Krijoni klasën Fakulteti që ka atributin drejtimi, dhe përmban një varg ku do të ruhen si profesorë
      ashtu edhe asistentë.*/
public class Fakulteti {
    private String drejtimi;
    public Mesimdhenesi [] vargu;
    public int index=0;

//a) Ofroni konstruktorin e kësaj klase, i cili pranon drejtimin si dhe numrin e mësimdhënësve të fakultetit.
    public Fakulteti(String d,int kapacitetivargut){
        drejtimi=d;
        vargu = new Mesimdhenesi[kapacitetivargut];
    }
/* b) Ofroni metodën ekziston e cila tregon nëse në mësimdhënës jep mësim në fakultet.
     Mësimdhënësi ti dërgohet metodës si parametër. */
    public boolean ekziston(Mesimdhenesi m){
        for(int i=0; i<index; i++){
            if(vargu[i].equals(m)){
                return true;
            }
        }
        return false;
    }

/* c) Ofroni metodën shtoMesimdhenesin që e shton një mësimdhënës në varg nëse ai veç se nuk
ekziston dhe ka vend në varg.   */
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

//d) Ofroni metodën profesoriMeIRi që e kthen profesorin e parë më të ri në fakultet.
    public Profesori profesoriMeiRi(){
        if(index == 0){
        System.out.println("Nuk ka asnje mesimdhenes ne varg");
        return null;
        }
        Profesori meiRi = null;
        for(int i = 0; i < index; i++){
            if(vargu[i] instanceof Profesori){

                //2000 < 2001
                //meiRi = "Avdi", 2000 (21)
                //vargu[i] = "Endi",2001 (20)
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
                //	if(vargu[i].getLlojiUshtrimeve())
                // error (sepse vargu eshte mesimdhenes dhe nuk ka casje ne metodat e asistentit)
                Asistenti a = (Asistenti)vargu[i];
                if(a.getLlojiUshtrimeve().equals(llu)){
                    System.out.println(a);
                }
            }
        }

    }

/* f) Ofroni metodën main ku do të krijohet një instancë e klasës Fakulteti me drejtim “Shkenca
Kompjuterike”, me mundësi të ruajtjes së 15 mësimdhënësve dhe shtoni disa profesorë dhe
disa asistentë. */

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

//  g) Të testohen metodat ekziston, profesoriMeIRi dhe shtypLlojinEUshtrimeve

        Profesori iRi = f.profesoriMeiRi();
        System.out.println("profesori me i ri : " + iRi);


        f.shtypLlojinEUshtrimeve("Muzik");
        }

    }



















