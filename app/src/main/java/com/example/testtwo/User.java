package com.example.testtwo;

class User {

// \"id\": 2558050,\n" +
//         "      \"slug\": \"d99a7dfae9e4\",\n" +
//         "      \"nickname\": \"阿栈\",\n" +
//         "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/2558050/7761b285-2805-4534-9870-ba7dcc7538ec.jpg\",\n" +
//         "      \"total_likes_count\": 1559,\n" +
//         "      \"total_wordage\": 472764,\n" +
//         "      \"is_following_user\": false\n" +

//    private int id;
//    private String sid;
//    private String sage;
//    private String avatar_source;
//    private long total_likes_count;
//    private long total_wordage;
//    private boolean is_following_user;
    private Long id;
    private String sid;
    private String sname;
    private Integer sage;
    private Integer ssex;
    private String sremakers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public Integer getSsex() {
        return ssex;
    }

    public void setSsex(Integer ssex) {
        this.ssex = ssex;
    }

    public String getSremakers() {
        return sremakers;
    }

    public void setSremakers(String sremakers) {
        this.sremakers = sremakers;
    }
}