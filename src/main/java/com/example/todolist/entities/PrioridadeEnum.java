package com.example.todolist.entities;

public enum PrioridadeEnum {
    BAIXA(1),
    MEDIA(2),
    ALTA(3);
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
