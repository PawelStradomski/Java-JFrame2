
package ramkitrening;

import javax.swing.*;
import java.awt.*;
/**
 * 
 * @author pawelstradomski
 */


public class RamkiTrening {

    public static void main(String[] args) {
        
//        NowaMojaRamka a = new NowaMojaRamka();
        
        new NowaMojaRamka().setVisible(true);
        
    }
    
}
class NowaMojaRamka extends JFrame
{
    NowaMojaRamka()
    {
        this.setTitle("Rakieta3.0");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("moj.jpg"));
        
        int wys = Toolkit.getDefaultToolkit().getScreenSize().height; //pobiera wartosc wys.rozdzielczosci
        int szer = Toolkit.getDefaultToolkit().getScreenSize().width; //pobiera wartosc szer.rozdzielczosci
        System.out.println(szer + "x" + wys);
        
        
        this.setSize(szer/4, wys/4);                               //ustawia rozmiar ramki jako ulamek war. rozdzielczosci
//        this.setLocation(szer/4, wys/4);                         //sposob centrowania ramki - klopotliwy

        int szerRamki = this.getSize().width;                      //pobiera szerokosc ramki
        int wysRamki = this.getSize().height;                      //pobiera wysokosc ramki
        System.out.println(szerRamki + "x" + wysRamki);
        
        this.setLocation((szer-szerRamki)/2, (wys-wysRamki)/2);    //uniewersalny sp.centrowania, niezalezny od wymiarow ramki!!

//      Moje proby

        Rectangle rec = this.getBounds();
        System.out.println(rec);
        
        Dimension dim = this.getSize();
        System.out.println(dim);
        
        int x = this.getLocation().x;
        System.out.println(x);
        
        int y = this.getLocation().y;
        System.out.println(y);
        
        Dimension a = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(a);
        
    }
}