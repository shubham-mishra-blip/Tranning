/*

Original

*         *
**        *
* *       *
*  *      *
*   *     *
*    *    *
*     *   *
*      *  *
*       * *
*        **
*         *

 Reverse

*         *
*        **
*       * *
*      *  *
*     *   *
*    *    *
*   *     *
*  *      *
* *       *
**        *
*         *       *


*/


class Original 
{
	   int n = 11;
	   Original(){
	   for (int i = 0; i < n; i ++)
	   {
		   for (int j = 0; j < n; j ++)
		   {
			   if (j == 0 || j == n-1 || i == j)
			   {
				   System.out.print("*");
			   }			   else System.out.print(" ");
		   }
		   System.out.println();
	   }
	   
	   }
	}



class Reverse
{

	   int n = 11;
	Reverse(){
	   for (int i = 0; i < n; i ++)
	   {
		   for (int j = 0; j < n; j ++)
		   {
			   if (j==0 || j == n-1 || i+j == n-12)
			   {
				   System.out.print("*");
				  }
			   else System.out.print(" ");
		   }
		   System.out.println();
	   }
		}
	}

class N
{
	public static void main(String ...args){
	    System.out.println("Original \n");
		Original o = new Original();

		System.out.println("\n Reverse \n");
		Reverse r = new Reverse();
	}
}


