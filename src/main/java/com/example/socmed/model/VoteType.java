package com.example.socmed.model;

import java.util.Arrays;

public enum VoteType {
    UPVOTE(1), DOWNVOTE(-1);

//    private Integer direction;

    VoteType(Integer direction){}

//    public static VoteType lookup(int direction) {
//        return Arrays.stream(VoteType.values())
//                .filter(value -> value.getDirection().equals(direction))
//                        .findAny()
//                        .orElseThrow(() -> new SpringBluesException("Vote not found"));
//    }
//
//    public Integer getDirection() {
//        return direction;
//    }
}
