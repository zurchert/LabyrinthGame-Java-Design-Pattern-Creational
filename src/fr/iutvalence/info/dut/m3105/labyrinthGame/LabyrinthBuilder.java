package fr.iutvalence.info.dut.m3105.labyrinthGame;

public interface LabyrinthBuilder {
	
	public abstract LabyrinthBuilder setHeigth(int height);
	
	public abstract LabyrinthBuilder setWidth(int width);
	
	
	public abstract LabyrinthBuilder setExitPosition(Position exitPosition);
	
	public abstract LabyrinthBuilder addForbiddenCellsPosition(Position forbiddenCellsPosition);
	
	public abstract LabyrinthBuilder getLabyrinth(Labyrinth labyrinth);
	

	

}
