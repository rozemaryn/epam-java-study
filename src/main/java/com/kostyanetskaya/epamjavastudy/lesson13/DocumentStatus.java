package com.kostyanetskaya.epamjavastudy.lesson13;

public enum DocumentStatus {
    NEW(31),
    DRAFT(23),
    PUBLISHED(52),
    ARCHIVED(77);

    private int statusCode;

    private DocumentStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public static void main(String[] arg) {
        for (DocumentStatus docSt : DocumentStatus.values()) {
            System.out.println("Name = " + docSt.name() +
                    ", statusCode is = " + docSt.getStatusCode());
        }
    }
}
