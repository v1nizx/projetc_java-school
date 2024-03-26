package school.management.system;

public class Teacher {

    private int id;
    private String name;
    private int salario;
    private int salarioEarned;

public Teacher(int id, String name, int salario){
    this.id=id;
    this.name=name;
    this.salario=salario;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public void rebeceSalario(int salario){
    salarioEarned += salario;
    School.updateTotalMoneySpent(salario);
    }
    @Override
    public String toString(){
    return "Nome do professor: " + name
            +" Salário total recebido até agora $"
            + salarioEarned;
    }
}
