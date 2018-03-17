package guia;
public class validacion {
    private String letras[]= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","Y","X","Y","Z"};

    public validacion() {
    }
    
    public boolean validar (String letra){
        int contador=0;
        for (int i = 0; i < letras.length; i++) {
            if (letra.equals(letras[i])) {
                contador=1;   
            }
        }
        if (contador==1) {
            return true;
        } else {
            return false;
        }
    }
    
    
    
}
