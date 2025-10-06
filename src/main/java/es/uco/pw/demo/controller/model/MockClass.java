package es.uco.pw.demo.controller.model;

//AL estar dentro de la misma carpeta no nos tocaría importar a case dummy

public class MockClass {
    public void testDummy(){
        DummyClass dummy=new DummyClass("id001", 1, DummyClass.Estado.NOTDUMMY);

        System.out.println("ID: " + dummy.getId());
        System.out.println("Estado: " + dummy.getStatus());
    }
}
