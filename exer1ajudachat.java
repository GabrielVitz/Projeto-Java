public class exer1ajudachat {
    public static void main(String[] args) {
        java.util.Scanner entrada;
        entrada = new java.util.Scanner(System.in);
        int coluna = 3;
        int linha = 3;
        char[][] mat = new char[coluna][linha];

        String palavra = entrada.nextLine();
        for (int x = 0; x < coluna; x++) {
            for (int y = 0; y < linha; y++) {
                mat[x][y] = entrada.next().charAt(0);
            }
        }
        for (int x = 0; x < coluna; x++) {
            for (int y = 0; y < linha; y++) {
                System.out.print(mat[x][y] + " ");
            }
            System.out.println();
        }
        
        boolean todas = true;
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            boolean encontrada = false;
            for (int x = 0; x < coluna; x++) {
                for (int y = 0; y < linha; y++) {
                    if (mat[x][y] == letra) {
                        encontrada = true;
                        break;
                    }
                }
            } if (encontrada) {
                break;
            }
            if (!encontrada) {
                todas = false; 
                break; 
            }
        }
        if (todas) {
            System.out.println("Consta na matriz.");
        } else {
            System.out.println("Não consta na matriz.");
        }


        entrada.close();
    }
}
