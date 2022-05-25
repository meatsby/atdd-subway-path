package wooteco.subway.domain.farepolicy;

@FunctionalInterface
public interface FarePolicy {

    double SHORT_RANGE_THRESHOLD_DISTANCE = 10.0;
    double LONG_RANGE_THRESHOLD_DISTANCE = 50.0;
    int SHORT_RANGE_DISTANCE_RATE = 5;
    int LONG_RANGE_DISTANCE_RATE = 8;
    int MAX_SHORT_RATE = 8;
    int BASIC_FARE = 1250;
    int OVER_FARE = 100;

    int calculate(int distance);
}
