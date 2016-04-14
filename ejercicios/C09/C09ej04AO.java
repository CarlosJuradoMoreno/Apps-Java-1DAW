public class C09ej04AO {

  // N determina el tamaño del array
  static int N = 100;
  
  public static void main(String[] args) {

    //Crea el array de discos
    Disco[] album = new Disco[N];

    // Crea todos los discos que van en cada una de
    // las celdas del array
    for(int i = 0; i < N; i++) {
      album[i] = new Disco();
    }

    int opcion;
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    int duracionIntroducida;
    int primeraLibre;
    int i;
    
    do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
      case 1:
        System.out.println("\nLISTADO");
        System.out.println("=======");
        System.out.println("Seniale el tipo de listado que desea (Autor, genero, tiempo)");
        entradaListado(System.console().readLine());
        break;
        
      case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");
        
        // Busca la primera posición libre del array
        primeraLibre = -1;
        do {
          primeraLibre++;
        } while (!((album[primeraLibre].getCodigo()).equals("LIBRE")));
        if(primeraLibre==(N-1)){						//Modificacion para saber si esta lleno
        System.out.println("Error, Borre algun disco");	
        }else{
        System.out.println("Por favor, introduzca los datos del disco.");  
        
        System.out.print("Código: ");
        codigoIntroducido = System.console().readLine();
        int k=0;
        boolean coincide=false;
        while(k<album.length&&!coincide){
        	if(album[k].getCodigo().equals(codigoIntroducido)){
        		coincide=true;
        	}
        	k++;
        }
        if(!coincide){
        	album[primeraLibre].setCodigo(codigoIntroducido);
        }else{
        	System.out.println("ERROR, DISCO YA EXISTENTE");
        }
        
        System.out.print("Autor: ");
        autorIntroducido = System.console().readLine();
        album[primeraLibre].setAutor(autorIntroducido);
        
        System.out.print("Título: ");
        tituloIntroducido = System.console().readLine();
        album[primeraLibre].setTitulo(tituloIntroducido);
        
        System.out.print("Género: ");
        generoIntroducido = System.console().readLine();
        album[primeraLibre].setGenero(generoIntroducido);
        
        System.out.print("Duración: ");
        duracionIntroducida = Integer.parseInt(System.console().readLine());
        album[primeraLibre].setDuracion(duracionIntroducida);
        }
        break;
        
      case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigoIntroducido = System.console().readLine();
  
        i = -1;
        do {
          i++;
        } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
        
        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
  
        System.out.println("Código: " + album[i].getCodigo());
        System.out.print("Nuevo código: ");
        codigoIntroducido = System.console().readLine();
        if (!codigoIntroducido.equals("")) {
          album[i].setCodigo(codigoIntroducido);
        }
        
        System.out.println("Autor: " + album[i].getAutor());
        System.out.print("Nuevo autor: ");
        autorIntroducido = System.console().readLine();
        if (!autorIntroducido.equals("")) {
          album[i].setAutor(autorIntroducido);
        }
        
        System.out.println("Título: " + album[i].getTitulo());
        System.out.print("Nuevo título: ");
        tituloIntroducido = System.console().readLine();
        if (!tituloIntroducido.equals("")) {
          album[i].setTitulo(tituloIntroducido);
        }
        
        System.out.println("Género: " + album[i].getGenero());
        System.out.print("Nuevo género: ");
        generoIntroducido = System.console().readLine();
        if (!generoIntroducido.equals("")) {
          album[i].setGenero(generoIntroducido);
        }
        
        System.out.println("Duración: " + album[i].getDuracion());
        System.out.print("Duración: ");
        duracionIntroducidaString = System.console().readLine();
        if (!duracionIntroducidaString.equals("")) {
          album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
        }
        
        break;
        
      case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigoIntroducido = System.console().readLine();
        boolean exista=false;
        int j=0;
        while(j<album.length&&!exista){
        	if(album[j].getCodigo().equals(codigoIntroducido)){
        		exista=true;
        	}
        	j++;
        }
        i = -1;
        do {
          i++;
        } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
        album[i].setCodigo("LIBRE");
        System.out.println("Album borrado.");
        
        break;
        
      default:
      
      } // switch
    } while (opcion != 5);
  }
  
  private void entradaListado(String s){
	  if(s.equalsIgnoreCase("Autor")){
		  System.out.println();
	  }else if( s.equalsIgnoreCase("genero")){
		  
	  }else if(s.equalsIgnoreCase("Rango")){
		  
	  }
  }
}