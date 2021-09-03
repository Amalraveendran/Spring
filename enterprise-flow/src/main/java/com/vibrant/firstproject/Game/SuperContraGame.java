package com.vibrant.firstproject.Game;

public class SuperContraGame  implements  GamingConsole{
    @Override
        public void up()
        {
            System.out.println("jump Up");
        }
    @Override
        public void down()
        {
            System.out.println("bow Down");
        }
    @Override
        public void left()
        {
            System.out.println("run Left");
        }
    @Override
        public void right()
        {
            System.out.println("stop Right");
        }


}
