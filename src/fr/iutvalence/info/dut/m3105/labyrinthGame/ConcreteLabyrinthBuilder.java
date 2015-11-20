package fr.iutvalence.info.dut.m3105.labyrinthGame;

public class ConcreteLabyrinthBuilder implements LabyrinthBuilder {
	
	private int height, width;
	private Position exitPosition, forbiddenCellsPosition;
	
	
	
	public ConcreteLabyrinthBuilder(){
		
	}



	@Override
	public LabyrinthBuilder setHeigth(int height){
		this.height = height;
		return this;
	}



	@Override
	public LabyrinthBuilder setWidth(int width) {
		this.width = width;
		return this;
	}



	@Override
	public LabyrinthBuilder setExitPosition(Position exitPosition) {
		this.exitPosition = exitPosition;
		return this;
	}



	@Override
	public LabyrinthBuilder addForbiddenCellsPosition(
			Position forbiddenCellsPosition) {
		this.forbiddenCellsPosition = forbiddenCellsPosition;
		return this;
	}



	@Override
	public LabyrinthBuilder getLabyrinth(Labyrinth labyrinth) {
		// TODO Auto-generated method stub
		return this;
	}
	

}
