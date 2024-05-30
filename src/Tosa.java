package src;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Tosa extends Servicos{
    LocalDateTime data;
    String tamanho;
    double precoTosa;
    List<Servicos> tosasDoDia;

    public Tosa(String tamanho) {
        this.codigo = getCodigo();
        this.descricao = "Tosa";
        this.data = getDataServico();
        this.tamanhoAnimal = tamanho;
        this.precoTosa = calcularPreco();
        tosasDoDia = new ArrayList<>();
    }

    @Override
    public double calcularPreco() {
        tamanho = getTamanhoAnimal();

        if (tamanhoAnimal.equalsIgnoreCase("P")) {
            precoTosa += 22.0;
        } else if (tamanhoAnimal.equalsIgnoreCase("M")) {
            precoTosa += 30.0;
        } else if (tamanhoAnimal.equalsIgnoreCase("G")) {
            precoTosa += 40.0;
        }
        this.preco = precoTosa;
        return precoTosa;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    @Override
    public void registrarServico(RelatorioDiario relatorio, Servicos servico) {
        if (servico instanceof Tosa){
            tosasDoDia.add(servico);
            relatorio.addServicos(servico);
        }
    }

    @Override
    public String toString() {
        return String.format("Serviço: %s%nCódigo: %d%n%s", getDescricao(), getCodigo(), super.toString());
    }
}
