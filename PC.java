package com;

public class PC {

	CPU cpu;
	HardDisk HD;
	
	void setCPU(CPU cpu){
		this.cpu=cpu;
		}
	void setHardDisk(HardDisk HD) {
		// TODO Auto-generated method stub

		this.HD=HD;
		}
//	void (){
		
//	}
	
	void show(){
		System.out.println("CPU速度:"+cpu.getSpeed());
		System.out.println("硬盘容量:"+HD.getAmount());
		System.out.println("CPU类型:"+cpu.getType());
	}

}
