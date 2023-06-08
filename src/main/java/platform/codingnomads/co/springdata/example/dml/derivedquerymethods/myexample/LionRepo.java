package platform.codingnomads.co.springdata.example.dml.derivedquerymethods.myexample;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface
LionRepo extends JpaRepository<Lion, Long> {


    //////////////// INTRODUCER VARIATIONS ////////////////

    List<Lion> findByName(String name);
    List<Lion> queryByName(String name);
    List<Lion> readByName(String name);
    List<Lion> getByName(String name);

    int countByNameIs(String name);

    //////////////// SIMILARITY KEYWORDS ////////////////

    //find all plants with names starting with namePrefix
    List<Lion> findByNameStartingWith(String namePrefix);

    //find all plants with names ending in nameSuffix
    List<Lion> findByNameEndingWith(String nameSuffix);

    //find all plants with names containing pattern
    List<Lion> findByNameContaining(String pattern);

    //////////////// EQUALITY KEYWORDS ////////////////

    //Using Is vs. findByName(String name)
    List<Lion> findByNameIs(String name);

    //IsNot
    List<Lion> findByNameIsNot(String name);

    //IsNull
    List<Lion> findBySunTypeIsNull();

    //IsNotNull
    List<Lion> findBySunTypeIsNotNull();

    //use IsTrue and IsFalse instead of findByFruitBearing(boolean fruitBearing);
    List<Lion> findByFruitBearingIsTrue();
    List<Lion> findByFruitBearingIsFalse();

    //////////////// MORE EQUALITY KEYWORDS ////////////////

    List<Lion> findByNumDaysTillRipeFruitLessThan(int numDays);

    List<Lion> findByNumDaysTillRipeFruitLessThanEqual(int numDays);

    List<Lion> findByNumDaysTillRipeFruitGreaterThan(int numDays);

    List<Lion> findByNumDaysTillRipeFruitGreaterThanEqual(int numDays);

    //////////////// NESTED PROPERTY CHARACTER ////////////////

    //find plants with a favorite soil type with pHs less than a passed in value
    List<Lion> findByFavoriteSoilType_phLessThan(long ph);

    //find plants who's favorite soil is dry
    List<Lion> findByFavoriteSoilType_dryIsTrue();

    //find plants with a certain soil type identified by its ID
    List<Lion> findByFavoriteSoilType_id(long soilTypeId);

    //////////////// LIMITING KEYWORDS ////////////////

    //find the first dry soil type plant
    Lion findFirstByCatType_nameIsTrue();
    Lion getTopByFavoriteSoilType_dryIsTrue();

    //find the last 5 plants based on soil type pH less than the passed in pH(unsorted)
    List<Lion> findLast5ByFavoriteSoilType_phLessThan(long ph);

    //find the first 20 plants based on soil type pH greater than or equal to the passed in pH(unsorted)
    List<Lion> findTop20ByFavoriteSoilType_phGreaterThanEqual(long ph);


    //////////////// DISTINCT KEYWORD ////////////////

    //distinct with no limit keyword
    List<Lion> findDistinctByFavoriteSoilType_phLessThan(long ph);

    //distinct before limit keyword
    List<Lion> findDistinctLast5ByFavoriteSoilType_phLessThan(long ph);

    //distinct after limit keyword
    List<Lion> findLastDistinct5ByFavoriteSoilType_phLessThan(long ph);


    //////////////// PAGING AND SORTING ////////////////

    //search plant names containing a pattern on a page by page basis
    Page<Lion> findByNameContaining(String pattern, Pageable pageable);

    //////////////// MULTIPLE CONDITIONS ////////////////

    List<Lion> findByNameContainingAndFavoriteSoilType_Name(String partialPlantName, String soilTypeName);

    List<Lion> findByNumDaysTillAdultAndCatType_color(boolean numDaysTillAdult, boolean color);

}
