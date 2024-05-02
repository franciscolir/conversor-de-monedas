package com.alura.conversormonedas.monedas;

public record Moneda(
        String result,
        String documentation,
        String terms_of_use,
        int time_last_update_unix,
        String time_last_update_utc,
        String time_next_update_unix,
        String time_next_update_utc,
        String base_code,
        String target_code,
        double conversion_rate ) {


    @Override
    public String result() {
        return result;
    }
}

