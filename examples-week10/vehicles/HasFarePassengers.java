package vehicles;

public interface HasFarePassengers extends HasPassengers {
    double getFare(String destination);
}
