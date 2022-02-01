package winterproject.service;

import winterproject.domain.Cafe;

import java.util.List;

public interface GetCafeList {

    List<Cafe> getCafeByLocation(String location);
}
