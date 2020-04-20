package com.pattern;

public class Stars {
	
	private static String str;

	public static void main(String[] args) {
		
		/*
		 *  *
		 *  * *
		 *  * * *
		 *  * * * *
		 *  * * * * *
		 */
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				//System.out.print("* ");
			}
			//System.out.println();
		}
		
		
		/*
		 *  * * * * *
		 *  * * * *
		 *  * * *
		 *  * *
		 *  *
		 *  
		 */
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				//System.out.print("* ");
			}
			//System.out.println();
		}
		
		/*
		 *  * * * * *
		 *    * * * *
		 *      * * *
		 *        * *
		 *          * 
		 */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i<=j) { 
				//System.out.print(" *");
				}
				else {
					//System.out.print("  ");
				}
					
			}  
			//System.out.println();
		}
		
		/*
		 *          *
		 *        * *
		 *      * * * 
		 *    * * * *
		 *  * * * * *
		 */
		
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5;j++) {
				if(j>=i) {
					//System.out.print("*");
				}else {
					//System.out.print(" ");
				}
			}
			//System.out.println();		
		}
		
		
		
		/*
		 *  * 
		 *  * *
		 *  * * *
		 *  * * * *
		 *  * * * * *
		 *  * * * *
		 *  * * *
		 *  * *
		 *  *
		 */
		
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				if(i+j>10)
					break;
				//System.out.print("* ");
			}
			//System.out.println();
		}
		
		
		for(int i=1;i<=9;i++) {
			for(int j=9;j<=i;j--) {
				//System.out.print("* ");
			}
			//System.out.println();
		}

/*
 *      *
       **
      ***
     ****
    *****
     ****
      ***
       **
        *

 */
		
		for(int i=1;i<=9;i++) {
			for(int j=9;j >= 1; j--) {
				if (i < j) {
					// System.out.print(" ");
				} else {
					if (i > 5 && i + j > 10) {
						// System.out.print(" ");
					} else {
						// System.out.print("*");
					}
				}
			}
			// System.out.println();
		}

		/*
		 * 
		 * J A V A 
		 *   A V A 
		 *     V A 
		 *       A
		 * 
		 */

		str = "JAVA";

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (j >= i) {
					/*
					 * switch(j) { case 1: System.out.print('J'); break; case 2: case 4:
					 * System.out.print('A'); break; case 3: System.out.print('V'); break; }
					 */
					// System.out.print(str.charAt(j-1)+" ");
				} else {
					// System.out.print(" ");
				}
			}
			// System.out.println();
		}

		for (int i = 1; i <= 4; i++) {
			// System.out.println(str);
			str = str.replaceFirst("" + str.charAt(i - 1), " ");
		}

		/*
		 * 1 2 3 4
		 * 2 3 4 1 
		 * 3 4 1 2
		 * 4 1 2 3
		 * 
		 */

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				int k = i + j - 1;
				if (k <= 4) {
					 System.out.print(k+" ");
				} else {
					 System.out.print(k-4+" ");

				}
			}
			 System.out.println();
		}

		/*
		 *         1 
                 1 2 
               1 2 3 
             1 2 3 4 
 
		 */

		for (int i = 1; i <= 4; i++) {
			for(int k=3;k>=i;k--) {
				//System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				//System.out.print(j + " ");
			}
			//System.out.println();
		}

	}

}
