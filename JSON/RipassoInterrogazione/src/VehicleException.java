public class VehicleException extends Exception {
    private String addMessage = "VEICOLO GIA' PRESENTE NELLA CONCESSIONARIA!";
    private String removeMessage = "VEICOLO NON PRESENTE NELLA CONCESSIONARIA!";

    public String getAddMessage() {
        return addMessage;
    }

    public String getRemoveMessage() {
        return removeMessage;
    }
}