import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public record Moneda(
        String result,
        String documentation,
        String terms_of_use,
        int time_last_update_unix,
        String time_last_update_utc,
        String time_next_update_unix,
        String time_next_update_utc,
        String base_code,
        Map<String, Double> conversion_rates ) {


    @Override
    public String toString() {
        return "base_code='" + base_code + '\'' +
                ", conversion_rates=" + conversion_rates +
                '}';
    }


    public Double getConversionRate(String listaMoneda) {
            return conversion_rates.get(listaMoneda);

}
}

