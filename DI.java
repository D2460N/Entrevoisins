package com.openclassrooms.entrevoisins.di;

import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.DummyNeighbourApiService;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;

import java.util.List;

/**
 * Dependency injector to get instance of services
 */
public class DI {

    private static NeighbourApiService service = new DummyNeighbourApiService() {
        @Override
        public Neighbour getSpecificNeighbour(Integer id) {
            return null;
        }

        @Override
        public List<Neighbour> getFavoriteNeighbours(List<Integer> ids) {
            return null;
        }
    };

    /**
     * Get an instance on @{@link NeighbourApiService}
     * @return
     */
    public static NeighbourApiService getNeighbourApiService() {
        return service;
    }

    /**
     * Get always a new instance on @{@link NeighbourApiService}. Useful for tests, so we ensure the context is clean.
     * @return
     */
    public static NeighbourApiService getNewInstanceApiService() {
        return new DummyNeighbourApiService() {
            @Override
            public Neighbour getSpecificNeighbour(Integer id) {
                return null;
            }

            @Override
            public List<Neighbour> getFavoriteNeighbours(List<Integer> ids) {
                return null;
            }
        };
    }
}
