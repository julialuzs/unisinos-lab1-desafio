import java.util.Set;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    private final static Set<Integer> MESES_30_DIAS = Set.of(4, 6, 7, 9, 11);

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        boolean dataValida = validarData();
        if (!dataValida) {
            System.out.println("Data inválida");
            setarDataPadrao();
        }
    }

    private void setarDataPadrao() {
        this.setAno(2000);
        this.setMes(1);
        this.setDia(1);
    }

    private boolean validarData() {
        if (this.mes > 12) {
            return false;
        }

        if (this.mes == 2) {
            return verificaAnoBissexto() ? this.dia <= 29 : this.dia <= 28;
        }

        return MESES_30_DIAS.contains(this.mes) ? this.dia <= 30 : this.dia <= 31;
    }

    public boolean verificaAnoBissexto() {
        return this.ano % 4 == 0;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
