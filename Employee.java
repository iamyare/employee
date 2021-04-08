package Employee;

import Business.BusinessUnit;

import javax.lang.model.type.NullType;

public class Employee {

    private String id;
    private String name;
    private String lastname;
    private int age;
    //private Supervisor mi_supervisor;
    protected float salary;
    private BusinessUnit bu;

    /*Se podria eliminar la linea de codigo del Supervisor, ya que BusinessUnit, ya la hereda obteniendo informacion de del supervisor
    * Aunque para corregir errores se necesitaria editar el main, tambien habria un error con la clase Supervisor por la flata del GetId
    * que lo podriamos corregir de la misma manera que en el main, utilizando BusinessUnit, directamente.*/




    public Employee(String id, String name, String lastname, int age) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.setAge(age);
        this.salary = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age <= 1 || age >= 100 ){
            age = 1;
            System.out.println("WARNING: EL valor enviado no se encuentra de los rangos espesificados [1,99], POR LO TANTO EL VALOR FUE SET CON 1");
        }
        this.age = age;
    }

    public BusinessUnit getMi_supervisor() {
        return this.bu;
    }

    public void setMi_supervisor(BusinessUnit bu) {this.bu = bu;
    }

    public String Presentation(){
        return this.id + " - " + this.name + " " + this.lastname;
    }

    public BusinessUnit getBu() {
        return this.bu;
    }

    public void setBu(BusinessUnit bu) {
        this.bu = bu;
    }
}
