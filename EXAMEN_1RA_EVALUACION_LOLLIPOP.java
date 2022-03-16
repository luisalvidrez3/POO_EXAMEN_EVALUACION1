/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases_examen;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class EXAMEN_1RA_EVALUACION_LOLLIPOP {

  

    public static void main(String[] args) {
        DatosIntegrantes per1 = new DatosIntegrantes();
        per1.Apellidos = " Alvidrez Rueda";
        per1.Nombre = "Luis Fernando";
        per1.numControl = "21550350";
        per1.carrera = "Ingenieria en sistemas computacionales";
        per1.NombreDeEquipo = "Lollipop";
        
        DatosIntegrantes per2 = new DatosIntegrantes();
         per2.Apellidos = " Franco Manjarrez";
        per2.Nombre = "Maria de los Angeles";
        per2.numControl = "21550845";
        per2.carrera = "Ingenieria en sistemas computacionales";
        per2.NombreDeEquipo = "Lollipop";
        
        
          
          
          
       
        per1.imprimirDatosEquipo();
        per2.imprimirDatosEquipo();
       
        DatosIntegrantes res = new DatosIntegrantes();
        res.imprimirProblemasResueltos();
       
      
       
        
    }
    
}
class DatosIntegrantes{
  
    String Nombre;
    String numControl;
   String carrera;
    String Apellidos;
    String NombreDeEquipo;

   

  
    public void imprimirDatosEquipo(){
        System.out.println("Equipo :"+ NombreDeEquipo);
         System.out.println("Carrera: " + carrera);
        System.out.println("Integrante : " + Nombre + Apellidos );
        System.out.println(numControl);
        
        
        
    }
    public void imprimirProblemasResueltos(){
       
          Pelicula peli1 = new Pelicula();
          peli1.setTitulo(" Spider-Man #34");
          peli1.setEstudio(" Estudio: ya no tenemos ideas");
          peli1.setEdad(15);
          peli1.imprimirDatos();
           peli1.evaluarEdad();
           CONTRASEÑA contr1 = new CONTRASEÑA("usuario1","contraseñaSegura123");
           contr1.verificarAcceso();
            TestCovid test = new TestCovid();
         test.calcularPersonaRiesgo();
         Ficha lib1 = new Ficha();
         System.out.println("Libro 1: " );
         lib1.imprimirFicha();
         System.out.println("Libro 2: ");
         Ficha lib2 = new Ficha("Gonzalez, F.", "Basic Book Guide", 2005, "Merida", "Good Reads");
         lib2.imprimirFicha();
         
         
          
          
        
         
        
    }
  
  
    
    
    
}


class Pelicula{
    private String Titulo;
    private String Estudio;
    private int edad;
      private int edadPer;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstudio() {
        return Estudio;
    }

    public void setEstudio(String Estudio) {
        this.Estudio = Estudio;
    }

    public int getEdadPer() {
        return edadPer;
    }

    public void setEdadPer(int edadPer) {
        this.edadPer = edadPer;
    }
    
  
     public void imprimirDatos(){
         
         System.out.println("su pelicula es: " + Titulo + Estudio + " y es para edades de: " + edad);
           
          }
     
       public void evaluarEdad(){
            Scanner input = new Scanner(System.in);
       System.out.println("Escriba que edad tiene");
          edadPer = input.nextInt();
          if (edadPer< edad){
              System.out.println("es muy joven para ver esta pelicula");
          }
          else{
              System.out.println("cumple con la edad para ver la pelicula");
          }
       
   }
}
  class CONTRASEÑA {

   private String usuario;
     private String contraseña;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
     
     
    
    
    public CONTRASEÑA(String usuario, String contraseña){
       
               

        System.out.println("sus datos son: ");
        System.out.println("Usuario: " + usuario);
         System.out.println("Contraseña: " + contraseña);
         
   
         }

   
    
    
     

 
     
     public void verificarAcceso(){
         String usuarioVer;
         String contraseñaVer;
         Scanner input = new Scanner(System.in);
         System.out.println("verifique su nombre de usuario");
         usuarioVer = input.nextLine();
          System.out.println("verifique su contraseña");
         contraseñaVer = input.nextLine();
          boolean b = (usuario==usuarioVer||contraseña==contraseñaVer);
         System.out.println(b);
       
             
         }
         
     }
     
class TestCovid{
    private int edad;
    private double peso;
    private double altura;
    private String enfermedad;
        

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
 
    
    public void calcularPersonaRiesgo(){
       
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese su edad");
        edad = input.nextInt();
        input.nextLine();
        System.out.println("ingrese su altura (m)");
        altura = input.nextDouble();
         input.nextLine();
        System.out.println("ingrese su peso (kg)");
        peso = input.nextDouble();
         input.nextLine();
        System.out.println("¿tiene una enfermedad cronica? Y|N");
        enfermedad = input.nextLine();
        TestCovid imc = new TestCovid();
       
        
        if(enfermedad=="Y"){
            System.out.println("Persona de riesgo");
             }
        else if(edad>=65){
            System.out.println("Persona de riesgo");
        }
        else if (imc.calcularIMC()>30.0){
              System.out.println("Persona de riesgo");
        }
        else {
              System.out.println("Persona sin riesgo");
        }
    }
    
    
    
     private double calcularIMC(){
            double IMC = (peso)/(altura*altura);
            return IMC;
            }
   
}


  
class Ficha{
    private String autor;
    private String titulo;
    private int año;
    private String ciudad;
      private String estado;
        private String pais;
          private String editorial; 
            private int volumen;
              private int numVolumenes;
                private String traductor;
                  private String tituloBreve;
                    private String numeroEstandar;
                      private int paginas;
                       private String edicion;
                        private String comentarios;
                         private String medio;
                          private int añoConsulta;
                           private String mesConsulta;
                            private String dia;
                            private String URL;
                            private String DOI;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumVolumenes() {
        return numVolumenes;
    }

    public void setNumVolumenes(int numVolumenes) {
        this.numVolumenes = numVolumenes;
    }

    public String getTraductor() {
        return traductor;
    }

    public void setTraductor(String traductor) {
        this.traductor = traductor;
    }

    public String getTituloBreve() {
        return tituloBreve;
    }

    public void setTituloBreve(String tituloBreve) {
        this.tituloBreve = tituloBreve;
    }

    public String getNumeroEstandar() {
        return numeroEstandar;
    }

    public void setNumeroEstandar(String numeroEstandar) {
        this.numeroEstandar = numeroEstandar;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public int getAñoConsulta() {
        return añoConsulta;
    }

    public void setAñoConsulta(int añoConsulta) {
        this.añoConsulta = añoConsulta;
    }

    public String getMesConsulta() {
        return mesConsulta;
    }

    public void setMesConsulta(String mesConsulta) {
        this.mesConsulta = mesConsulta;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getDOI() {
        return DOI;
    }

    public void setDOI(String DOI) {
        this.DOI = DOI;
    }
    public Ficha(){
        autor= "Hernandez, F.A.";
        titulo= "Citas 4 dummies";
        año= 2012;
        ciudad= "Saucillo";
        estado= "Chihuahua";
        pais= "Mexico";
        editorial="Aqua Books";
        volumen= 4;
        numVolumenes= 12;
        traductor= "Galvan, F.";
        tituloBreve="C4D";
        numeroEstandar="ISBN 978-553435-424-9424";
        paginas=245;
        edicion="4ta";
        comentarios="Asi se cita";
        medio="fisico";
        añoConsulta=2022;
        mesConsulta="Enero";
        dia="Lunes 12";
        URL="http://www.books4free.rus";
        DOI="10.20/33837493728";          
    }
    public Ficha(String autor, String titulo, int año,String ciudad,String editorial){
        this.autor = autor;
         this.titulo = titulo;
          this.año = año;
           this.ciudad = ciudad;
            this.editorial = editorial;
        
    }
          public void imprimirFicha(){
              System.out.println(autor +""+ titulo+""+ año+""+ciudad+""+estado+""+pais+""+editorial);
              System.out.println(volumen+""+numVolumenes+""+traductor+""+tituloBreve+""+numeroEstandar);
              System.out.println(paginas+""+edicion+""+comentarios+""+medio+""+añoConsulta+""+mesConsulta+""+dia);
              System.out.println(URL+""+DOI);
          }
          
}