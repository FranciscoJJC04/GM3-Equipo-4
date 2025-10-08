package es.uco.pw.demo.controller.model;
import java.time.LocalDate;

public class Reserva {
    private int id_reserva_;
    private String dni_socio_;
    private String matricula_;
    private LocalDate fecha_;
    private int plazas_reservadas_;
    private String proposito_;
    private float precio_total_;

    //Getters

    public int GetId(){return id_reserva_;}
    public String GetDni(){return dni_socio_;}
    public String GetMatricula(){return matricula_;}
    public LocalDate GetFecha(){return fecha_;}
    public int GetPlazas(){return plazas_reservadas_;}
    public String GetProposito(){return proposito_;}
    public float GetPrecio(){return precio_total_;}

    //Setters

    public void SetId(int id_reserva){id_reserva_=id_reserva;}
    public void SetDni(String dni_socio){dni_socio_=dni_socio;}
    public void SetMatricula(String matricula){matricula_=matricula;}
    public void SetFecha(LocalDate fecha){fecha_=fecha;}
    public void SetPlazas(int plazas_reservadas){plazas_reservadas_=plazas_reservadas;}
    public void SetProposito(String proposito){proposito_=proposito;}
    public void SetPrecio(float precio_total){precio_total_=precio_total;}

    //Constructores

    public Reserva(){}

    public Reserva(int id_reserva, String dni_socio, String matricula, LocalDate fecha, int plazas_reservadas, String proposito, float precio_total){
        id_reserva_=id_reserva;
        dni_socio_=dni_socio;
        matricula_=matricula;
        fecha_=fecha;
        plazas_reservadas_=plazas_reservadas;
        proposito_=proposito;
        precio_total_=precio_total;
    }

}
