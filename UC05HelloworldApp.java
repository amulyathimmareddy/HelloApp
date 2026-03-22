
class UC05HelloworldApp {
   UC05HelloworldApp() {
   }

   public static void main(String[] var0) {
      if (var0.length == 0) {
         System.out.println("Hello, World!");
      } else {
         for(String var4 : var0) {
            System.out.println("Hello, " + var4 + "!");
         }
      }

   }
}
