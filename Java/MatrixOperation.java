public class MatrixOperation {
    static  int[][] matrixAdd(int[][] m1,int[][] m2){
        int[][] result=new int[m1.length][m1[0].length];
         for(int i=0;i<result.length;i++) {
             for (int j = 0; j < result[i].length; j++) {
                 result[i][j] = m1[i][j] + m2[i][j];
             }
         }
        return  result;
    }
    static  int[][] matrixSub(int[][] m1,int[][] m2){
        int[][] result=new int[m1.length][m1[0].length];
        for(int i=0;i<result.length;i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return  result;
    }

    static int[][] matrixTrans(int[][] m1){
        int[][] trans=new int[m1[0].length][m1.length];
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[0].length;j++){
                trans[j][i]=m1[i][j];
            }
        }
        return trans;
    }
   /* static  int[][] matrixMulti(int[][] m1,int[][] m2){
        int[][] result=new int[m1.length][m2[0].length];
        int k=0,k1=0,l=0;
        result[k][k1]=0;
        if(m1.length==m2[0].length){
            while(k!= result.length-1 && k1!=result[0].length-1){
                k=0;
                if(l!=0){
                    k1++;
                }
                for(int i=0;i< m1.length;i++)
                {
                    for(int j=0;j<m1[0].length;j++){
                        result[k][k1]=result[k][k1]+(m1[i][j]*m2[j][l]);
                        System.out.print(m1[j][l]);
                    }
                    k++;
                }

                l++;
            }
        }
        return result;
    }*/
    static int[][] matrixMulti(int[][] m1,int[][] m2){
        int[][] result=new int[m1.length][m2[0].length];
        if(m1.length==m2[0].length) {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2.length; j++) {
                    for (int k = 0; k < result[0].length; k++) {
                        result[i][k] = result[i][k] + (m1[i][j] * m2[j][k]);
                    }
                }
            }
        }
        else{
            System.out.println("First Matrix Column not equal to Second Matrix Row!");
        }
        return result;
    }
}
