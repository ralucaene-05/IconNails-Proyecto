package datos


public class Cita {
    private int id;
    private String nombreCliente;
    private String servicio;
    private double precio;

  
    public Cita(int id, String nombreCliente, String servicio, double precio) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.servicio = servicio;
        this.precio = precio;
    }

    public int getId() { return id; }
    public String getNombreCliente() { return nombreCliente; }
    public String getServicio() { return servicio; }
    public double getPrecio() { return precio; }
}
