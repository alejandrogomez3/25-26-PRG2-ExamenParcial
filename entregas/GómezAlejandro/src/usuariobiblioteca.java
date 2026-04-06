class usuariobiblioteca {

    public usuariobiblioteca(String usuario, String DNI, String direccion);

    public void prestamo(double cantidad);

    public void devoluciones(double cantidad);

    public double consultarPrestamos();

    public String consultarHistorial();
}
public class usuariobiblioteca {

    private String usuario;
    private String DNI;
    private String direccion;
    private double prestamos;
    private String historial;

    public usuariobiblioteca(String usuario, String DNI, String direccion) {
        this.usuario = usuario;
        this.DNI = DNI;
        this.direccion = direccion;
        this.prestamos = 0;
        this.historial = "";
    }

    public void prestamo(double cantidad) {
        if (cantidad > 0) {
            prestamos = prestamos + cantidad;
            historial = historial + "Préstamo de " + cantidad + "\n";
        }
    }

    public void devoluciones(double cantidad) {
        if (cantidad > 0) {
            prestamos = prestamos - cantidad;
            if (prestamos < 0) {
                prestamos = 0;
            }
            historial = historial + "Devolución de " + cantidad + "\n";
        }
    }

    public double consultarPrestamos() {
        return prestamos;
    }

    public String consultarHistorial() {
        return historial;
    }
}
