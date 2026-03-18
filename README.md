# tarea7-pila-Rodas

Sistema de Bitácora de la USS Algoritmo — implementación del TDA Pila en Java.

## Estructura del proyecto

```
tarea7-pila-Rodas/
└── src/
    └── Main.java
```

## Compilar y ejecutar

Desde la raíz del repositorio:

```bash
javac src/Main.java
java -cp src Main
```

> Requiere Java 8 o superior.

## Salida esperada

```
╔══════════════════════════════════════════════╗
║     USS ALGORITMO — BITÁCORA DE EVENTOS      ║
╚══════════════════════════════════════════════╝

📡 Registrando eventos de misión...
✅ 6 eventos registrados.

🔍 Último evento registrado:
   → ERROR CRÍTICO: fallo en sistema de navegación

🚨 ALERTA: Se detectó un ERROR crítico.
⚙️  Ejecutando protocolo de revisión: eliminando últimos 3 registros...

   [Removido 1] ERROR CRÍTICO: fallo en sistema de navegación
   [Removido 2] Escudos al 40%
   [Removido 3] Anomalía detectada en sector 7

📋 Estado actual de la bitácora:
   Total de eventos restantes : 3
   Evento en la cima          : Señal de comunicación estable

╔══════════════════════════════════════════════╗
║         FIN DEL REGISTRO DE MISIÓN           ║
╚══════════════════════════════════════════════╝
```

## Descripción

| Método | Operación TDA | Descripción |
|---|---|---|
| `registrar(evento)` | push | Agrega un evento a la cima |
| `consultarUltimo()` | peek/top | Retorna la cima sin eliminar |
| `eliminarUltimo()` | pop | Elimina y retorna la cima |
| `estaVacia()` | isEmpty | True si no hay eventos |
| `totalEventos()` | size | Número de eventos actuales |
