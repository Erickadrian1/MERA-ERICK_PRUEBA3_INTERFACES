package dominio;


public class Ahorro {
    private String NOMBRES;
    private double SaldoPersona;
    private static int Contador;
    private int Cuenta;
   
    public Ahorro(String nombre, double saldo) {
        this.NOMBRES= nombre;
        this.SaldoPersona= saldo;
        this.Cuenta = Ahorro.Contador++;
    }

    public int getCuenta() {
        return Cuenta;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }
    
     public double getSaldoPersona(){
        return SaldoPersona;
    }

    public void setNOMBRES(String nombre) {
        this.NOMBRES= nombre;
    }

    public void setSaldoPersona(double saldo) {
        this.SaldoPersona = saldo;
    }
    
     public void RETIRAR(double cantidad) {
       this.SaldoPersona = this.SaldoPersona - cantidad;
    }
   
     public void DEPOSITAR(double cantidad) {
        this.SaldoPersona = this.SaldoPersona + cantidad;
    }
     
    @Override
    public String toString(){
    return getNOMBRES();
}
    
}



