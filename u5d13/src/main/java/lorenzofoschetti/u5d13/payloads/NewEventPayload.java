package lorenzofoschetti.u5d13.payloads;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;

public record NewEventPayload(
        @NotEmpty(message = "Il titolo è obbligatorio!")
        String titolo,
        @NotEmpty(message = "La descrizione è obbligatoria!")
        String descrizione,
        @NotEmpty(message = "La data è obbligatoria!")
        LocalDate data,
        @NotEmpty(message = "Il luogo è obbligatorio!")
        String luogo,
        @NotEmpty(message = "Il numero massimo di partecipanti è obbligatorio!")
        int numeroMaxPartecipanti
) {
}