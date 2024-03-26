package school.management.system;

public class Student {
    private int id;
    private String name;
    private int grau;
    private int taxasPagas;
    private int taxasTotal;

    public Student(int id, String name, int grau){
        this.taxasPagas=0;
        this.taxasTotal=30000;
        this.id=id;
        this.name=name;
        this.grau=grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public void payTaxas (int taxas){
            taxasPagas+=taxas;
            School.updateTotalMoneyEarned(taxasPagas);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrau() {
        return grau;
    }

    public int getTaxasPagas() {
        return taxasPagas;
    }

    public int getTaxasTotal() {
        return taxasTotal;
    }
    public int getRemainTaxas(){
        return taxasTotal-taxasPagas;
}
@Override
    public String toString(){
        return "Nome do Estudante : "+name+
                " Total de taxas pagas até agora $"+ taxasPagas;
    }
}
