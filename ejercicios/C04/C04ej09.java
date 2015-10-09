//Carlos Jurado Moreno
public class C04ej09{
  public static void main(String[] args){
    
    double a,b,c, sol,sol2;
    System.out.println("Vamos a resolver una ecuacion de estilo ax²+by+c=0");
    System.out.println("Inserte el valor de a");
    a=Double.parseDouble(System.console().readLine());
    System.out.println("Inserte el valor de b");
    b=Double.parseDouble(System.console().readLine());
    System.out.println("Inserte el valor de c");
    c=Double.parseDouble(System.console().readLine());
    
     if ((a==0)&&(b==0)&&(c!=0)){               //c=0
       System.out.println("No existe solucion");
     }else if ((a==0)&&(b!=0)&&(c==0)){               //bx=0
       System.out.println("No existe solucion");
     }
     
     if ((a!=0)&&(b==0)&&(c==0)){               //ax²=0
       System.out.println("No existe solucion");
    }else if ((a==0)&&(b!=0)&&(c!=0)){               //bx+c=0
      System.out.println("x= "+(-c/b));
    }else if ((a!=0)&&(b==0)&&(c!=0)){               //ax²+c=0
       System.out.println("x= +-"+Math.sqrt(-c/a));
    }else  if ((a!=0)&&(b!=0)&&(c==0)){               //ax²+bx=0
      System.out.println("x = 0, x= "+(-b/a));
    }else  if ((a!=0)&&(b!=0)&&(c!=0)){
      double temp;                      //variable temporal
      temp=Math.pow(-b,2)-(4*a*c);
      if(temp<0){
        System.out.println("Error: Numero dentro de la raiz negatio: "+ temp);
      }else{
        sol=(-b+(Math.sqrt(temp)))/(2*a);
        sol2=(-b-Math.sqrt(Math.pow(-b,2)-4*a*c))/(2*a);
        System.out.println("x1= "+sol+", x2= "+sol2);
    
      }
    }
     
  }
}
