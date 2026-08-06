package co.istad.chhaya.elearning.exception;

public record FiledErrorResponse(
        String filed,
        String reason
) {
}
