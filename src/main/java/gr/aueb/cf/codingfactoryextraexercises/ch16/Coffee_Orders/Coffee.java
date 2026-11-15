package gr.aueb.cf.codingfactoryextraexercises.ch16.Coffee_Orders;

public class Coffee {
    private final String type;
    private final int sugar;

    private Coffee(Builder builder) {
        this.type = builder.type;
        this.sugar = builder.sugar;
    }

    public static class Builder {
        private final String type;
        private int sugar = 0;

        public Builder(String type) {
            this.type = type;
        }

        public Builder sugar(int sugar) {
            this.sugar = sugar;
            return this;
        }

        public Coffee build() {
            return new Coffee(this);
        }

    }
}
