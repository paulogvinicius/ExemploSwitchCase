public class ExemploSwitchCase {
    public static void main(String[] args) {
        int opcaoMenu = 2;

        // O switch analisa o valor dentro da variável 'opcaoMenu'
        switch (opcaoMenu) {
            case 1:
                System.out.println("Opção 1 selecionada: Consultar Saldo.");
                break; // O 'break' é obrigatório para o código parar aqui e não executar os de baixo
            
            case 2:
                System.out.println("Opção 2 selecionada: Fazer Extrato.");
                break;
            
            case 3:
                System.out.println("Opção 3 selecionada: Falar com Atendente.");
                break;
            
            // O 'default' é o equivalente ao 'else'. Se não for 1, 2 ou 3, ele cai aqui.
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }
}
