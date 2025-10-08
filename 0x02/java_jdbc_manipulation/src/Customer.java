public class Customer {

    Integer id;
    String name;
    Integer age;
    String cpf;
    String rg;


    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public Integer getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                '}';
    }
}
