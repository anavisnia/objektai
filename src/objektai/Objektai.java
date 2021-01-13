package objektai;


public class Objektai {

    public static void main(String[] args) {
        /*
        ****************** Masyvas ***************
        int[] m1 = {1, 2, 3};
        // padaryti nauja masyva, kurio turinis yra kopija kito masyvo
        int[] m2 = new int[m1.length];
        for(int i = 0; i < m1.length; i++) {
            m2[i] = m1[i];
        }
        for (int i = 0; i < m1.length; i++) {
            System.out.print(m1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < m2.length; i++) {
            System.out.print(m2[i] + " ");
        }
        System.out.println("");
        */
        // *********************** Objektas *********************
        Puodukas p1 = new Puodukas('Z', 300);
        
        Puodukas p2 = new Puodukas('B', 150);
        
        p1.ipilk(120);
        p1.isgerk(30);
        p1.ipilk(500);
        p1.setSpalva('J');
        System.out.println(p1.getSpalva());
        
        p2.ipilk(50);
        p2.ipilk(500);
        System.out.println(p2.isPilnas());
//        System.out.println(p1.kiekis);
//        
//        System.out.println(p1.kiekis);
//        System.out.println(p2.kiekis);

        Puodukas p3 = p1;
        p3.isgerk(200);
        
        
        System.out.println(p1.getKiekis());
        System.out.println(p2.getKiekis());
        System.out.println(p2.getTuris());

    }
    
}
