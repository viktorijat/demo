package com.example.demo;

public class Ticket {
    private Stub stub = new Stub();

    private class Stub {
        public int number;
        public String venue;
    }

    public Ticket(int number, String venue) {
        stub.number = number;
        stub.venue = venue;
    }

    @Override
    public int hashCode() {
        return stub.number;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Ticket)) return false;
        Ticket t = (Ticket) other;
        return stub.number == t.stub.number && stub.venue.equals(t.stub.venue);
    }

    public static void main(String[] args) {
        Ticket t = new Ticket(2, "a");
        System.out.println(t.equals(new Ticket(2, "a")));

        Stub s = new Ticket(2, "a").new Stub();
        System.out.println(s.number + " " + s.venue);

        System.out.println(t.equals(s));
    }
}