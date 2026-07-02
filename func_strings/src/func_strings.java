public class func_strings {
    public static void main(String[] args) throws Exception {
        String original = "abcd ABCD efgh IJK";

        // toLowerCase() - converte todos os caracteres da string para minúsculo
        String s1 = original.toLowerCase();
        System.out.println("toLowerCase: " + s1);

        // toUpperCase() - converte todos os caracteres da string para maiúsculo
        String s2 = original.toUpperCase();
        System.out.println("toUpperCase: " + s2);

        // trim() - remove os espaços em branco do início e do fim da string
        String s3 = original.trim();
        System.out.println("trim: " + s3);

        // substring() - retorna uma parte da string, a partir do índice informado, posso informar apenas o índice inicial ou o índice inicial e final
        String s4 = original.substring(2);
        System.out.println("substring(2): " + s4);

        String s5 = original.substring(2, 5);
        System.out.println("substring(2, 5): " + s5);

        // replace() - substitui um caractere ou uma sequência de caracteres por outro caractere ou sequência de caracteres
        String s6 = original.replace("a", "y");
        System.out.println("replace(a, y): " + s6);

        String s7 = original.replace("abc", "y");
        System.out.println("replace(abc, y): " + s7);

        // indexOf() - retorna o índice da primeira ocorrência de um caractere ou sequência de caracteres na string, caso não encontre retorna -1
        int index1 = original.indexOf("a");
        System.out.println("indexOf(a): " + index1);

        // lastIndexOf() - retorna o índice da última ocorrência de um caractere ou sequência de caracteres na string, caso não encontre retorna -1
        int index2 = original.lastIndexOf("h");
        System.out.println("lastIndexOf(h): " + index2);

        // split() - divide a string em um array de strings, a partir de um caractere ou sequência de caracteres
        String[] vetor = original.split(" ");
        String palavra1 = vetor[0];
        String palavra2 = vetor[1];
        String palavra3 = vetor[2];
        String palavra4 = vetor[3];
        System.out.println(palavra1);
        System.out.println(palavra2);
        System.out.println(palavra3);
        System.out.println(palavra4);
    }
}
