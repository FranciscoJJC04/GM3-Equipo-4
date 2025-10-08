package es.uco.pw.demo.controller.model;
import java.time.LocalDate;

public class Inscripcion {
    public enum Tipo{
        INDIVIDUAL,
        FAMILIAR
    }

    private int id_inscripcion_;
    private Tipo tipo_inscripcion_;
    private float cuota_total_;
    private LocalDate fecha_cracion_;
    private String dni_titular_;

    //Getters:

    public int GetId(){return id_inscripcion_;}
    public Tipo GetTipo(){return tipo_inscripcion_;}
    public float GetCuota(){return cuota_total_;}
    public LocalDate GetDate(){return fecha_cracion_;}
    public String GetTitular(){return dni_titular_;}

    //Setters:
     public void SetId(int id_inscripcion){id_inscripcion_=id_inscripcion;}
     public void SetTipo(Tipo tipo_inscripcion){tipo_inscripcion_=tipo_inscripcion;}
     public void SetCuota(float cuota_total){cuota_total_=cuota_total;}
     public void SetDate(LocalDate fecha_creacion){fecha_cracion_=fecha_creacion;}
     public void SetTitular(String dni_titular){dni_titular_=dni_titular;}

     //Constructores

     public Inscripcion(){}
     
     public Inscripcion(int id_inscripcion, Tipo tipo_inscripcion, float cuota_total, LocalDate fecha_creacion, String dni_titular){
        id_inscripcion_=id_inscripcion;
        tipo_inscripcion_=tipo_inscripcion;
        cuota_total_=cuota_total;
        fecha_cracion_=fecha_creacion;
        dni_titular_=dni_titular;
     }
}