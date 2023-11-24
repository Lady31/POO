public class Comida{
    // CREACION DE ATRIBUTOS
    public String nombre_cliente;
    public int cedula;
    public String direccion;
    public String nombre_restaurante;
    public String tipo_comida;
    public int orden;
    public double total;
    // METODO DE CONSTRUCTOR
    public Comida (String nombre_cliente,int cedula,String
            direccion,String nombre_restaurante,String tipo_comida,int
                           orden,double total){
        this.nombre_cliente=nombre_cliente;
        this.cedula=cedula;
        this.direccion=direccion;
        this.nombre_restaurante=nombre_restaurante;
        this.tipo_comida=tipo_comida;
        this.orden=orden;
        this.total=total;
    }
    //CREACION DE METODOS FACTURA Y ENCUESTA
    public void Factura(){
        System.out.println("------BIENVENIDO-------");
        System.out.println("DATOS DE SU FACTURA: ");
        System.out.println("Nombre del cliente: "+nombre_cliente);
        System.out.println("Cédula: "+cedula);
        System.out.println("Dirección: "+direccion);
        System.out.println("Nombre del restaurante:
                "+nombre_restaurante);
                System.out.println(tipo_comida);
        System.out.println("Su orden es la numero: "+orden);
        System.out.println("Su valor total a pagar es de: "+total);
    }
    public void Encuesta(){
        System.out.println("-----ENCUESTA DE SATISFACCION-----");
        System.out.println("Este cliente estuvo satisfecho con la
                atencion y con su comida "+ nombre_cliente);
    }
    public static void main(String[]args){
        Comida comida1= new Comida("Yuverly",1720970779,"La
                Bretaña","MAYFLOWER","Chaulafan de pollo",16,5.99);
                Comida comida2= new
                Comida("Axel",1754329389,"Bellavista","KFC","Festin Navidad
                XL",98,29.99);
                Comida comida3= new Comida("Lady",1726423005,"La
                Bota","CAMPERO","Comparte 12 presas",27, 27.50);
                //LLAMAR A LA FUNCION
                comida1.Factura();
        comida2.Factura();
        comida3.Factura();
        comida1.Encuesta();
        comida2.Encuesta();
        comida3.Encuesta();
    }