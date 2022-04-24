class Pattern{
   public static void main(String[] args)
   {
       int a=0;
       System.out.println();
       for (int i=0; i<15; i++)
       {
           if (i<9){
           if (a%2==0){
           for (int j=0; j<6; j++)
               System.out.print("+ ");
           }

           else{
              System.out.print(" ");
              for (int j1=0; j1<5; j1++)
                  System.out.print("+ ");
              System.out.print(" ");
           }
             
           for (int k=0; k<34; k++)
               System.out.print("=");
           a++;
       }

       else{
for (int k=0; k<46; k++)
               System.out.print("=");
       }

           System.out.println();
       }
   }
}