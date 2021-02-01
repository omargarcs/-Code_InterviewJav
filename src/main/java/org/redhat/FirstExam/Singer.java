package org.redhat.FirstExam;

class Singer {
    public static String sing(){
        return "la";
    }
}

class Tenor extends Singer{ //ERROR "public"
    public static String sing(){
        return "fa";
    }

    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Singer();
        System.out.println(t.sing() + " " + s.sing());

    }

}
