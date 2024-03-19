public class notasAlunos {

    public static void main(String[] args) {
        double[][]notasAlunos = new double[30][4];
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 8.5;

        notasAlunos[1][0] = 6.5;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7.5;
        notasAlunos[1][3] = 9.5;
        for (int i = 0; i <2; i++) {
            System.out.println("notasAlunos"+(i+1)+":");
            for (int j = 0; j < 4; j++) {
                System.out.println("Nota"+(j+1)+":"+ notasAlunos[i][j]);
            }
            System.out.println();
        }

    }
}
