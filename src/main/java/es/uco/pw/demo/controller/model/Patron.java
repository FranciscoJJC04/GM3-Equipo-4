package es.uco.pw.demo.controller.model;
import java.time.LocalDate;

public class Patron {
    private String dni_;
    private String nombre_;
    private String apellidos_;
    private LocalDate fecha_nacimiento_;
    private LocalDate fecha_expedicion_;

    //Getters:
    public String GetDni(){return dni_;}
    public String GetNombre(){return nombre_;}
    public String GetApellidos(){return apellidos_;}
    public LocalDate GetFechaNacimiento(){return fecha_nacimiento_;}
    public LocalDate GetFechaExpedicion(){return fecha_expedicion_;}

    //Setters:
    public void SetDni(String dni){dni_=dni;}
    public void SetNombre(String nombre){nombre_=nombre;}
    public void SetApellidos(String apellidos){apellidos_=apellidos;}
    public void SetFechaNacimiento(LocalDate fecha_nacimiento){fecha_nacimiento_=fecha_nacimiento;}
    public void SetFechaExpiracion(LocalDate fecha_expedicion){fecha_expedicion_=fecha_expedicion;}

    //Constructores:
    public Patron(){}

    public Patron(String dni, String nombre, String apellidos, LocalDate fecha_nacimiento, LocalDate fecha_expedicion){
        dni_=dni;
        nombre_=nombre;
        apellidos_=apellidos;
        fecha_nacimiento_=fecha_expedicion_;
        fecha_expedicion_=fecha_expedicion;
    }
}
