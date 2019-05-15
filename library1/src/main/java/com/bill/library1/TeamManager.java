package com.bill.library1;

import com.bill.librarybase.Person;

import java.util.ArrayList;
import java.util.List;

public class TeamManager {

    private static TeamManager teamManagerInstance;

    private TeamManager() {
        init();
    }

    public static synchronized TeamManager getInstance() {
        if (teamManagerInstance == null) {
            teamManagerInstance = new TeamManager();
        }
        return teamManagerInstance;
    }

    private List<Person> mPersonList = new ArrayList<>();

    private void init() {
        mPersonList.add(new Person("Bill", 28));
        mPersonList.add(new Person("AAA", 29));
        mPersonList.add(new Person("ZZZ", 30));
    }

    public List<Person> getPersonList() {
        return mPersonList;
    }
}
