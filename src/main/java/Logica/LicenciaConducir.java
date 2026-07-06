package Logica;
/**
 *
 * @author USER
 */
public class LicenciaConducir {
    private int num;
    private String tipoLic;
    private String fechaVencimiento;

    public LicenciaConducir() {
    }

    public LicenciaConducir(int num, String tipoLic, String fechaVencimiento) {
        this.num = num;
        this.tipoLic = tipoLic;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void mostrarLicencia() {
        System.out.println("Numero: " + num);
        System.out.println("Tipo: " + tipoLic);
        System.out.println("Vencimiento: " + fechaVencimiento);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTipoLic() {
        return tipoLic;
    }

    public void setTipoLic(String tipoLic) {
        this.tipoLic = tipoLic;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
