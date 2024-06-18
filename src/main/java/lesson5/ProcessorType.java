package lesson5;

public enum ProcessorType {
    BIT_32("x86") {
        @Override
        public String getDescription() {
            return "32 bit cpu description";
        }
    },
    BIT_64("amd64") {
        @Override
        public String getDescription() {
            return "64 bit cpu description";
        }
    };

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();

}
