
package tareagrupal;


public class Tareagrupal {

    
    public static void main(String[] args) {
        

//Estrella 

        //DEPORTISTA 
        Deportista D1=new Deportista();
        D1.establecerNombre("Lionel Andres Messi Cuccittini");
        D1.establecerEdad(33);
        D1.establecerEspecialidad("Futbolista");
        D1.establecerNacionalidad("Argentino");
        
        D1.imprimirInfo();
        
        
        D1.setEstatura(1.7);
        D1.setFecha("24 de junio de 1987");
        D1.setEquipo("F.C Barcelona/Delantero y Seleccion de Argentina/Delantero");
        D1.setSalario(26.7);
        
        System.out.println("\nFecha de nacimiento:"+D1.getFecha()+"\nEstatura:"+D1.getEstatura()+
                           "m\nEquipo(s):"+D1.getEquipo()+"\nSalario:"+D1.getSalario()+"millones");
        
        D1.trayectoria();
    }
    
}
