package spittr.data;

import java.util.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import spittr.model.Spittle;

@Component
public class SpittleRepositoryImp implements SpittleRepository{

	ArrayList<Spittle> listOfSpittle;
	
	public SpittleRepositoryImp(){
		//listOfSpittle.add(createSpittleList(20)); 
		listOfSpittle=createSpittleList(20);
	}
	
	@Override
	public List<Spittle> findSpittles(long max, int count) {
		return listOfSpittle;
	}

	@Override
	public Spittle findOne(long numberOfSplit) {
		return listOfSpittle.get((int)numberOfSplit);
	}

	@Override
	public void save(Spittle spittle) {
		listOfSpittle.add(spittle);		
	}

	private ArrayList<Spittle> createSpittleList(int count) {
		ArrayList<Spittle> spittles = new ArrayList<Spittle>();
		for (int i = 0; i < count; i++) {
			spittles.add(new Spittle("Spittle " + i, new Date()));
		}
		return spittles;
	}
	
	
}
