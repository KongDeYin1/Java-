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
		System.out.println("CPU�ٶ�:"+cpu.getSpeed());
		System.out.println("Ӳ������:"+HD.getAmount());
		System.out.println("CPU����:"+cpu.getType());
	}

}
