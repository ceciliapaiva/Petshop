package src;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Tosa extends Servicos{
    long cod;
    String desc;
    LocalDateTime data;
    String tamanho;
    double precoTosa;
    List<Servicos> tosasDoDia;

    public Tosa(String tamanho) {
        this.cod = getCodigo();
        this.desc = "Tosa";
        this.data = getDataServico();
        this.tamanho = getTamanhoAnimal();
        this.precoTosa = getPreco();
        tosasDoDia = new ArrayList<>();
    }

    @Override
    public double calcularPreco() {
        String tamanhoAnimal = getTamanhoAnimal();

        switch (tamanhoAnimal){
            case "P":
                precoTosa = 22.0;
                break;
            case "M":
                precoTosa = 30.0;
                break;
            case "G":
                precoTosa = 40.0;
                break;
            default: precoTosa = 0.0;
                break;
        }
        return precoTosa;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    @Override
    public void registrarServico(Servicos servico) {
        if (servico instanceof Tosa){
            tosasDoDia.add(servico);
            super.registrarServico(servico);
        }
    }
}
