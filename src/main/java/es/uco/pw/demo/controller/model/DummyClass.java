package es.uco.pw.demo.controller.model;

public class DummyClass {
//^Aquí podriamos poner una cosa que es un "final" para indicar que una clase es final y no se puede heredar de ella, nos servirá más adelante

//En java al declarar una clase no es como en C++ aquí, hay que indicar cada cosa si es pública o privada.
//Esto se puede ver también con las clases.

private String id_;
private int testint_;
private Estado status_; 
public enum Estado{
    DUMMY,
    NOTDUMMY,
    DUMMIEST
}

//Esto es un constructor 

public DummyClass(String id, int testint, Estado status){
    id_=id;
    testint_=testint;
    status_=status;
    //Este construcyor se puede hacer introduciendo los seters pero
    // saldría un warning de que se podría sobre escribir para ello habría que hacer la clase final
}

public String getId(){
    return id_;
}

public int getTestint(){
    return testint_;
}
public Estado getStatus(){
    return status_;
}

//SETTERS

public void setId(String id){
    id_=id;
}
public void setStatus(Estado status){
    status_=status;
}
public void setTestint(int testint){
    testint_=testint;
}
}



    
