package Patrones;

import java.util.HashMap;
import java.util.Map;

public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;
    private Map<String, String> parametrosConexionBD;
    private Map<String, String> configuracionesUI;

    private ConfiguracionSistema() {
        // Inicializar las configuraciones del sistema
        parametrosConexionBD = new HashMap<>();
        parametrosConexionBD.put("host", "localhost");
        parametrosConexionBD.put("database", "ecommerce");
        parametrosConexionBD.put("user", "cristian");
        parametrosConexionBD.put("password", "ecommerce_password");

        configuracionesUI = new HashMap<>();
        configuracionesUI.put("tema", "oscuro");
        configuracionesUI.put("idioma", "inglés");
    }

    public static ConfiguracionSistema getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    public Map<String, String> getParametrosConexionBD() {
        return parametrosConexionBD;
    }

    public Map<String, String> ConfiguracionesUI() {
        return configuracionesUI;
    }

    public String getParamBD(String nombreParametro) {
        if (parametrosConexionBD.containsKey(nombreParametro)) {
            return parametrosConexionBD.get(nombreParametro);
        } else {
            return "";
        }
    }

    public void setParamBD(String nombreParametro, String valor) {
        if (parametrosConexionBD.containsKey(nombreParametro)) {
            parametrosConexionBD.replace(nombreParametro, valor);
        }
    }

    public String getParamUI(String nombreParametro) {
        if (configuracionesUI.containsKey(nombreParametro)) {
            return configuracionesUI.get(nombreParametro);
        } else {
            return "";
        }
    }
}