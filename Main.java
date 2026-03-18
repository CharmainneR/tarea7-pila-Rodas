// ============================================================
// USS Algoritmo — Sistema de Bitácora de Eventos
// Implementación del TDA Pila (Stack)
// ============================================================

// PARTE 3 — REFLEXIÓN:
// La Pila es ideal porque el acceso LIFO (Last In, First Out) garantiza
// que siempre consultemos el evento MÁS RECIENTE primero, exactamente
// lo que necesita el capitán en una emergencia. Con una lista normal
// accediendo por índice, no habría una semántica clara de "último evento":
// habría que calcular el índice final manualmente cada vez, lo cual es
// propenso a errores y no expresa la intención del sistema. La Pila
// encapsula esa lógica y hace que el código sea más seguro y legible.

import java.util.ArrayList;

// ============================================================
// PARTE 1 — TDA BitacoraStack
// ============================================================
class BitacoraStack {

    private ArrayList<String> elementos;

    public BitacoraStack() {
        this.elementos = new ArrayList<>();
    }

    // push — Agrega un nuevo evento a la cima de la bitácora
    public void registrar(String evento) {
        elementos.add(evento);
    }
    // peek/top — Devuelve el último evento sin eliminarlo
    public String consultarUltimo() {
        if (estaVacia()) {
            throw new RuntimeException(
                "⚠️  ERROR DE SISTEMA: La bitácora está vacía. No hay eventos que consultar."
            );
        }
        return elementos.get(elementos.size() - 1);
    }

    // pop — Elimina y devuelve el último evento registrado
    public String eliminarUltimo() {
        if (estaVacia()) {
            throw new RuntimeException(
                "⚠️  ERROR DE SISTEMA: La bitácora está vacía. No hay eventos que eliminar."
            );
        }
        return elementos.remove(elementos.size() - 1);
    }

    // isEmpty — Retorna true si no hay eventos registrados
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    // size — Retorna el número de eventos actuales
    public int totalEventos() {
        return elementos.size();
    }
}

// ============================================================
// PARTE 2 — La Misión
// ============================================================
public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║     USS ALGORITMO — BITÁCORA DE EVENTOS      ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        BitacoraStack bitacora = new BitacoraStack();

        // PASO 1 — Registrar los 6 eventos
        System.out.println("📡 Registrando eventos de misión...");
        bitacora.registrar("Motor de estribor encendido");
        bitacora.registrar("Velocidad warp alcanzada");
        bitacora.registrar("Señal de comunicación estable");
        bitacora.registrar("Anomalía detectada en sector 7");
        bitacora.registrar("Escudos al 40%");
        bitacora.registrar("ERROR CRÍTICO: fallo en sistema de navegación");
        System.out.println("✅ " + bitacora.totalEventos() + " eventos registrados.\n");

        // PASO 2 — Consultar e imprimir el último evento
        String ultimoEvento = bitacora.consultarUltimo();
        System.out.println("🔍 Último evento registrado:");
        System.out.println("   → " + ultimoEvento);
        System.out.println();

        // PASO 3 — Protocolo de revisión si hay ERROR
        if (ultimoEvento.contains("ERROR")) {
            System.out.println("🚨 ALERTA: Se detectó un ERROR crítico.");
            System.out.println("⚙️  Ejecutando protocolo de revisión: eliminando últimos 3 registros...");
            System.out.println();

            for (int i = 1; i <= 3; i++) {
                String removido = bitacora.eliminarUltimo();
                System.out.println("   [Removido " + i + "] " + removido);
            }
            System.out.println();
        }

        // PASO 4 — Estado actual de la bitácora
        System.out.println("📋 Estado actual de la bitácora:");
        System.out.println("   Total de eventos restantes : " + bitacora.totalEventos());
        System.out.println("   Evento en la cima          : " + bitacora.consultarUltimo());
        System.out.println();
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║         FIN DEL REGISTRO DE MISIÓN           ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }
}
