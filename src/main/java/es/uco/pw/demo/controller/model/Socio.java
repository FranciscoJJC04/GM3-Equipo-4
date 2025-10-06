package es.uco.pw.demo.controller.model;
import java.time.LocalDate;

public class Socio {
    
    private String dni_;
    private String nombre_;
    private String apellidos_;
    private LocalDate fechaNacimiento_;
    private String direccion_;
    private LocalDate fechaInscripcion_;
    private boolean tieneTituloPatron_;
    private boolean esTitular_;
    private int idInscripcion_;

    public Socio() {}

    public Socio(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, String direccion,
                 LocalDate fechaInscripcion, boolean tieneTituloPatron, boolean esTitular, int idInscripcion) {
        dni_ = dni;
        nombre_ = nombre;
        apellidos_= apellidos;
        fechaNacimiento_ = fechaNacimiento;
        direccion_= direccion;
        fechaInscripcion_ = fechaInscripcion;
        tieneTituloPatron_= tieneTituloPatron;
        esTitular_ = esTitular;
        idInscripcion_ = idInscripcion;
    }

    // Getters 
    public String getDni() {return dni_; }
    public String getNombre() {return nombre_; }
    public String getApellidos() {return apellidos_; }
    public LocalDate getFechaNacimiento() {return fechaNacimiento_;}
    public String getDireccion() {return direccion_;}
    public LocalDate getFechaInscripcion() {return fechaInscripcion_;}
    public boolean getTieneTituloPatron() {return tieneTituloPatron_;}
    public boolean getEsTitular() {return esTitular_;}
    public int getIdInscripcion() {return idInscripcion_;}

    //Setters

    public void setDni(String dni) { dni_ = dni; }
    public void setNombre(String nombre) { nombre_ = nombre; }
    public void setApellidos(String apellidos) { apellidos_ = apellidos; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { fechaNacimiento_ = fechaNacimiento; }
    public void setDireccion(String direccion) { this.direccion_ = direccion; }
    public void setFechaInscripcion(LocalDate fechaInscripcion) { fechaInscripcion_ = fechaInscripcion; }
    public void setTieneTituloPatron(boolean tieneTituloPatron) { tieneTituloPatron_ = tieneTituloPatron; }
    public void setEsTitular(boolean esTitular) { esTitular_ = esTitular; }
    public void setIdInscripcion(int idInscripcion) { idInscripcion_ = idInscripcion; }
}


