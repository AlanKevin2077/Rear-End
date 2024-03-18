/*设计士兵与武器AK47类，并完成前进、进攻、发射子弹、装载子弹的功能*/

             //例子1
             
package cn.cxy.exec;
/*
 * 封装：
 *     士兵相关的属性数据、逻辑运算方法，
 *     封装成一个士兵“类”组件
 */
import java.util.Random;
public class Soldier {
	//成员变量，属性变量
	int id; //默认值0
	int blood = 100;
	AK47 a;//默认 null 值

	//成员方法
	public void go() {
		//this是一个特殊引用
		//引用“当前对象”的地址
		//当前对象：谁调用就是谁
		//可以省略，缺省存在
		System.out.println(this.id+"号士兵前进");
	}

	public void attack() {
		if(blood == 0) {
			System.out.println("这是"+id+"号士兵的尸体");
			return;//方法结束
		}
		System.out.println(id+"号士兵进攻");
		if(a != null) {
			a.fire();//调用枪发射子弹
		}
		//模拟进攻掉血
		//随机的减血量
		int d = new Random().nextInt(10);
		blood -= d;    
		if(blood < 0) {//不允许负数血量
			blood = 0;
		}
		System.out.println("血量："+blood);
		//血量是0
		if(blood == 0) {
			System.out.println(id+"号士兵阵亡");
		}
	}
}




             //例子2
             
 // 武器类
class AK47 {
    private int ammo; // 子弹数量

    public AK47() {
        this.ammo = 30; // 默认子弹数量
    }

    public void fire() {
        if (ammo > 0) {
            ammo--; // 发射子弹，子弹数量减一
            System.out.println("发射子弹！剩余子弹：" + ammo);
        } else {
            System.out.println("没有子弹了！");
        }
    }

    public void reload(int bullets) {
        ammo += bullets; // 装载子弹
        System.out.println("装载子弹！当前子弹数量：" + ammo);
    }
}

// 士兵类
class Soldier {
    private String name;
    private AK47 weapon;

    public Soldier(String name) {
        this.name = name;
        this.weapon = new AK47(); // 士兵初始装备AK47
    }

    public void advance() {
        System.out.println(name + " 正在前进...");
    }

    public void attack() {
        weapon.fire(); // 士兵进攻，即发射子弹
    }

    public void reloadWeapon(int bullets) {
        weapon.reload(bullets); // 士兵装载子弹
    }
}

// 测试代码
public class Main {
    public static void main(String[] args) {
        Soldier soldier = new Soldier("士兵1");

        // 士兵前进
        soldier.advance();

        // 士兵进攻，发射子弹
        soldier.attack();

        // 士兵装载子弹
        soldier.reloadWeapon(10);

        // 再次士兵进攻，发射子弹
        soldier.attack();
    }
}
            
