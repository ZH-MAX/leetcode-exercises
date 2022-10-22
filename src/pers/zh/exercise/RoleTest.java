package pers.zh.exercise;

public class RoleTest {
    public static void main(String[] args) {
        //创建两个对象
        Role r1 = new Role("乔峰",100);
        Role r2 = new Role("鸠摩智",100);

        //开始格斗，回合制游戏
        while (true){
            //r1攻击r2
            r1.attack(r2);
            //判断r2剩余的血量
            if (r2.getBlood() == 0){
                System.out.println(r1.getName()+"K.O了"+r2.getName());
                break;
            }

            //r2攻击r1
            r2.attack(r1);
            //判断r1剩余的血量
            if (r1.getBlood() == 0){
                System.out.println(r2.getName()+"K.O了"+r1.getName());
                break;
            }

        }
    }
}
