package com.company;

import java.util.Scanner;

/**
 * Created by BillyTsakalios on 11/21/16.
 */
public class Room {

    public int room_num;
    int prev_room;
    int left_room;
    int right_room;
    boolean event = true;
    Monster roomMonster;

    String greeting;
    String direction = "Where u goin: ";
    String response;



    public Room(int room_num,  int left_room, int right_room, String greeting) {
        this.room_num = room_num;
        this.left_room = left_room;
        this.right_room = right_room;
        this.event = false;
        this.greeting = greeting;
    }


    /* public Room(int room_num, int left_room, int right_room, Monster roomMonster, String greeting) {
        this.room_num = room_num;
        this.left_room = left_room;
        this.right_room = right_room;
        this.roomMonster = roomMonster;
        this.greeting = greeting;
    }*/



    //Ask for dir

    //input scanner
    Scanner in = new Scanner(System.in);

    //Ask user what direction they are going and return cleaned response
    private void prompt() {
        System.out.print(direction);
        // standardize response/check if they did it wrong and ask again
        response = in.nextLine();


    }
    //return room num based on their response
    private int destination(){
        if (response.equals("l")){
            return left_room;
        }
        else if (response.equals("r")){
            return right_room;
        }
        else if (response.equals("b")){
            return prev_room;
        }
        else return -1;
    }

    public int start(){
        System.out.println(greeting);
        if (event == true){
            //fight monster
        }
        prompt();
        return destination();

    }

    public void set_prev_room(int prev_room){this.prev_room=prev_room;}
}
