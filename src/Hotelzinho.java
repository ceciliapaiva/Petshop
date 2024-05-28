package src;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Hotelzinho extends Servicos{

    long cod = getCodigo();
    String desc;
    LocalDateTime data = getDataServico();
    String tamanho;
    float quantHoras;
    double precoHotel;
    List<Servicos> hospedagensDoDia;

    public Hotelzinho(String tamanho, float quantHoras) {
        this.cod = getCodigo();
        this.desc = "Hotel";
        this.data = getDataServico();
        this.tamanho = getTamanhoAnimal();
        this.quantHoras = quantHoras;
        this.precoHotel = getPreco();
        hospedagensDoDia = new ArrayList<>();
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
    public void registrarServico(Servicos servico) {
        if (servico instanceof Hotelzinho){
            hospedagensDoDia.add(servico);
            super.registrarServico(servico);
        }
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    public float getQuantHoras() {
        return quantHoras;
    }
}
