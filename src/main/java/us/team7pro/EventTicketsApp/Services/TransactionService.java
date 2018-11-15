package us.team7pro.EventTicketsApp.Services;

import us.team7pro.EventTicketsApp.Models.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> findByUserID(int userID);
    List<Transaction> findByUserIDAndStatus(int userID, boolean status);
    Transaction findByUserIDAndEventID(int userID, int eventID);
    Transaction findByTransactionID(int transactionID);
    void delete(Transaction t);
    void addToCart(int userID, int eventID);
}
