package Generics.Part1.Ex1;

import java.util.PriorityQueue;

public class AppointDoctor {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();

        Doctor Cardiologist = new Doctor("Casualty",1);
        Doctor Gynecologist = new Doctor("Surgery",2);
        Doctor Paediatric = new Doctor("Routine Check-up",3);

        pq.offer(Cardiologist);
        pq.offer(Gynecologist);
        pq.offer(Paediatric);

        while (!pq.isEmpty()) {
            System.out.println("\nAppointing doctors based on their priorities:");
            System.out.println("******************************************");

            Doctor doctor = ((Doctor) pq.remove());

            System.out.println(doctor.toString());
        }
    }
}
