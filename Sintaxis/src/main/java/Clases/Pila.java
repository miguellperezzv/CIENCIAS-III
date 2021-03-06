package Clases;


public class Pila {
private Nodo UltimoValorIngresado;

public Pila()
{
    UltimoValorIngresado = null;
}

//Método para ingresar dentro de la pila

public void insertar(String valor)
{
    Nodo nuevo_nodo = new Nodo();
    nuevo_nodo.informacion= valor;
    
    if (UltimoValorIngresado==null)
    {
        nuevo_nodo.siguiente = null;
        UltimoValorIngresado = nuevo_nodo;
        
    }    else{
        
        nuevo_nodo.siguiente= UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
    }
}
    
public String Extraer()
{
    if (UltimoValorIngresado != null)
    {
        String informacion = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        return informacion;
        
    }else {
        return null;   
    }    
       
}

//Método para saber si la pila esta vacia
    
    public boolean PilaVacia()
    {
        return UltimoValorIngresado == null;
    }
    
}

