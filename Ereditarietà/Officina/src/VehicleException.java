public class VehicleException extends Exception {
    private String message = "ERRORE: veicolo non trovato";

    public VehicleException() {
    }

    public VehicleException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
