package homework_02;

public class Homework_02 {

    public static void main(String[] args) {
        String[][] nomes = {
            {"Juca", "Zeca", "Ana", "Paulo"},
            {"Tião", "Bela", "Vivi", "Mara"},
            {"Mari", "Joca", "Tonho", "Vito"},
            {"Gabi", "Peu", "Tuco", "Bia"}
        };

        System.out.println("Exibindo Array");
        System.out.println("");

        for (int linha = 0; linha < nomes.length; linha++) {
            System.out.println("");
            for (int coluna = 0; coluna < nomes.length; coluna++) {
                System.out.println(nomes[linha][coluna]);

            }
        }

        System.out.println("");
        System.out.println("Exibindo Array Desafio");
        System.out.println("");
        
        //Desafio
//        for (int linha = 0; linha < nomes.length; linha++) {
//            System.out.println(nomes[linha][0] + " " + nomes[linha][1] + " " + nomes[linha][2] + " " + nomes[linha][3]);
//        }
        
         for (int linha = 0; linha < nomes.length; linha++) {           
            for (int coluna = 0; coluna < nomes.length; coluna++) {
                System.out.print(nomes[linha][coluna] + "\t");
            }          
             System.out.println("");
        }
        

    }
    
}
