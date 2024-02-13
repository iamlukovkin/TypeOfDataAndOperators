public enum MoveDestination {
    UP,
    DOWN,
    LEFT,
    RIGHT,
    END;

    public static MoveDestination getDestination(String userAnswer) {
        MoveDestination destination;
        switch (userAnswer.toLowerCase()) {
            case "up" -> destination = UP;
            case "down" -> destination = DOWN;
            case "left" -> destination = LEFT;
            case "right" -> destination = RIGHT;
            case "exit" -> destination = END;
            default -> destination = null;
        }
        return destination;
    }
}
