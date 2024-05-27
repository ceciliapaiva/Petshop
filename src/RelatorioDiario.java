package src;

import java.util.ArrayList;
import java.util.List;

public class RelatorioDiario {
    List<Servicos> servicosDoDia = new ArrayList<>();
    double totalDeVendas;

    public void registrarServicos(List<Servicos> lista) {
        servicosDoDia.addAll(lista);
    }

    public double calculaTotal(){
        for (Servicos s : servicosDoDia){
            totalDeVendas += s.getPreco();
        }
        return totalDeVendas;
    }

    public String exibirRelatorio() {
        String relatorioSTR = "";
        for (Servicos s : servicosDoDia){
            relatorioSTR = s.toString() + "\n __________________________________________" + " Total arrecadado: R$" + calculaTotal();
        }
        return relatorioSTR;
    }
}
