package src;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Banho extends Servicos{
    long cod;
    String desc;
    LocalDateTime data;
    String tamanho;
    String tamanhoPelo;
    double precoBanho;
    List<Servicos> banhosDoDia;

    public Banho(String tamanho, String tamanhoPelo) {
        super();
        this.cod = getCodigo();
        this.desc = "Banho";
        this.data = getDataServico();
        this.tamanho = getTamanhoAnimal();
        this.tamanhoPelo = tamanhoPelo;
        this.precoBanho = getPreco();
        banhosDoDia = new ArrayList<>();
    }

    @Override
    public double calcularPreco() {
        precoBanho = 0.0;
        String tamanhoAnimal = getTamanhoAnimal();

        if (tamanhoAnimal == "P"){
            precoBanho += 20.0;
            if (tamanhoPelo.equalsIgnoreCase("curto")){

            } else if (tamanhoPelo.equalsIgnoreCase("medio")) {
                precoBanho += 10.0;
            } else if (tamanhoPelo.equalsIgnoreCase("longo")) {
                precoBanho += 20.0;
            }

        } else if (tamanhoAnimal.equals("M")){
            precoBanho += 30.0;
            if (tamanhoPelo.equalsIgnoreCase("curto")){
            } else if (tamanhoPelo.equalsIgnoreCase("medio")) {
                precoBanho += 10.0;
            } else if (tamanhoPelo.equalsIgnoreCase("longo")) {
                precoBanho += 20.0;
            }
        } else if (tamanhoAnimal.equals("G")){
            precoBanho += 40.0;
            if (tamanhoPelo.equalsIgnoreCase("curto")){

            } else if (tamanhoPelo.equalsIgnoreCase("medio")) {
                precoBanho += 10.0;
            } else if (tamanhoPelo.equalsIgnoreCase("longo")) {
                precoBanho += 20.0;
            }
        }
        return precoBanho;
    }

    @Override
    public void registrarServico(Servicos servico) {
        if (servico instanceof Banho){
            banhosDoDia.add(servico);
            super.registrarServico(servico);
        }
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    public String getTamanhoPelo() {
        return tamanhoPelo;
    }
}
