package br.com.uol.pagseguro.example;

import br.com.uol.pagseguro.domain.AccountCredentials;
import br.com.uol.pagseguro.exception.PagSeguroServiceException;
import br.com.uol.pagseguro.properties.PagSeguroConfig;
import br.com.uol.pagseguro.service.SessionService;

/**
 * Class with a main method to illustrate the usage of the SessionService to create Session to Direct Payment
 */
public class CreatePaymentSession {

    public static void main(String[] args) {
        try {
            final AccountCredentials accountCredentials = PagSeguroConfig.getAccountCredentials();

            final String sessionId = SessionService.createPaymentSession(accountCredentials);

            System.out.println("Sessão: " + sessionId);
        } catch (PagSeguroServiceException e) {
            System.err.println(e.getMessage());
        }
    }

}
