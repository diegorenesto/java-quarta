public class VehicleException extends RuntimeException {
    private String message = "Errore: veicolo non trovato";

    public VehicleException() {
    }

    @Override
    public String getMessage() {
        return message;
    }
}