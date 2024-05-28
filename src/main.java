package src;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Instâncias
        Scanner sc = new Scanner(System.in);
        RelatorioDiario relatorioDiario = new RelatorioDiario();
        Banho banho; Hotelzinho hotel; Tosa tosa;
        // Variáveis
        int opcao = 0;
        String tamanho;
        String tamanhoPelo;
        int simOUnao;

        // Programa
        while (opcao != 3) {
            System.out.println(menu());
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: // Registrar pedido
                    int opcServico = 0;

                    while (opcServico != 4) {
                        System.out.println(menuServico());
                        opcServico = sc.nextInt();
                        switch (opcServico) {

                            case 1: // Banho
                                System.out.println("Qual o tamanho do pet (P, M ou G)?");
                                sc.nextLine();
                                tamanho = sc.nextLine();
                                System.out.println("Qual o tamanho do pêlo do seu pet (Curto, Médio ou Longo)?");
                                tamanhoPelo = sc.nextLine();

                                banho = new Banho(tamanho, tamanhoPelo);
                                System.out.println("Preço do banho: R$" + banho.calcularPreco());
                                System.out.println("Deseja registrar este serviço?\n[1] Sim      [2] Não");
                                simOUnao = sc.nextInt();
                                if (simOUnao == 1) banho.registrarServico(banho);
                            break;

                            case 2: // Hotel
                                System.out.println("Qual o tamanho do pet (P, M ou G)?");
                                sc.nextLine();
                                tamanho = sc.nextLine();
                                System.out.println("Quantas horas de hospedagem? (Use virgula)");
                                float quantHoras = sc.nextFloat();

                                hotel = new Hotelzinho(tamanho, quantHoras);
                                System.out.println("Preço da hospedagem: R$" + hotel.calcularPreco());
                                System.out.println("Deseja registrar este serviço?\n[1] Sim      [2] Não");
                                simOUnao = sc.nextInt();
                                if (simOUnao == 1) hotel.registrarServico(hotel);
                            break;

                            case 3: // Tosa
                                System.out.println("Qual o tamanho do pet (P, M ou G)?");
                                sc.nextLine();
                                tamanho = sc.nextLine();

                                tosa = new Tosa(tamanho);
                                System.out.println("Preço da tosa: R$" + tosa.calcularPreco());
                                System.out.println("Deseja registrar este serviço?\n[1] Sim      [2] Não");
                                simOUnao = sc.nextInt();
                                if (simOUnao == 1) tosa.registrarServico(tosa);
                            break;
                        }
                    }
                break;
                case 2: // Exibir inventário
                    System.out.println(relatorioDiario.exibirRelatorio());
                    System.out.println("O arrecadamento total de hoje foi R$" + relatorioDiario.calculaTotal());
                break;
            }
        }

    }

    public static String menu() {
        String menu = "[1] Registrar serviço\n[2] Exibir inventário do dia\n[3] Sair do siatema";
        return menu;
    }

    public static String menuServico(){
        String menuServicos = "[1] Banho\n[2] Hotel\n[3] Tosa\n[4] Cancelar pedido";
        return menuServicos;
    }

}
