package postfijaainfija.app;

import java.util.Stack;

/**
 * 
 * 
 */
public class PostfijaAInfija {
    /**
     * Comprobar si el caracter es un operador (a, b, c ... ) o no
     * @param x valor a verficar
     * @return true si es un operador, false si no lo es
     */
    private  boolean esUnOperador(char x){
        return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
    }
    public String cadenaInfija(String expresionPostfija){
        Stack<String> pila = new Stack<String>();
        int contador = 0;
        while(contador < expresionPostfija.length()){
            if(esUnOperador(expresionPostfija.charAt(contador))){
                pila.push(expresionPostfija.charAt(contador) + "");
            }
            else{
                String operador1 = pila.peek();
                pila.pop();
                String operador2 = pila.peek();
                pila.pop();
                pila.push("(" + operador2 + expresionPostfija.charAt(contador) + operador1 + ")");
            }
            contador++;
        }
        return pila.peek();
    }
}
