public class PiantaException extends RuntimeException{
    private static String nullMessage = "ERRORE! LA PIANTA RISULTA NULL!";
    private static String addMessage = "ERRORE! PIANTA GIA' PRESENTE NELLA LISTA!";
    private static String removeMessage = "ERRORE! PIANTA NON PRESENTE NELLA LISTA!";
    private static String choiceMessage = "ERRORE! SCELTA NON VALIDA!";
    private static String findMessage = "ERRORE! PIANTA NON TROVATA NELLA LISTA!";
    private static String categoryMessage = "ERRORE! CATEGORIA NON TROVATA";

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

    public static String getFindMessage() {
        return findMessage;
    }

    public static String getCategoryMessage() {
        return categoryMessage;
    }
}