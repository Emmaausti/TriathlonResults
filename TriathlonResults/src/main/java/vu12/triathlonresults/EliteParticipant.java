/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu12.triathlonresults;

/**
 *
 * @author EMMA
 */
public class EliteParticipant {
    private String sponsorName;

    public EliteParticipant(String name, String id, int swimmingTime, int cyclingTime, int runningTime, String sponsorName) {
       
        this.sponsorName = sponsorName;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public void displayDetails() {
        System.out.println("Sponsor: " + sponsorName);
    }
}  

