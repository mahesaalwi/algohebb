
/* 

Wi (baru) = Wi(lama) + Xi * y
b(baru) = b(lama) + y

init => Wi = bobot data ke input ke -i
        Xi = input data ke-i
        y = output data
        b = nilai bias  

        bobot awal dan bobot bias set -> 0
*/

public class algohebb{

    public static void main (String [] args) {

        int [][] x1 = new int [2][2];
         /*   init => */ x1 [0][0] = 1;
        x1 [0][1] = 1;
        x1 [1][0] = 1;
        x1 [1][1] = -1;

        int x2 [][] = new int [2][2];
         /*   init => */  x2 [0][0] = 1;
        x2 [0][1] = 1;
        x2 [1][0] = -1;
        x2 [1][1] =  1;

        int [][] x3 = new int [2][2];
        /*   init => */  x3 [0][0] = 1;
        x3 [0][1] = -1;
        x3 [1][0] = 1;
        x3 [1][1] = 1;

        int [][] bl = new int [2][2];
        
        bl [0][0] = 1;
        bl [0][1] = 1;
        bl [1][0] = 1;
        bl [1][1] = 1;

        int target [][] = new int [2][2];
         /*   init => */ target [0][0] = 1;
                         target [0][1] = -1;
                         target [1][0] = -1;
                         target [1][1] = -1;

         /*   init => */ int bobot_baru = 0;

         System.out.println("-=================================-");

         /*   perhitungan nilai w1 => */

        for (int i =0; i < x1.length; i++){
            for (int j=0; j <x1.length; j++ ){
               int perubahan_bobot =   x1[i][j] * target[i][j];
               System.out.println("w1 dari init x1 =>"+perubahan_bobot);
            }
        }

        System.out.println("-=================================-");
         
        /*   perhitungan nilai w2=> */

        for (int i=0; i < x2.length; i++){
            for (int j = 0; j < x2.length; j++ ){
                int perubahan_bobot =   x2[i][j] * target[i][j];
                System.out.println("w2 dari x2 =>"+perubahan_bobot);
            }
        }

        System.out.println("-=================================-");

        /*   perhitungan nilai w3=> */

        for (int i=0; i < x3.length; i++  ){
            for(int j=0; j < x3.length; j++) {

                int perubahan_bobot =   x3[i][j] * target[i][j];
                System.out.println("w3 dari x2 =>"+perubahan_bobot);
            }
        }

        System.out.println("-=====================================-");
        for(int i=0; i < bl.length; i++ ){
              for (int j = 0; j < bl.length; j++) {
                  int perubahan_bobot = bl[i][j] * target[i][j];
                  System.out.println("b lama => b baru "+ perubahan_bobot );
              }  
        }

      
    } 

}