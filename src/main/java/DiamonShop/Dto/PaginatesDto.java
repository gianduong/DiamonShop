package DiamonShop.Dto;

public class PaginatesDto {
	private int currentPage, start, end, totalPage;
	private int limit;
	
	
	public PaginatesDto() {
		super();
	}

	

	public PaginatesDto(int currentPage, int start, int end, int totalPage, int limit) {
		super();
		this.currentPage = currentPage;
		this.start = start;
		this.end = end;
		this.totalPage = totalPage;
		this.limit = limit;
	}



	public int getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	public int getStart() {
		return start;
	}


	public void setStart(int start) {
		this.start = start;
	}


	public int getEnd() {
		return end;
	}


	public void setEnd(int end) {
		this.end = end;
	}


	public int getTotalPage() {
		return totalPage;
	}


	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}


	public int getLimit() {
		return limit;
	}


	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	
}
