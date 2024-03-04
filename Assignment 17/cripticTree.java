import java.math.BigInteger;

import java.util.Scanner;

import java.util.StringTokenizer;

 class cripticTree{

public static void main(String[] args){

   Scanner in = new Scanner(System.in);

   String line1 = in.nextLine();

   StringTokenizer st = new StringTokenizer(line1, " ");

   int n = Integer.parseInt(st.nextToken());

   int m = Integer.parseInt(st.nextToken());

   Long[] b = new Long[m];

   String strA = in.nextLine();

   String[] stA = strA.split(" ");

   BigInteger aBI[] = new BigInteger[n];

   for (int ia = 0; ia < stA.length; ia++){

       aBI[ia] = new BigInteger(stA[ia]);

   }

   String strB = in.nextLine();

   String[] stB = strB.split(" ");

   for (int ib = 0; ib < stB.length; ib++){

       b[ib] = Long.parseLong(stB[ib]);

   }

   String strC = in.nextLine();

   String[] st3 = strC.split(" ");

   for (int ic = 0; ic < m; ic++){

       for (int index = b[ic].intValue(); index <= n; index += b[ic]

               .intValue()) {

           aBI[index - 1] = aBI[index - 1].multiply(new BigInteger(st3[ic]));

       }

   }

   for (int ia = 0; ia < n; ia++) {

       aBI[ia] = aBI[ia].mod(new BigInteger("1000000007"));

       System.out.print(aBI[ia] + " ");

   }

}
}