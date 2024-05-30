package src;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hotelzinho extends Servicos{

    LocalDateTime data = getDataServico();
    String tamanho;
    double quantHoras;
    double precoHotel;
    List<Servicos> hospedagensDoDia;

    public Hotelzinho(String tamanho, double quantHoras) {
        this.codigo = getCodigo();
        this.descricao = "Hotel";
        this.data = getDataServico();
        this.tamanhoAnimal = tamanho;
        this.quantHoras = quantHoras;
        this.precoHotel = calcularPreco();
        hospedagensDoDia = new ArrayList<>();
    }

    @Override
    public double calcularPreco() {
        precoHotel = 0.0;
        String tamanhoAnimal = getTamanhoAnimal();

        if (tamanhoAnimal.equalsIgnoreCase("P")) {
            precoHotel += quantHoras * 12.0;
        } else if (tamanhoAnimal.equalsIgnoreCase("M")) {
            precoHotel += quantHoras * 18.0;
        } else if (tamanhoAnimal.equalsIgnoreCase("G")) {
            precoHotel += quantHoras * 25.0;
        }
        this.preco = precoHotel;
        return precoHotel;
    }

    @Override
    public void registrarServico(RelatorioDiario relatorio, Servicos servico) {
        if (servico instanceof Hotelzinho){
            hospedagensDoDia.add(servico);
            relatorio.addServicos(servico);
        }
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    public double getQuantHoras() {
        return quantHoras;
    }

    @Override
    public String toString() {
        return String.format("Serviço: %s%nCódigo: %d%nHoras de hospedagem: %.2f%n%s", getDescricao(), getCodigo(), quantHoras, super.toString());
    }
}
