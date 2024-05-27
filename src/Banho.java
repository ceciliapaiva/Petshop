package src;

import java.time.LocalDateTime;

public class Banho extends Servicos{
    long cod = getCodigo();
    String desc = "Banho";
    LocalDateTime data = getDataServico();
    static String tamanho;
    String tamanhoPelo;
    double precoBanho = calcularPreco();

    public Banho(long cod, LocalDateTime data, String tamanhoPelo, double precoBanho) {
        this.cod = cod;
        this.data = LocalDateTime.now();
        this.tamanhoPelo = tamanhoPelo;
        this.precoBanho = precoBanho;
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
    public void addListaServicos(Servicos servico) {
        super.addListaServicos(servico);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    public String getTamanhoPelo() {
        return tamanhoPelo;
    }
}
