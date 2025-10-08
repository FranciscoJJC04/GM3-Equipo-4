package es.uco.pw.demo.controller.model;

public class Embarcacion {
    public enum TipoBarco{
        VELERO,
        YATE,
        LANCHA,
        CATAMARAN
    }

    private String matricula_;
    private String nombre_;
    private TipoBarco tipobarco_;
    private int plazas_;
    private float eslora_;
    private float manga_;
    private String dni_patron_;

    //Getters

    public String GetMatricula(){return matricula_;}
    public String GetNombre(){return nombre_;}
    public TipoBarco GetTipo(){return tipobarco_;}
    public int GetPlazas(){return plazas_;}
    public float GetEslora(){return eslora_;}
    public float GetManga(){return manga_;}
    public String GetDni(){return dni_patron_;}

    //Setters

    public void SetMatricula(String matricula){matricula_=matricula;}
    public void SetNombre(String nombre){nombre_=nombre;}
    public void SetTipo(TipoBarco tipobarco){tipobarco_=tipobarco;}
    public void SetPlazas(int plazas){plazas_=plazas;}
    public void SetEslora(float eslora){eslora_=eslora;}
    public void SetManga(float manga){manga_=manga;}
    public void SetDni(String dni_patron){dni_patron_=dni_patron;}

    //Constructores

    public Embarcacion(){}
    
    public Embarcacion(String matricula, String nombre, TipoBarco tipobarco, int plazas, float eslora, float manga, String dni_patron){
        matricula_=matricula;
        nombre_=nombre;
        tipobarco_=tipobarco;
        plazas_=plazas;
        eslora_=eslora;
        manga_=manga;
        dni_patron_=dni_patron;
    }

}
