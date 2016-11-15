package org.eclipse.che.examples;
import java.util.List;
import java.util.Date;

public class Operacion {
      public String login(String rut, String password) {
        if (existCuenta(rut, password)) {
            return "/home";
        }
        return "/login";
    }

    public String deposito(String rut, int monto) {
        Cuenta c = getCuentaByRut(rut);
        int saldoF = c.getSaldo() + monto;
        c.setSaldo(saldoF);
        Transaccion t = new Transaccion();
        t.setFecha(new Date());
        t.setMonto(monto);
        t.setRutE(c.getRut());
        t.setRutR(c.getRut());
        t.setSaldoF(saldoF);
        t.setTransaccion("Deposito");
        List<Transaccion> tC = c.getTransacciones();
        tC.add(t);
        c.setTransacciones(tC);

        return "ok";
    }

    public String retiro(String rut, int monto) {
        Cuenta c = getCuentaByRut(rut);
        int saldoF = c.getSaldo() - monto;
        c.setSaldo(saldoF);
        Transaccion t = new Transaccion();
        t.setFecha(new Date());
        t.setMonto(monto);
        t.setRutE(c.getRut());
        t.setRutR(c.getRut());
        t.setSaldoF(saldoF);
        t.setTransaccion("Retiro");
        List<Transaccion> tC = c.getTransacciones();
        tC.add(t);
        c.setTransacciones(tC);
        return "ok";
    }

    public String transferir(String rutR, String rutRE, int monto) {
        Cuenta r = getCuentaByRut(rutR);
        Cuenta re = getCuentaByRut(rutRE);

        Transaccion t = new Transaccion();
        t.setFecha(new Date());
        t.setMonto(monto);
        t.setRutE(r.getRut());
        t.setRutR(r.getRut());
        t.setTransaccion("Transferencia");
        t.setSaldoF(r.getSaldo());
        int saldoRE = re.getSaldo() + monto;
        re.setSaldo(saldoRE);
        List<Transaccion> tR = r.getTransacciones();
        tR.add(t);
        r.setTransacciones(tR);
        return "ok";
    }

    public List<Transaccion> getTransaccionesByCuenta(String rut) {
        Cuenta c = getCuentaByRut("12345678-9");
        if (c != null) {
            return c.getTransacciones();
        }
        return null;
    }

    public boolean cerrarC(String rut) {
        Cuenta c = getCuentaByRut(rut);
        c.setEstado(true);
        return true;
    }

    public boolean existCuenta(String rut, String password) {
        if (Registro.c.getRut().equals(rut) && Registro.c.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public Cuenta getCuentaByRut(String rut) {
        if (Registro.c.getRut().equals(rut)) {
            return Registro.c;
        }
        return null;
    }
}
