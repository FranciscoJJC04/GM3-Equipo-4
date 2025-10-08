package es.uco.pw.demo.controller.model;

public class SociosAlquiler {
    
    private int id_alquiler_;
    private String dni_socio_;

    //Getters
    public int GetIdAlquiler(){return id_alquiler_;}
    public String GetDniSocio(){return dni_socio_;}

    //Setters
    public void SetIdAlquiler(int id_alquiler){id_alquiler_=id_alquiler;}
    public void SetDniSocio(String dni_socio){dni_socio_=dni_socio;}

    //Constructores:

    public SociosAlquiler(){}

    public SociosAlquiler(int id_alquiler, String dni_socio){
        id_alquiler_=id_alquiler;
        dni_socio_=dni_socio;
    }


}
