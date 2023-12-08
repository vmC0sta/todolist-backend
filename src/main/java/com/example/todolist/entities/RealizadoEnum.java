package com.example.todolist.entities;

public enum RealizadoEnum {
    NAO(0),
    SIM(1);
    private int valor;
    RealizadoEnum(int valor) {
    }
    public int getValor() {
        return valor;
    }
    public static RealizadoEnum valueOf(int valor) {
        for (RealizadoEnum realizadoEnum : values()) {
            if (realizadoEnum.valor == valor) {
                return realizadoEnum;
            }
        }
        throw new IllegalArgumentException("Valor inválido: " + valor);
    }
}
