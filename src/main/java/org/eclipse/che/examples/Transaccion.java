package org.eclipse.che.examples;
import java.util.Date;

public class Transaccion {
    private String transaccion;
    private int monto;
    private Date fecha;
    private int saldoF;
    private String rutR;
    private String rutE;

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getSaldoF() {
        return saldoF;
    }

    public void setSaldoF(int saldoF) {
        this.saldoF = saldoF;
    }

    public String getRutR() {
        return rutR;
    }

    public void setRutR(String rutR) {
        this.rutR = rutR;
    }

    public String getRutE() {
        return rutE;
    }

    public void setRutE(String rutE) {
        this.rutE = rutE;
    }
}
