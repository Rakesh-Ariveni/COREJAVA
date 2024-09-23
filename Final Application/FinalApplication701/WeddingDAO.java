package com.Evergent.CoreJava.Rakesh.FinalApplication701;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class WeddingDAO {
    public int createWedding(WeddingBean wedding) {
        try (Connection con = WeddingDBConnection.getConnection()) {
            String sql = "INSERT INTO weddings (wedding_date, bride_name, groom_name, venue, estimated_guests) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, wedding.getWeddingDate());
            pstmt.setString(2, wedding.getBrideName());
            pstmt.setString(3, wedding.getGroomName());
            pstmt.setString(4, wedding.getVenue());
            pstmt.setInt(5, wedding.getEstimatedGuests());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public WeddingBean getWedding(String weddingDate) {
        try (Connection con = WeddingDBConnection.getConnection()) {
            String sql = "SELECT * FROM weddings WHERE wedding_date = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, weddingDate);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                WeddingBean wedding = new WeddingBean();
                wedding.setWeddingDate(rs.getString("wedding_date"));
                wedding.setBrideName(rs.getString("bride_name"));
                wedding.setGroomName(rs.getString("groom_name"));
                wedding.setVenue(rs.getString("venue"));
                wedding.setEstimatedGuests(rs.getInt("estimated_guests"));
                return wedding;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getGuests(String weddingDate) {
        List<String> guests = new ArrayList<>();
        try (Connection con = WeddingDBConnection.getConnection()) {
            String sql = "SELECT guest_name FROM guests WHERE wedding_date = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, weddingDate);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                guests.add(rs.getString("guest_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return guests;
    }

    public int addGuest(String weddingDate, String guestName) {
        try (Connection con = WeddingDBConnection.getConnection()) {
            String sql = "INSERT INTO guests (wedding_date, guest_name) VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, weddingDate);
            pstmt.setString(2, guestName);
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}