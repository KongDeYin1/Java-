# Java第一次实验
#####   2020322102  孔德胤  计G202
## 1.实验内容 
  - 基本要求：完成教材p110 第四题关于PC、内存等模拟的程序。
  - 附加要求：
           1.类中定义不少于两个构造方法；
           2.每个类定义不少于2个属性，且属性的类型应该多样化；
           3.根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性；
           4.避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
           5.尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
                
## 2.实验设计
###  1.设置硬盘对象，运用public方法，用int 类型定义amount。
        public class HardDisk {	
	    int amount;
	    int getAmount(){
		return amount;
	}
  ### 2.设置CPU对象，运用public方法，用int类型定义speed,用string类型定义type。
        public class CPU {
	   int speed;	
	   String type;
	
	   int getSpeed(){
		return speed;
	}	
	   String getType(){
		return type;		
	}
### 3.核心方法
        void setCPU(CPU cpu){
		this.cpu=cpu;
		}
	void setHardDisk(HardDisk HD) {
		this.HD=HD;
		}
        void show(){
		System.out.println("CPUËÙ¶È:"+cpu.getSpeed());
		System.out.println("Ó²ÅÌÈÝÁ¿:"+HD.getAmount());
		System.out.println("CPUÀàÐÍ:"+cpu.getType());
	}
                
## 4.实验结果
                cpu.setSpeed 2200;
		cpu.setType  RISC;
		HD.setAmount 200; 
                
                
## 5.实验感想      
        1.通过这次实验学习到了public,private,default的不同
        2.练习了重构
        3.学习了构建方法
        4.学会了如何使用markdown
        
                
