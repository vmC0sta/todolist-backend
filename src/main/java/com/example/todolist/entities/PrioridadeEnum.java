package com.example.todolist.entities;

public enum PrioridadeEnum {
    BAIXA(0),
    MEDIA(1),
    ALTA(2);
    private int valor;
    PrioridadeEnum(int valor) {
    }
    public int getValor() {
        return valor;
    }
    public static PrioridadeEnum valueOf(int valor) {
        for (PrioridadeEnum prioridadeEnum : values()) {
            if (prioridadeEnum.valor == valor) {
                return prioridadeEnum;
            }
        }
        throw new IllegalArgumentException("Valor inválido: " + valor);
    }
}
