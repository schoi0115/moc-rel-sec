package com.moc2;
public class Model {
	private int modelId;
	private int modelGrade;
	private double remunerationPerDay;
	private static double[] modelRemuneration = {25000.0,30000.0,45000.0,57500.0,100000.0,150000.0};
	
	//To Trainees
	public Model(int modelId,double remunerationPerDay) {
		
        //Implement your code here
        this.modelId = modelId;
        this.remunerationPerDay = remunerationPerDay;
        modelGrade = modelId / 10000;
        // System.out.println(modelGrade);
        // System.out.println(validateRemunerationPerDay());
	}
	
	@Override
	public String toString() {
		return "Model(modelId: " + this.modelId + ", remunerationPerDay: "
				+ this.remunerationPerDay + ")";
	}
	
	public int getModelId() {
		return modelId;
	}
	public int getModelGrade() {
		return modelGrade;
	}
	public double getRemunerationPerDay() {
		return remunerationPerDay;
	}
	public static double[] getModelRemuneration() {
		return Model.modelRemuneration;
	}
	
	//To Trainees
	public Boolean validateRemunerationPerDay() {
        //Implement your logic here
        boolean checker = false;

        double min = modelRemuneration[modelGrade -1];
        double max = modelRemuneration[modelGrade];
        if (remunerationPerDay > min){
            checker = true;
        } else if (remunerationPerDay < max){
            checker = false;
        }       

		//Change the return statement accordingly	
        return checker;
        
	}
}