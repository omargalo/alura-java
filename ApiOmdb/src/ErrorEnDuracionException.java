public class ErrorEnDuracionException extends RuntimeException {
    private String mensaje;

    public ErrorEnDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
