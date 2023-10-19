
public class Main extends MatrixOperation{
    public static void main(String[] args) {

        int[][] a={{0,1,1,0,0},{1,0,1,0,1},{1,0,0,1,0},{1,0,0,0,1},{0,0,1,0,0}};
        int[][] b={{0,1,1,0,0},{1,0,1,0,1},{1,0,0,1,0},{1,0,0,0,1},{0,0,1,0,0}};
        int[][] c;
        int[][] d;
        int[][] e;
        int[][] f;
        //System.out.print(stLength(st1));
        //System.out.print(conCat(st1,st2));
        //System.out.print(indValue(2,st1));
        //System.out.print(indSearch("n",st1));
        //c=matrixSub(a,b);
        //c=matrixTrans(a);
        System.out.println("\n\na1 = ");

        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(ints[j]+" ");
            }
            System.out.println(" ");
        }
        c=matrixMulti(b,a);
        System.out.println("\n\na2 = ");

        for (int[] ints : c) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(ints[j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("\n\na3 = ");
        d=matrixMulti(c,a);
        for (int[] ints : d) {
            for (int j = 0; j < d[0].length; j++) {
                System.out.print(ints[j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("\n\na4 = ");
        e=matrixMulti(d,a);
        for (int[] ints : e) {
            for (int j = 0; j < e[0].length; j++) {
                System.out.print(ints[j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("\n\na5 =");
        f=matrixMulti(e,a);
        for (int[] ints : f) {
            for (int j = 0; j < f[0].length; j++) {
                System.out.print(ints[j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("\n\nb5 = ");
        int[][] g=matrixAdd(a,c);
        g=matrixAdd(g,d);
        g=matrixAdd(g,e);
        g=matrixAdd(g,f);
        for (int[] ints : g) {
            for (int j = 0; j < g[0].length; j++) {
                System.out.print(ints[j]+" ");
            }
            System.out.println(" ");
        }
        int[][] h=new int[5][5];
        for (int i=0; i< g.length;i++) {
            for (int j = 0; j < g[0].length; j++) {
                if(g[i][j]==0)
                {
                  h[i][j]=0;
                }
                else{
                    h[i][j]=1;
                }
            }
        }
        System.out.println("\n\np =");
        for (int[] ints : h) {
            for (int j = 0; j < h[0].length; j++) {
                System.out.print(ints[j]+" ");
            }
            System.out.println(" ");
        }


    }
}