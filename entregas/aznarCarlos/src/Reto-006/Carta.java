public class Carta{
    private char palo;
    private intq valor;

private carta(){
    this.palo = ' ';
    this.valor = 0;
}
public carta(char nuevoPalo,int nuevoValor){
if(nuevoValor < 1 || nuevoValor > 13){
    throw new IllegalArgumentException("Valor de carta no válido. Debe estar entre 1 y 13.");
}else{
    this.valor = nuevoValor;
}
if(nuevoPalo != 'C' && nuevoPalo != 'D' && nuevoPalo != 'T' && nuevoPalo != 'P'){
    throw new IllegalArgumentException("Palo de carta no válido. Debe ser 'C', 'D', 'T' o 'P'.");
}else{
    this.palo = nuevoPalo;
}
}
public String toString(){
    return NombrePalo() + " " + this.valor;
}