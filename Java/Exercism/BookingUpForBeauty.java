import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return LocalDateTime.now().isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatterDesc = DateTimeFormatter.ofPattern("EEEE, MMMM d, YYYY, 'at' h:mm a.");
        return "You have an appointment on " + formatterDesc.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        
        return LocalDate.of(2024,9,15);
    }
}
