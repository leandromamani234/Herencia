public class Padre extends Abuelo{
  String CI;

    public Padre(String CI) {
        this.CI = CI;
    }

    public Padre(String nombre, String primerApellido, String segundoApellido, String CI) {
        super(nombre, primerApellido, segundoApellido);
        this.CI = CI;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }


}
