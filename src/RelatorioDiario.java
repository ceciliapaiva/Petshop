package src;

import java.util.ArrayList;
import java.util.List;

public class RelatorioDiario {
    List<Servicos> servicosDoDia = new ArrayList<>();
    double totalDeVendas;

    public void addServicos(Servicos servico) {
        servicosDoDia.add(servico);
        totalDeVendas += servico.getPreco();
    }

    public double calculaTotal(){
        return totalDeVendas;
    }

    public String exibirRelatorio() {
        StringBuilder relatorioSTR = new StringBuilder();
        for (Servicos s : servicosDoDia){
            relatorioSTR.append(s.toString()).append("\n________________________________________________\n");
        }
        relatorioSTR.append(String.format("Total arrecadado: R$%.2f%n", calculaTotal()));
        return relatorioSTR.toString();
    }
}
