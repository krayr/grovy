import com.arg.Import

class Checkimport{
	def manager
	Checkimport(def m,def w){
	this.manager = m
	this.workspace = w
	}
	
	def checkname(){
		def name = "Rajesh"
		def myname = new Import(name)
		def gotname = myname.getname()
		if (gotname != NULL && workspace != NULL)
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
