package org.entities;

import java.sql.Time;
import java.util.*;

public class Train {
    private  String trainId;
    private  String traino;
    private  List<List<Integer>> seat;
    private  Map<String, Time> stationTimes;
    private  List<String> stations;
}
