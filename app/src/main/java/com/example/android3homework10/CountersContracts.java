package com.example.android3homework10;

public class CountersContracts {
    interface CounterView {
        void updateCounter(int count);

        void tenCount();

        void greenText();
    }

    interface Presenter {
            void increment();

            void attachView(CounterView counterView);

            void decrease();

            void change();
        }
}
