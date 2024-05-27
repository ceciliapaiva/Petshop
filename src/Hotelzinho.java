package src;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Hotelzinho extends Servicos{

    long cod = getCodigo();
    String desc = "Hotelzinho";
    LocalDateTime data = getDataServico();
    String tamanho;
    float quantHoras;
    double precoHotel = calcularPreco();

    public Hotelzinho(long cod, LocalDateTime data, String tamanho, float quantHoras, double precoHotel) {
        this.cod = cod;
        this.data = LocalDateTime.now();
        this.tamanho = tamanho;
        this.quantHoras = quantHoras;
        this.precoHotel = precoHotel;
    }

    @Override
    public double calcularPreco() {
        precoHotel = 0.0;
        String tamanhoAnimal = getTamanhoAnimal();
        float horas = getQuantHoras();

        switch (tamanhoAnimal){
            case "P":
                precoHotel += horas * 12.0;
                break;
            case "M":
                precoHotel += horas * 18.0;
                break;
            case "G":
                precoHotel += horas * 25.0;
                break;
            default: precoHotel = 0.0;
                break;
        }
        return precoHotel;
    }

    @Override
    public void addListaServicos(Servicos servico) {
        super.addListaServicos(servico);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    public float getQuantHoras() {
        return quantHoras;
    }
}
