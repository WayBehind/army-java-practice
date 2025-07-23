public enum Stance {
    DEFENSIVE("in Defensive stace"),
    OFFENSIVE("in Offensive stace"),
    RESERVE("in Reserve");
    private final String description;

    Stance(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

