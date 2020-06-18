package examen1;

public class Area {

    private int codigo;
    private String nombre;
    private int categoria;
    private String celular;
    private double sueldobruto;
    private double desc;
    private double sueldoneto;

    public Area(int codigo, String nombre, String celular) {
        this.codigo = 12345678;
        this.nombre = nombre;
        this.categoria = 1;
        this.celular = celular;
        this.sueldobruto = 6300;
        this.desc = 6300 * 0.15;
        this.sueldoneto = desc - sueldobruto;
    }

    public Area(int codigo, String nombre, int categoria, String celular) {
        //validando por categoria 
        if (categoria == 0) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.categoria = categoria;
            this.celular = celular;
            this.sueldobruto = 7200;
            this.desc = sueldobruto * 0.15;
            this.sueldoneto = desc - sueldobruto;   
        } else if (categoria == 1) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.categoria = categoria;
            this.celular = celular;
            this.sueldobruto = 6300;
            this.desc = sueldobruto * 0.15;
            this.sueldoneto = desc - sueldobruto;
        } else if (categoria == 2) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.categoria = categoria;
            this.celular = celular;
            this.sueldobruto = 5100;
            this.desc = sueldobruto * 0.15;
            this.sueldoneto = desc - sueldobruto;
        } 
    }
    public Area() {
        this.codigo = 54321;
        this.nombre = "Pedro López";
        this.categoria = 0;
        this.celular = "960503719";
        this.sueldobruto = 7200;
        this.desc = sueldobruto * 0.15 ;
        this.sueldoneto = sueldobruto - desc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {

    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public double getSueldobruto() {
        return sueldobruto;
    }

    public void setSueldobruto(double sueldobruto) {
        this.sueldobruto = sueldobruto;
    }

    public double getDesc() {
        return desc;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }

    public double getSueldoneto() {
        return sueldoneto =  sueldobruto - desc;
    }

    public void setSueldoneto(double sueldoneto) {
        this.sueldoneto = sueldoneto;
    }

    String setDesc(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
