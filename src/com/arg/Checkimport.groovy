package com.arg;



class Checkimport{
	def manager
	def workspace
	Checkimport(def m,def w){
	this.manager = m
	this.workspace = w
	}
	
	def checkname(){
	def name = "Rajesh"
	def myname = new Import(name)
	def gotname = myname.getname()
		if (gotname != null && workspace != null)
		{
			println("Name = "+gotname)
			println("Workspace = "+workspace)
			manager.buildSuccess()
		}
		else {
			manager.buildFailure()
		}
	}
}
