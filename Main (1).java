
package javaapplication2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String vPilha[] = new String[5];
        String vFila[] = new String[5];
        int opc = 0;
        int topPilha = 0;
        int head = 0, tail = 0;
        while (opc != 7){
            System.out.println("#### PILHA ####");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Listar Pilha");
            System.out.println("#### FILA ####");
            System.out.println("4 - Incluir Fila");
            System.out.println("5 - Remover Fila");
            System.out.println("6 - Listar Fila");
            System.out.println("##############");
            System.out.println("7 - Sair");
            System.out.println("");
            System.out.print("Informe a opção desejada: ");
            opc = ler.nextInt();
            switch (opc) {
                case 1:
                    //EMPILHAR
                    System.out.print("Digite o que vai ser colocado na pilha: ");
                    String cenoura = ler.next();
                    vPilha[topPilha] = cenoura;
                    topPilha++;
                    break;
                case 2:
                    //DESEMPILHAR
                    vPilha[topPilha] = null;
                    topPilha --;

                    break;
                case 3:
                    //LISTAR PILHA
                    for(int i=0; i < 5; i++) {
                        if (vPilha[i]!=null) {
                            System.out.println(vPilha[i]);
                        }
                    }

                    break;
                case 4:
                    //INCLUIR FILA
                    System.out.print("O que você quer incluir na fila: ");
                    cenoura = ler.next();
                    vFila[tail] = cenoura;
                    tail++;
                    break;
                case 5:
                    //EXCLUIR FILA
                    vFila[head] = null;
                    head ++;
                    break;
                case 6:
                    //LISTAR FILA
                    for(int i=0; i < 5; i++) {
                        if (vFila[i]!=null) {
                            System.out.println(vFila[i]);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            } 
        }
    }
    
}
