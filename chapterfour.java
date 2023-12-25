// 4.2

public class chapterfour {
    public static void main(String[] args) {
    zippo("rattle", 13); // 1
    }

    public static void baffle(String blimp) {
        System.out.println(blimp); // 4
        zippo("ping", -5); // 5
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop"); //6
        } else {
            System.out.println("ik"); // 2
            baffle(quince); // 3
            System.out.println("boo-wa-ha-ha"); // 7
        }
    }
    
}

// 3. When zippo is used the first time the parameters are rattle and 13.
    // When baffle is used, the parameter is rattle.
    // When zippo is used again, the parameters are ping and -5.

// 4. ik, rattle, ping zoop, then boo-wa-ha-ha. Each is on a new line.

//4.3

// 2. No, I wug.
    //You wugga wug.
    //I wug.
    // Each time it goes back to main a new line is created.