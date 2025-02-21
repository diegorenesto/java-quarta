public class ViaggiException extends RuntimeException {
    private static String nullMessage = "ERRORE! VIAGGIO NULL!";
    private static String addMessage = "ERRORE! VIAGGIO GIA' PRESENTE NELLA LISTA!";
    private static String removeMessage = "ERRORE! VIAGGIO NON PRESENTE NELLA LISTA!";
    private static String choiceMessage = "ERRORE! SCELTA VIAGGIO NON VALIDA";

    public ViaggiException() {
    }

    public static String getNullMessage() {
        return nullMessage;
    }

    public static String getAddMessage() {
        return addMessage;
    }

    public static String getRemoveMessage() {
        return removeMessage;
    }

    public static String getChoiceMessage() {
        return choiceMessage;
    }
}