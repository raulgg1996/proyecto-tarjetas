/*
 * @author Raul Gonzalez Gonzalez
 * @version 3.5.1
 */
public class Tarjeta
{
    private float saldo;
    public Tarjeta()
    {
        saldo=0;
    }
   /*
    * @param metodo que recibe como parametro el dinero a depositar en la
    * cuenta.
    */
    public void depositar(float dinero)
    {
        if(dinero>0)
        {
            saldo=saldo+dinero;
        }
      
    }
    /*
    * @param metodo que recibe como parametro el dinero a retirar en la
    * cuenta.
    * @return regresa 0 en dado caso que no se acepto el retiro.
    */
    public float retirar(float dinero)
    {
        if(saldo>=dinero)
        {
            saldo=saldo-dinero;
            return dinero;
        }
        else return 0;
    }
    /*
     * metodo de acceso que permite consultar el dinero disponible en la
     * cuenta.
     */
    public float consulta()
    {
        
        
            return saldo;
     
    }
    /*
    * @param metodo que recibe como parametro la cantidad a pagar y 
    * decrementa el saldo disponible.
    */
    public void pagar(float pago)
    {
        if(saldo>=pago)
        {
            saldo=saldo-pago;
        
        }
        
    }
}   
   
    