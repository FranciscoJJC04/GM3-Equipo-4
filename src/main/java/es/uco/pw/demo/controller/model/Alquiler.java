package es.uco.pw.demo.controller.model;
import java.time.LocalTime;
public class Alquiler {
    
    private int id_alquiler_;
    private String dni_socio_;
    private String matricula_;
    private LocalTime fecha_inicio_;
    private LocalTime fecha_fin_;
    private int plazas_reservadas_;
    private float precio_total_;

    //Getters

    public int GetId(){return id_alquiler_;}
    public String GetDni(){return dni_socio_;}
    public String GetMatricula(){return matricula_;}
    public LocalTime GetFechaInicio(){return fecha_inicio_;}
    public LocalTime GetFechaFin(){return fecha_fin_;}
    public int GetPlazas(){return plazas_reservadas_;}
    public float GetPrecioTotal(){return precio_total_;}

    //Setters

    public void SetId(int id_alquiler){id_alquiler_=id_alquiler;}
    public void SetDni(String dni_socio){dni_socio=dni_socio_;}
    public void SetFechaInicio(LocalTime fecha_inicio){fecha_inicio_=fecha_inicio;}
    public void SetFechaFin(LocalTime fecha_fin){fecha_fin_=fecha_fin;}
    public void SetPlazas(int plazas_reservadas){plazas_reservadas_=plazas_reservadas;}
    public void SetPrecioTotal(float precio_total){precio_total_=precio_total;}

    //Constructores:

    public Alquiler(){}

    public Alquiler(int id_alquiler, String dni_socio, LocalTime fecha_inicio, LocalTime fecha_fin, int plazas_reservadas, float precio_total){
        id_alquiler_=id_alquiler;
        dni_socio_=dni_socio;
        fecha_inicio_=fecha_inicio;
        fecha_fin_=fecha_fin;
        plazas_reservadas_=plazas_reservadas;
        precio_total_=precio_total;
    }

}
