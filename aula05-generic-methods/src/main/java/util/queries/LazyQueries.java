/*
 * Copyright (c) 2017, Miguel Gamboa
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package util.queries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Miguel Gamboa
 *         created on 15-03-2017
 */
public class LazyQueries {

    public static <T> Iterable<T> filter(Iterable<T> data, Predicate<T> p) {
        return () -> new IteratorFilter(data.iterator(), p);
    }

    public static <T, R> Iterable<R> map(Iterable<T> data, Function<T, R> mapper) {

        return null;
    }

    public static <T> Iterable<T> distinct(Iterable<T> data) {
        return null;
    }

    public static <T> int count(Iterable<T> data) {
        int size = 0;
        for (T item: data) {
            size++;
        }
        return size;
    }


}
