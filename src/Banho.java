package src;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Banho extends Servicos{
    LocalDateTime data;
    String tamanho;
    String tamanhoPelo;
    double precoBanho;
    List<Servicos> banhosDoDia;

    public Banho(String tamanho, String tamanhoPelo) {
        super();
        this.descricao = "Banho";
        this.data = getDataServico();
        this.tamanhoAnimal = tamanho;
        this.tamanhoPelo = tamanhoPelo;
        this.precoBanho = calcularPreco();
        banhosDoDia = new ArrayList<>();
    }

    @Override
    public double calcularPreco() {
        tamanho = getTamanhoAnimal();

        if (tamanho.equalsIgnoreCase("P")){
            precoBanho += 20.0;

        } else if (tamanho.equalsIgnoreCase("M")){
            precoBanho += 30.0;

        } else if (tamanho.equalsIgnoreCase("G")){
            precoBanho += 40.0;

        }

        if (tamanhoPelo.equalsIgnoreCase("medio") || tamanhoPelo.equalsIgnoreCase("médio")) {
            precoBanho += 10.0;
        } else if (tamanhoPelo.equalsIgnoreCase("longo")) {
            precoBanho += 20.0;
        }

        this.preco = precoBanho;
        return precoBanho;
    }

    @Override
    public void registrarServico(RelatorioDiario relatorio, Servicos servico) {
            banhosDoDia.add(servico);
            relatorio.addServicos(servico);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    public String getTamanhoPelo() {
        return tamanhoPelo;
    }

    @Override
    public String getTamanhoAnimal() {
        return super.getTamanhoAnimal();
    }

    @Override
    public String toString() {
        return String.format("Serviço: %s%nCódigo: %d%nTamanho do Pelo: %s%n%s", getDescricao(), getCodigo(), tamanhoPelo.toUpperCase() ,super.toString());
    }
}
