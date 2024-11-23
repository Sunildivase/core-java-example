package com.eventmanagement.model;

public class Tickets {

   public String price;
   public String availableTickets;

   @Override
   public String toString() {
      return "Tickets{" +
              "price='" + price + '\'' +
              ", availableTickets='" + availableTickets + '\'' +
              '}';
   }
}
