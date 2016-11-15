package org.eclipse.che.examples;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    private String            rut;
    private String            password;
    private int               saldo;
    private boolean           estado;
    private List<Transaccion> transacciones = new ArrayList<Transaccion>();

    public Cuenta(String rut, String password) {
        this.rut = rut;
        this.password = password;
        this.saldo = 0;
        this.estado = true;
        this.transacciones = new ArrayList<Transaccion>();
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
}
