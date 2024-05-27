package src;

import java.time.LocalDateTime;

public class Tosa extends Servicos{
    long cod = getCodigo();
    String desc = "Tosa";
    LocalDateTime data = getDataServico();
    String tamanho;
    double precoTosa;

    public Tosa(long cod, LocalDateTime data, String tamanho, double precoTosa) {
        this.cod = cod;
        this.data = LocalDateTime.now();
        this.tamanho = tamanho;
        this.precoTosa = precoTosa;
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
    public void addListaServicos(Servicos servico) {
        super.addListaServicos(servico);
    }
}
