package sample;

public class ChakravyuhSolution {

		    public static String canCrossChakravyuh(int p, int[] k, int a, int b) {
		        int n = k.length;
		        boolean[] regenerated = new boolean[n];

		        for (int circle = 0; circle < n; circle++) {
		            if (a > 0) {
		                a--;
		                continue;
		            }
		            if (b > 0) {
		                p++;
		                b--;
		            }
		            if (p < k[circle]) {
		                return "Cannot cross Chakravyuh";
		            }

		            p -= k[circle];
		            if ((circle == 2 || circle == 6) && !regenerated[circle]) {
		                regenerated[circle] = true;
		                if (p < k[circle] / 2) {
		                    return "Cannot cross Chakravyuh";
		                }
		                p -= k[circle] / 2;
		            }
		        }

		        return "Can cross Chakravyuh";
		    }

		    public static void main(String[] args) {
		        int p1 = 15;
		        int[] k1 = {3, 4, 7, 5, 6, 8, 9, 5, 4, 2, 1};
		        int a1 = 2;
		        int b1 = 2;
		        System.out.println(canCrossChakravyuh(p1, k1, a1, b1));  

		    
		        int p2 = 10;
		        int[] k2 = {3, 4, 7, 5, 6, 8, 9, 5, 4, 2, 1};
		        int a2 = 1;
		        int b2 = 1;
		        System.out.println(canCrossChakravyuh(p2, k2, a2, b2));  
		    }
          }
