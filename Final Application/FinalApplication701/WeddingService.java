package com.Evergent.CoreJava.Rakesh.FinalApplication701;




import java.util.List;

public class WeddingService {
    private WeddingDAO weddingDAO = new WeddingDAO();

    public int createWedding(WeddingBean wedding) {
        return weddingDAO.createWedding(wedding);
    }

    public WeddingBean getWedding(String weddingDate) {
        return weddingDAO.getWedding(weddingDate);
    }

    public List<String> getGuests(String weddingDate) {
        return weddingDAO.getGuests(weddingDate);
    }

    public int addGuest(String weddingDate, String guestName) {
        return weddingDAO.addGuest(weddingDate, guestName);
    }
}