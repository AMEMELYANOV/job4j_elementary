package ru.job4j.map;

import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        Map<String, Integer> data = new HashMap<>();
        for (Info info : list) {
            if (data.containsKey(info.getCity())) {
                data.computeIfPresent(info.getCity(), (key, value) -> value + info.getRainfall());
            } else {
                data.putIfAbsent(info.getCity(), info.getRainfall());
            }
        }
        for (Map.Entry<String, Integer> element : data.entrySet()) {
            rsl.add(new Info(element.getKey(), element.getValue()));
        }
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}