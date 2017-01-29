package OOP;

/**
 * Created by kirstin on 28/01/2017.
 */
    public class Pastakas {
    int tindikogus;
    String tekst;
    char tyhik;
    String tyhik2;

    public Pastakas (int kogus){
        tindikogus = kogus;
    }
    public void kirjuta(String tekst) {
      for (int i=0; i<tekst.length(); i++){
          System.out.println(tekst.charAt(i));
          tindikogus = tindikogus-1;
          char tyhik = tekst.charAt(i);
          tyhik2 = Character.toString(tyhik);
          if (tyhik2.equals(" ")){
              tindikogus = tindikogus + 1;
          }
          if (tindikogus==0){
              break;
          }

      }

    }

    public void prindiPaljuTintiAlles() {
        System.out.println(tindikogus);
    }
}
