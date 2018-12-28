package org.tapestry.example.util;

import java.util.List;

import org.apache.tapestry5.grid.GridDataSource;
import org.apache.tapestry5.grid.SortConstraint;
import org.tapestry.example.model.dto.Celebrity;
import org.tapestry.example.model.management.IDataSource;

public class CelebritySource implements GridDataSource {
	
	private IDataSource dataSource;
	private List<Celebrity> selection;
	private int startIndex;
	
	public CelebritySource(IDataSource ds) {
		this.dataSource = ds;
	}

	@Override
	public int getAvailableRows() {
		return dataSource.getAllCelebrities().size();
	}

	@Override
	public void prepare(int startIndex, int endIndex, List<SortConstraint> sortConstraints) {
		System.out.println("prepare ... with startIndex "+startIndex);
		this.startIndex = startIndex;
		selection = dataSource.getRange(startIndex, endIndex);
		
	}

	@Override
	public Object getRowValue(int index) {
		
		return selection.get(index-startIndex);
	}

	@Override
	public Class getRowType() {
		return Celebrity.class;
	}

}
