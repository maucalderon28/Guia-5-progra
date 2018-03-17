
package guia;

/**
 *
 * @author mauca
 */
public class ClasePuntaje {
    private int puntaje;

    public ClasePuntaje() {
        this.puntaje=0;
    }
    public void BateriaPantalla(int capacidad, double tamanio){
        if (tamanio<=4) {
            if (capacidad<=1200) {
                puntaje+=3;
            } else if(capacidad>1200 && capacidad <=2400) {
                puntaje+=4;
            }else if (capacidad>2400 && capacidad<=3100) {
                puntaje+=5;
            }else if (capacidad>3100) {
                puntaje+=6;
            }
        } else {
            if (capacidad<=1200) {
                puntaje+=3;
            } else if(capacidad>1200 && capacidad <=2400) {
                puntaje+=4;
            }else if (capacidad>2400 && capacidad<=3100) {
                puntaje+=5;
            }else if (capacidad>3100) {
                puntaje+=6;
            }
        }
    }
    public void Marca(int indexMarca){
        if (indexMarca>0 && indexMarca<7) {
                puntaje+=4;
            } else if(indexMarca>6 && indexMarca<10) {
                puntaje+=3;
            }else {
                puntaje+=2;
            }
    }
    public void RangoPrecio(int precio){
        if (precio>0 && precio<100) {
                puntaje+=2;
            } else if(precio>=100 && precio<=350) {
                puntaje+=3;
            }else if(precio>=350) {
                puntaje+=4;
            }
    }
    public void Garantia(int garantia){
        if (garantia>0 && garantia<=3) {
                puntaje+=1;
            } else if(garantia>3 && garantia<6) {
                puntaje+=2;
            }else if(garantia>=6) {
                puntaje+=3;
            }
    }
    public void Nucleos (int cpu){
        if (cpu == 2) {
            puntaje += 0;
        } else if (cpu == 4) {
            puntaje += 1;
        } else if (cpu == 6) {
            puntaje += 2;
        } else if (cpu == 8) {
            puntaje += 3;
        }
    }
     public void RAM(int ram){
         if (ram <=1) {
            puntaje += 0;
        } else if (ram>1 && ram<=2) {
            puntaje += 2;
        } else if (ram>2 && ram<=4) {
            puntaje += 4;
        } else if (ram>4) {
            puntaje += 6;
        }
     }
    public void pixelaje(int principal, int secundaria,boolean flash) {
        if (principal>0 && principal<= 5) {
            if (secundaria>0 && secundaria <= 2) {
                puntaje += 1;
            } else if (secundaria > 2) {
                puntaje += 2;
            }else if(secundaria==0){
                puntaje+=0;
            }

        } else if (principal > 5 && principal <= 8) {
            if (secundaria>0 && secundaria <= 2) {
                puntaje += 1;
            } else if (secundaria > 2 && secundaria <= 3) {
                puntaje += 2;
            } else if (secundaria > 3) {
                puntaje += 3;
            }if(secundaria==0){
                puntaje+=0;
            }
        } else if (principal > 8) {
            if (secundaria>0 && secundaria <= 2) {
                puntaje += 1;
            } else if (secundaria > 2 && secundaria <= 5) {
                puntaje += 2;
            } else if (secundaria > 5) {
                puntaje += 3;
            }if(secundaria==0){
                puntaje+=0;
            }
        }else{
            puntaje+=0;
        }
        if (flash==false) {
            puntaje=puntaje-1;
        }

    }
    public String EnviarPuntaje(){
        return ""+puntaje;
    }
}
