package com.sun.charpter1;

import java.util.Objects;

import static com.sun.charpter1.NyPizza.Size.SMALL;
import static com.sun.charpter1.Pizza.Topping.ONION;
import static com.sun.charpter1.Pizza.Topping.SAUSAGE;

public class NyPizza extends Pizza {

    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {

        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();

}
