package replithomework;

import com.sun.imageio.stream.StreamFinalizer;

 class Db {

     private String data;
     private int yint;

     public String getData() {
         return data;
     }

     public void setData(String data) {
         this.data = data;
     }

     public int getYint() {
         return yint;
     }

     public void setYint(int yint) {
         this.yint = yint;
     }

     public Db(String data, int yint) {
         this.data = data;
         this.yint = yint;
     }
 }
