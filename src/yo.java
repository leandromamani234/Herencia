public class yo extends Padre{
    int Celular;

    public yo(String ci, int celular) {
        super(ci);
        Celular = celular;
    }

    public yo(String nombre, String primerApellido, String segundoApellido, String ci, int celular) {
        super(nombre, primerApellido, segundoApellido, ci);
        Celular = celular;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int celular) {
        Celular = celular;
    }


}
